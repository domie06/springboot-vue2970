package com.entity.vo;

import com.entity.JihuashishiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 项目计划实施
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jihuashishi")
public class JihuashishiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "xuesheng_id")
    private Integer xueshengId;


    /**
     * 项目
     */

    @TableField(value = "xiangmu_id")
    private Integer xiangmuId;


    /**
     * 计划实施名称
     */

    @TableField(value = "jihuashishi_name")
    private String jihuashishiName;


    /**
     * 计划实施类型
     */

    @TableField(value = "jihuashishi_types")
    private Integer jihuashishiTypes;


    /**
     * 项目计划实施详情
     */

    @TableField(value = "jihuashishi_content")
    private String jihuashishiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：项目
	 */
    public Integer getXiangmuId() {
        return xiangmuId;
    }


    /**
	 * 获取：项目
	 */

    public void setXiangmuId(Integer xiangmuId) {
        this.xiangmuId = xiangmuId;
    }
    /**
	 * 设置：计划实施名称
	 */
    public String getJihuashishiName() {
        return jihuashishiName;
    }


    /**
	 * 获取：计划实施名称
	 */

    public void setJihuashishiName(String jihuashishiName) {
        this.jihuashishiName = jihuashishiName;
    }
    /**
	 * 设置：计划实施类型
	 */
    public Integer getJihuashishiTypes() {
        return jihuashishiTypes;
    }


    /**
	 * 获取：计划实施类型
	 */

    public void setJihuashishiTypes(Integer jihuashishiTypes) {
        this.jihuashishiTypes = jihuashishiTypes;
    }
    /**
	 * 设置：项目计划实施详情
	 */
    public String getJihuashishiContent() {
        return jihuashishiContent;
    }


    /**
	 * 获取：项目计划实施详情
	 */

    public void setJihuashishiContent(String jihuashishiContent) {
        this.jihuashishiContent = jihuashishiContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
