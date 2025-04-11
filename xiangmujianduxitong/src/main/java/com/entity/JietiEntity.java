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
 * 项目结题
 *
 * @author 
 * @email
 */
@TableName("jieti")
public class JietiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JietiEntity() {

	}

	public JietiEntity(T t) {
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
     * 教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 项目
     */
    @TableField(value = "xiangmu_id")

    private Integer xiangmuId;


    /**
     * 结题时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "jeiti_time")

    private Date jeitiTime;


    /**
     * 项目结题详情
     */
    @TableField(value = "jieti_content")

    private String jietiContent;


    /**
     * 要交经费
     */
    @TableField(value = "yaojiao_jingfei")

    private Double yaojiaoJingfei;


    /**
     * 是否已缴
     */
    @TableField(value = "jieti_types")

    private Integer jietiTypes;


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
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
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
	 * 设置：结题时间
	 */
    public Date getJeitiTime() {
        return jeitiTime;
    }


    /**
	 * 获取：结题时间
	 */

    public void setJeitiTime(Date jeitiTime) {
        this.jeitiTime = jeitiTime;
    }
    /**
	 * 设置：项目结题详情
	 */
    public String getJietiContent() {
        return jietiContent;
    }


    /**
	 * 获取：项目结题详情
	 */

    public void setJietiContent(String jietiContent) {
        this.jietiContent = jietiContent;
    }
    /**
	 * 设置：要交经费
	 */
    public Double getYaojiaoJingfei() {
        return yaojiaoJingfei;
    }


    /**
	 * 获取：要交经费
	 */

    public void setYaojiaoJingfei(Double yaojiaoJingfei) {
        this.yaojiaoJingfei = yaojiaoJingfei;
    }
    /**
	 * 设置：是否已缴
	 */
    public Integer getJietiTypes() {
        return jietiTypes;
    }


    /**
	 * 获取：是否已缴
	 */

    public void setJietiTypes(Integer jietiTypes) {
        this.jietiTypes = jietiTypes;
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
        return "Jieti{" +
            "id=" + id +
            ", jiaoshiId=" + jiaoshiId +
            ", xiangmuId=" + xiangmuId +
            ", jeitiTime=" + jeitiTime +
            ", jietiContent=" + jietiContent +
            ", yaojiaoJingfei=" + yaojiaoJingfei +
            ", jietiTypes=" + jietiTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
