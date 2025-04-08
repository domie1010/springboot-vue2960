package com.dao;

import com.entity.YiwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiwuxinxiVO;
import com.entity.view.YiwuxinxiView;


/**
 * 衣物信息
 * 
 * @author 
 * @email 
 * @date 2021-05-19 15:35:27
 */
public interface YiwuxinxiDao extends BaseMapper<YiwuxinxiEntity> {
	
	List<YiwuxinxiVO> selectListVO(@Param("ew") Wrapper<YiwuxinxiEntity> wrapper);
	
	YiwuxinxiVO selectVO(@Param("ew") Wrapper<YiwuxinxiEntity> wrapper);
	
	List<YiwuxinxiView> selectListView(@Param("ew") Wrapper<YiwuxinxiEntity> wrapper);

	List<YiwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YiwuxinxiEntity> wrapper);
	
	YiwuxinxiView selectView(@Param("ew") Wrapper<YiwuxinxiEntity> wrapper);
	
}
