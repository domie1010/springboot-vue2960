package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiquxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiquxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiquxinxiView;


/**
 * 地区信息
 *
 * @author 
 * @email 
 * @date 2021-05-19 15:35:27
 */
public interface DiquxinxiService extends IService<DiquxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiquxinxiVO> selectListVO(Wrapper<DiquxinxiEntity> wrapper);
   	
   	DiquxinxiVO selectVO(@Param("ew") Wrapper<DiquxinxiEntity> wrapper);
   	
   	List<DiquxinxiView> selectListView(Wrapper<DiquxinxiEntity> wrapper);
   	
   	DiquxinxiView selectView(@Param("ew") Wrapper<DiquxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiquxinxiEntity> wrapper);
   	
}

