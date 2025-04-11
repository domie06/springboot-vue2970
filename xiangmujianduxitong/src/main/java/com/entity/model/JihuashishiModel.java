package com.entity.model;

import com.entity.JihuashishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 项目计划实施
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JihuashishiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 项目
     */
    private Integer xiangmuId;


    /**
     * 计划实施名称
     */
    private String jihuashishiName;


    /**
     * 计划实施类型
     */
    private Integer jihuashishiTypes;


    /**
     * 项目计划实施详情
     */
    private String jihuashishiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：项目
	 */
    public Integer getXiangmuId() {
        return xiangmuId;
    }


    /**
	 * 设置：项目
	 */
    public void setXiangmuId(Integer xiangmuId) {
        this.xiangmuId = xiangmuId;
    }
    /**
	 * 获取：计划实施名称
	 */
    public String getJihuashishiName() {
        return jihuashishiName;
    }


    /**
	 * 设置：计划实施名称
	 */
    public void setJihuashishiName(String jihuashishiName) {
        this.jihuashishiName = jihuashishiName;
    }
    /**
	 * 获取：计划实施类型
	 */
    public Integer getJihuashishiTypes() {
        return jihuashishiTypes;
    }


    /**
	 * 设置：计划实施类型
	 */
    public void setJihuashishiTypes(Integer jihuashishiTypes) {
        this.jihuashishiTypes = jihuashishiTypes;
    }
    /**
	 * 获取：项目计划实施详情
	 */
    public String getJihuashishiContent() {
        return jihuashishiContent;
    }


    /**
	 * 设置：项目计划实施详情
	 */
    public void setJihuashishiContent(String jihuashishiContent) {
        this.jihuashishiContent = jihuashishiContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
