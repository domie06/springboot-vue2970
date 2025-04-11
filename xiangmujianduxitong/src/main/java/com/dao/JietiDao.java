package com.dao;

import com.entity.JietiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JietiView;

/**
 * 项目结题 Dao 接口
 *
 * @author 
 */
public interface JietiDao extends BaseMapper<JietiEntity> {

   List<JietiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
