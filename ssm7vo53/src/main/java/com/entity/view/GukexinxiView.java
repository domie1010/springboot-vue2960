package com.entity.view;

import com.entity.GukexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 顾客信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-19 15:35:27
 */
@TableName("gukexinxi")
public class GukexinxiView  extends GukexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GukexinxiView(){
	}
 
 	public GukexinxiView(GukexinxiEntity gukexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, gukexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
