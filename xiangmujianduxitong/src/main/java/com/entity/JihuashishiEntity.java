package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 项目计划实施
 *
 * @author 
 * @email
 */
@TableName("jihuashishi")
public class JihuashishiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JihuashishiEntity() {

	}

	public JihuashishiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Jihuashishi{" +
            "id=" + id +
            ", xueshengId=" + xueshengId +
            ", xiangmuId=" + xiangmuId +
            ", jihuashishiName=" + jihuashishiName +
            ", jihuashishiTypes=" + jihuashishiTypes +
            ", jihuashishiContent=" + jihuashishiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
