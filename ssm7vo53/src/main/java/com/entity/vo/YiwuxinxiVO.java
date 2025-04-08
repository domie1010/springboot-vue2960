package com.entity.vo;

import com.entity.YiwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 衣物信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-19 15:35:27
 */
public class YiwuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 衣物种类
	 */
	
	private String yiwuzhonglei;
		
	/**
	 * 衣物数量
	 */
	
	private String yiwushuliang;
		
	/**
	 * 持有者
	 */
	
	private String chiyouzhe;
		
	/**
	 * 到店时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date daodianshijian;
		
	/**
	 * 清洗状态
	 */
	
	private String qingxizhuangtai;
		
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
	 
	public void setYiwushuliang(String yiwushuliang) {
		this.yiwushuliang = yiwushuliang;
	}
	
	/**
	 * 获取：衣物数量
	 */
	public String getYiwushuliang() {
		return yiwushuliang;
	}
				
	
	/**
	 * 设置：持有者
	 */
	 
	public void setChiyouzhe(String chiyouzhe) {
		this.chiyouzhe = chiyouzhe;
	}
	
	/**
	 * 获取：持有者
	 */
	public String getChiyouzhe() {
		return chiyouzhe;
	}
				
	
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
	 * 设置：清洗状态
	 */
	 
	public void setQingxizhuangtai(String qingxizhuangtai) {
		this.qingxizhuangtai = qingxizhuangtai;
	}
	
	/**
	 * 获取：清洗状态
	 */
	public String getQingxizhuangtai() {
		return qingxizhuangtai;
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
