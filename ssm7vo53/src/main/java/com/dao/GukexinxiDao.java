package com.dao;

import com.entity.GukexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GukexinxiVO;
import com.entity.view.GukexinxiView;


/**
 * 顾客信息
 * 
 * @author 
 * @email 
 * @date 2021-05-19 15:35:27
 */
public interface GukexinxiDao extends BaseMapper<GukexinxiEntity> {
	
	List<GukexinxiVO> selectListVO(@Param("ew") Wrapper<GukexinxiEntity> wrapper);
	
	GukexinxiVO selectVO(@Param("ew") Wrapper<GukexinxiEntity> wrapper);
	
	List<GukexinxiView> selectListView(@Param("ew") Wrapper<GukexinxiEntity> wrapper);

	List<GukexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GukexinxiEntity> wrapper);
	
	GukexinxiView selectView(@Param("ew") Wrapper<GukexinxiEntity> wrapper);
	
}
