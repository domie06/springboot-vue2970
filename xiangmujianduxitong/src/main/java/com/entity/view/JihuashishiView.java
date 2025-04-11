package com.entity.view;

import com.entity.JihuashishiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 项目计划实施
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jihuashishi")
public class JihuashishiView extends JihuashishiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 计划实施类型的值
		*/
		private String jihuashishiValue;



		//级联表 xiangmu
			/**
			* 项目 的 学生
			*/
			private Integer xiangmuXueshengId;
			/**
			* 项目 的 老师
			*/
			private Integer xiangmuJiaoshiId;
			/**
			* 项目编号
			*/
			private String xiangmuUuidNumber;
			/**
			* 项目名称
			*/
			private String xiangmuName;
			/**
			* 项目类型
			*/
			private Integer xiangmuTypes;
				/**
				* 项目类型的值
				*/
				private String xiangmuValue;
			/**
			* 所需经费
			*/
			private Double xiangmuJingfei;
			/**
			* 项目详情
			*/
			private String xiangmuContent;
			/**
			* 审核状态
			*/
			private Integer xiangmuYesnoTypes;
				/**
				* 审核状态的值
				*/
				private String xiangmuYesnoValue;
			/**
			* 审核意见
			*/
			private String xiangmuYesnoText;
			/**
			* 逻辑删除
			*/
			private Integer xiangmuDelete;

		//级联表 xuesheng
			/**
			* 学生姓名
			*/
			private String xueshengName;
			/**
			* 学生手机号
			*/
			private String xueshengPhone;
			/**
			* 学生身份证号
			*/
			private String xueshengIdNumber;
			/**
			* 学生头像
			*/
			private String xueshengPhoto;
			/**
			* 电子邮箱
			*/
			private String xueshengEmail;

	public JihuashishiView() {

	}

	public JihuashishiView(JihuashishiEntity jihuashishiEntity) {
		try {
			BeanUtils.copyProperties(this, jihuashishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 计划实施类型的值
			*/
			public String getJihuashishiValue() {
				return jihuashishiValue;
			}
			/**
			* 设置： 计划实施类型的值
			*/
			public void setJihuashishiValue(String jihuashishiValue) {
				this.jihuashishiValue = jihuashishiValue;
			}

















				//级联表的get和set xiangmu
					/**
					* 获取：项目 的 学生
					*/
					public Integer getXiangmuXueshengId() {
						return xiangmuXueshengId;
					}
					/**
					* 设置：项目 的 学生
					*/
					public void setXiangmuXueshengId(Integer xiangmuXueshengId) {
						this.xiangmuXueshengId = xiangmuXueshengId;
					}

					/**
					* 获取：项目 的 老师
					*/
					public Integer getXiangmuJiaoshiId() {
						return xiangmuJiaoshiId;
					}
					/**
					* 设置：项目 的 老师
					*/
					public void setXiangmuJiaoshiId(Integer xiangmuJiaoshiId) {
						this.xiangmuJiaoshiId = xiangmuJiaoshiId;
					}

					/**
					* 获取： 项目编号
					*/
					public String getXiangmuUuidNumber() {
						return xiangmuUuidNumber;
					}
					/**
					* 设置： 项目编号
					*/
					public void setXiangmuUuidNumber(String xiangmuUuidNumber) {
						this.xiangmuUuidNumber = xiangmuUuidNumber;
					}
					/**
					* 获取： 项目名称
					*/
					public String getXiangmuName() {
						return xiangmuName;
					}
					/**
					* 设置： 项目名称
					*/
					public void setXiangmuName(String xiangmuName) {
						this.xiangmuName = xiangmuName;
					}
					/**
					* 获取： 项目类型
					*/
					public Integer getXiangmuTypes() {
						return xiangmuTypes;
					}
					/**
					* 设置： 项目类型
					*/
					public void setXiangmuTypes(Integer xiangmuTypes) {
						this.xiangmuTypes = xiangmuTypes;
					}


						/**
						* 获取： 项目类型的值
						*/
						public String getXiangmuValue() {
							return xiangmuValue;
						}
						/**
						* 设置： 项目类型的值
						*/
						public void setXiangmuValue(String xiangmuValue) {
							this.xiangmuValue = xiangmuValue;
						}
					/**
					* 获取： 所需经费
					*/
					public Double getXiangmuJingfei() {
						return xiangmuJingfei;
					}
					/**
					* 设置： 所需经费
					*/
					public void setXiangmuJingfei(Double xiangmuJingfei) {
						this.xiangmuJingfei = xiangmuJingfei;
					}
					/**
					* 获取： 项目详情
					*/
					public String getXiangmuContent() {
						return xiangmuContent;
					}
					/**
					* 设置： 项目详情
					*/
					public void setXiangmuContent(String xiangmuContent) {
						this.xiangmuContent = xiangmuContent;
					}
					/**
					* 获取： 审核状态
					*/
					public Integer getXiangmuYesnoTypes() {
						return xiangmuYesnoTypes;
					}
					/**
					* 设置： 审核状态
					*/
					public void setXiangmuYesnoTypes(Integer xiangmuYesnoTypes) {
						this.xiangmuYesnoTypes = xiangmuYesnoTypes;
					}


						/**
						* 获取： 审核状态的值
						*/
						public String getXiangmuYesnoValue() {
							return xiangmuYesnoValue;
						}
						/**
						* 设置： 审核状态的值
						*/
						public void setXiangmuYesnoValue(String xiangmuYesnoValue) {
							this.xiangmuYesnoValue = xiangmuYesnoValue;
						}
					/**
					* 获取： 审核意见
					*/
					public String getXiangmuYesnoText() {
						return xiangmuYesnoText;
					}
					/**
					* 设置： 审核意见
					*/
					public void setXiangmuYesnoText(String xiangmuYesnoText) {
						this.xiangmuYesnoText = xiangmuYesnoText;
					}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getXiangmuDelete() {
						return xiangmuDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setXiangmuDelete(Integer xiangmuDelete) {
						this.xiangmuDelete = xiangmuDelete;
					}


				//级联表的get和set xuesheng
					/**
					* 获取： 学生姓名
					*/
					public String getXueshengName() {
						return xueshengName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setXueshengName(String xueshengName) {
						this.xueshengName = xueshengName;
					}
					/**
					* 获取： 学生手机号
					*/
					public String getXueshengPhone() {
						return xueshengPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setXueshengPhone(String xueshengPhone) {
						this.xueshengPhone = xueshengPhone;
					}
					/**
					* 获取： 学生身份证号
					*/
					public String getXueshengIdNumber() {
						return xueshengIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setXueshengIdNumber(String xueshengIdNumber) {
						this.xueshengIdNumber = xueshengIdNumber;
					}
					/**
					* 获取： 学生头像
					*/
					public String getXueshengPhoto() {
						return xueshengPhoto;
					}
					/**
					* 设置： 学生头像
					*/
					public void setXueshengPhoto(String xueshengPhoto) {
						this.xueshengPhoto = xueshengPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getXueshengEmail() {
						return xueshengEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setXueshengEmail(String xueshengEmail) {
						this.xueshengEmail = xueshengEmail;
					}




}
