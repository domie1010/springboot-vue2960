package com.entity.model;

import com.entity.DingdanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 订单信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-19 15:35:27
 */
public class DingdanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 到店时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date daodianshijian;
		
	/**
	 * 顾客姓名
	 */
	
	private String gukexingming;
		
	/**
	 * 顾客电话
	 */
	
	private String gukedianhua;
		
	/**
	 * 衣物种类
	 */
	
	private String yiwuzhonglei;
		
	/**
	 * 衣物数量
	 */
	
	private Integer yiwushuliang;
		
	/**
	 * 所在地区
	 */
	
	private String suozaidiqu;
		
	/**
	 * 店家账号
	 */
	
	private String dianjiazhanghao;
		
	/**
	 * 店家名称
	 */
	
	private String dianjiamingcheng;
				
	
	/**
	 * 设置：到店时间
	 */
	 
	public void setDaodianshijian(Date daodianshijian) {
		this.daodianshijian = daodianshijian;
	}
	
	/**
	 * 获取：到店时间
	 */
	public Date getDaodianshijian() {
		return daodianshijian;
	}
				
	
	/**
	 * 设置：顾客姓名
	 */
	 
	public void setGukexingming(String gukexingming) {
		this.gukexingming = gukexingming;
	}
	
	/**
	 * 获取：顾客姓名
	 */
	public String getGukexingming() {
		return gukexingming;
	}
				
	
	/**
	 * 设置：顾客电话
	 */
	 
	public void setGukedianhua(String gukedianhua) {
		this.gukedianhua = gukedianhua;
	}
	
	/**
	 * 获取：顾客电话
	 */
	public String getGukedianhua() {
		return gukedianhua;
	}
				
	
	/**
	 * 设置：衣物种类
	 */
	 
	public void setYiwuzhonglei(String yiwuzhonglei) {
		this.yiwuzhonglei = yiwuzhonglei;
	}
	
	/**
	 * 获取：衣物种类
	 */
	public String getYiwuzhonglei() {
		return yiwuzhonglei;
	}
				
	
	/**
	 * 设置：衣物数量
	 */
	 
	public void setYiwushuliang(Integer yiwushuliang) {
		this.yiwushuliang = yiwushuliang;
	}
	
	/**
	 * 获取：衣物数量
	 */
	public Integer getYiwushuliang() {
		return yiwushuliang;
	}
				
	
	/**
	 * 设置：所在地区
	 */
	 
	public void setSuozaidiqu(String suozaidiqu) {
		this.suozaidiqu = suozaidiqu;
	}
	
	/**
	 * 获取：所在地区
	 */
	public String getSuozaidiqu() {
		return suozaidiqu;
	}
				
	
	/**
	 * 设置：店家账号
	 */
	 
	public void setDianjiazhanghao(String dianjiazhanghao) {
		this.dianjiazhanghao = dianjiazhanghao;
	}
	
	/**
	 * 获取：店家账号
	 */
	public String getDianjiazhanghao() {
		return dianjiazhanghao;
	}
				
	
	/**
	 * 设置：店家名称
	 */
	 
	public void setDianjiamingcheng(String dianjiamingcheng) {
		this.dianjiamingcheng = dianjiamingcheng;
	}
	
	/**
	 * 获取：店家名称
	 */
	public String getDianjiamingcheng() {
		return dianjiamingcheng;
	}
			
}
