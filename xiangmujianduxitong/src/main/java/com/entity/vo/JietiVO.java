package com.entity.vo;

import com.entity.JietiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 项目结题
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jieti")
public class JietiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
