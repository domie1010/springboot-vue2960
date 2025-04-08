package com.entity.model;

import com.entity.DingdantongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 订单统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-19 15:35:27
 */
public class DingdantongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 店家账号
	 */
	
	private String dianjiazhanghao;
		
	/**
	 * 店家名称
	 */
	
	private String dianjiamingcheng;
		
	/**
	 * 订单数量
	 */
	
	private Integer dingdanshuliang;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
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
				
	
	/**
	 * 设置：订单数量
	 */
	 
	public void setDingdanshuliang(Integer dingdanshuliang) {
		this.dingdanshuliang = dingdanshuliang;
	}
	
	/**
	 * 获取：订单数量
	 */
	public Integer getDingdanshuliang() {
		return dingdanshuliang;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}
