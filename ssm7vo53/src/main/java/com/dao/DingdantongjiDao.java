package com.dao;

import com.entity.DingdantongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingdantongjiVO;
import com.entity.view.DingdantongjiView;


/**
 * 订单统计
 * 
 * @author 
 * @email 
 * @date 2021-05-19 15:35:27
 */
public interface DingdantongjiDao extends BaseMapper<DingdantongjiEntity> {
	
	List<DingdantongjiVO> selectListVO(@Param("ew") Wrapper<DingdantongjiEntity> wrapper);
	
	DingdantongjiVO selectVO(@Param("ew") Wrapper<DingdantongjiEntity> wrapper);
	
	List<DingdantongjiView> selectListView(@Param("ew") Wrapper<DingdantongjiEntity> wrapper);

	List<DingdantongjiView> selectListView(Pagination page,@Param("ew") Wrapper<DingdantongjiEntity> wrapper);
	
	DingdantongjiView selectView(@Param("ew") Wrapper<DingdantongjiEntity> wrapper);
	
}
