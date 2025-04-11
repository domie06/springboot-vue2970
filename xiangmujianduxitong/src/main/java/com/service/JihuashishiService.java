package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JihuashishiEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 项目计划实施 服务类
 */
public interface JihuashishiService extends IService<JihuashishiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}