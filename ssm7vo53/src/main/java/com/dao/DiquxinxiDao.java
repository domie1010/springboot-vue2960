package com.dao;

import com.entity.DiquxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiquxinxiVO;
import com.entity.view.DiquxinxiView;


/**
 * 地区信息
 * 
 * @author 
 * @email 
 * @date 2021-05-19 15:35:27
 */
public interface DiquxinxiDao extends BaseMapper<DiquxinxiEntity> {
	
	List<DiquxinxiVO> selectListVO(@Param("ew") Wrapper<DiquxinxiEntity> wrapper);
	
	DiquxinxiVO selectVO(@Param("ew") Wrapper<DiquxinxiEntity> wrapper);
	
	List<DiquxinxiView> selectListView(@Param("ew") Wrapper<DiquxinxiEntity> wrapper);

	List<DiquxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiquxinxiEntity> wrapper);
	
	DiquxinxiView selectView(@Param("ew") Wrapper<DiquxinxiEntity> wrapper);
	
}
