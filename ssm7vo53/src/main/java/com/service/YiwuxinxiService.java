package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiwuxinxiView;


/**
 * 衣物信息
 *
 * @author 
 * @email 
 * @date 2021-05-19 15:35:27
 */
public interface YiwuxinxiService extends IService<YiwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiwuxinxiVO> selectListVO(Wrapper<YiwuxinxiEntity> wrapper);
   	
   	YiwuxinxiVO selectVO(@Param("ew") Wrapper<YiwuxinxiEntity> wrapper);
   	
   	List<YiwuxinxiView> selectListView(Wrapper<YiwuxinxiEntity> wrapper);
   	
   	YiwuxinxiView selectView(@Param("ew") Wrapper<YiwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiwuxinxiEntity> wrapper);
   	
}

