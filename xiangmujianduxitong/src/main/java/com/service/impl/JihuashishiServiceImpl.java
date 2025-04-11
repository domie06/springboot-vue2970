package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.JihuashishiDao;
import com.entity.JihuashishiEntity;
import com.service.JihuashishiService;
import com.entity.view.JihuashishiView;

/**
 * 项目计划实施 服务实现类
 */
@Service("jihuashishiService")
@Transactional
public class JihuashishiServiceImpl extends ServiceImpl<JihuashishiDao, JihuashishiEntity> implements JihuashishiService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<JihuashishiView> page =new Query<JihuashishiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
