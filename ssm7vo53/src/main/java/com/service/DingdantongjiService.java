package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingdantongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingdantongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdantongjiView;


/**
 * 订单统计
 *
 * @author 
 * @email 
 * @date 2021-05-19 15:35:27
 */
public interface DingdantongjiService extends IService<DingdantongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdantongjiVO> selectListVO(Wrapper<DingdantongjiEntity> wrapper);
   	
   	DingdantongjiVO selectVO(@Param("ew") Wrapper<DingdantongjiEntity> wrapper);
   	
   	List<DingdantongjiView> selectListView(Wrapper<DingdantongjiEntity> wrapper);
   	
   	DingdantongjiView selectView(@Param("ew") Wrapper<DingdantongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdantongjiEntity> wrapper);
   	
}

