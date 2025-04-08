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
 * 衣物信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-19 15:35:27
 */
@TableName("yiwuxinxi")
public class YiwuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YiwuxinxiEntity() {
		
	}
	
	public YiwuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 衣物编号
	 */
					
	private String yiwubianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：衣物编号
	 */
	public void setYiwubianhao(String yiwubianhao) {
		this.yiwubianhao = yiwubianhao;
	}
	/**
	 * 获取：衣物编号
	 */
	public String getYiwubianhao() {
		return yiwubianhao;
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
