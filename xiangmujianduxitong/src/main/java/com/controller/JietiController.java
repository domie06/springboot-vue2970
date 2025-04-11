
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 项目结题
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/jieti")
public class JietiController {
    private static final Logger logger = LoggerFactory.getLogger(JietiController.class);

    @Autowired
    private JietiService jietiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private JiaoshiService jiaoshiService;
    @Autowired
    private XiangmuService xiangmuService;

    @Autowired
    private XueshengService xueshengService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("学生".equals(role))
            params.put("xueshengId",request.getSession().getAttribute("userId"));
        else if("教师".equals(role))
            params.put("jiaoshiId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = jietiService.queryPage(params);

        //字典表数据转换
        List<JietiView> list =(List<JietiView>)page.getList();
        for(JietiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JietiEntity jieti = jietiService.selectById(id);
        if(jieti !=null){
            //entity转view
            JietiView view = new JietiView();
            BeanUtils.copyProperties( jieti , view );//把实体数据重构到view中

                //级联表
                JiaoshiEntity jiaoshi = jiaoshiService.selectById(jieti.getJiaoshiId());
                if(jiaoshi != null){
                    BeanUtils.copyProperties( jiaoshi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setJiaoshiId(jiaoshi.getId());
                }
                //级联表
                XiangmuEntity xiangmu = xiangmuService.selectById(jieti.getXiangmuId());
                if(xiangmu != null){
                    BeanUtils.copyProperties( xiangmu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "jiaoshiId"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setXiangmuId(xiangmu.getId());
                    view.setXiangmuJiaoshiId(xiangmu.getJiaoshiId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JietiEntity jieti, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jieti:{}",this.getClass().getName(),jieti.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("教师".equals(role))
            jieti.setJiaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<JietiEntity> queryWrapper = new EntityWrapper<JietiEntity>()
            .eq("xiangmu_id", jieti.getXiangmuId())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JietiEntity jietiEntity = jietiService.selectOne(queryWrapper);
        if(jietiEntity==null){
            jieti.setInsertTime(new Date());
            jieti.setCreateTime(new Date());
            jietiService.insert(jieti);
            return R.ok();
        }else {
            return R.error(511,"该项目已经结题过了");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JietiEntity jieti, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,jieti:{}",this.getClass().getName(),jieti.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("教师".equals(role))
//            jieti.setJiaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<JietiEntity> queryWrapper = new EntityWrapper<JietiEntity>()
            .notIn("id",jieti.getId())
            .andNew()
            .eq("xiangmu_id", jieti.getXiangmuId())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JietiEntity jietiEntity = jietiService.selectOne(queryWrapper);
        if(jietiEntity==null){
            jietiService.updateById(jieti);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"该项目已经结题过了");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        jietiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<JietiEntity> jietiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            JietiEntity jietiEntity = new JietiEntity();
//                            jietiEntity.setJiaoshiId(Integer.valueOf(data.get(0)));   //教师 要改的
//                            jietiEntity.setXiangmuId(Integer.valueOf(data.get(0)));   //项目 要改的
//                            jietiEntity.setJeitiTime(new Date(data.get(0)));          //结题时间 要改的
//                            jietiEntity.setJietiContent("");//照片
//                            jietiEntity.setYaojiaoJingfei(data.get(0));                    //要交经费 要改的
//                            jietiEntity.setJietiTypes(Integer.valueOf(data.get(0)));   //是否已缴 要改的
//                            jietiEntity.setInsertTime(date);//时间
//                            jietiEntity.setCreateTime(date);//时间
                            jietiList.add(jietiEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        jietiService.insertBatch(jietiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
