package com.entity.view;

import com.entity.DingdantongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 订单统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-19 15:35:27
 */
@TableName("dingdantongji")
public class DingdantongjiView  extends DingdantongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingdantongjiView(){
	}
 
 	public DingdantongjiView(DingdantongjiEntity dingdantongjiEntity){
 	try {
			BeanUtils.copyProperties(this, dingdantongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
