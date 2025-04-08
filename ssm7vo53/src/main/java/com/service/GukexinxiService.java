package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GukexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GukexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GukexinxiView;


/**
 * 顾客信息
 *
 * @author 
 * @email 
 * @date 2021-05-19 15:35:27
 */
public interface GukexinxiService extends IService<GukexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GukexinxiVO> selectListVO(Wrapper<GukexinxiEntity> wrapper);
   	
   	GukexinxiVO selectVO(@Param("ew") Wrapper<GukexinxiEntity> wrapper);
   	
   	List<GukexinxiView> selectListView(Wrapper<GukexinxiEntity> wrapper);
   	
   	GukexinxiView selectView(@Param("ew") Wrapper<GukexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GukexinxiEntity> wrapper);
   	
}

