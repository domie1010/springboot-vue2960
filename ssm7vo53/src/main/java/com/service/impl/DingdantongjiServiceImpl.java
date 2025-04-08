package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DingdantongjiDao;
import com.entity.DingdantongjiEntity;
import com.service.DingdantongjiService;
import com.entity.vo.DingdantongjiVO;
import com.entity.view.DingdantongjiView;

@Service("dingdantongjiService")
public class DingdantongjiServiceImpl extends ServiceImpl<DingdantongjiDao, DingdantongjiEntity> implements DingdantongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingdantongjiEntity> page = this.selectPage(
                new Query<DingdantongjiEntity>(params).getPage(),
                new EntityWrapper<DingdantongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingdantongjiEntity> wrapper) {
		  Page<DingdantongjiView> page =new Query<DingdantongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingdantongjiVO> selectListVO(Wrapper<DingdantongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingdantongjiVO selectVO(Wrapper<DingdantongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingdantongjiView> selectListView(Wrapper<DingdantongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingdantongjiView selectView(Wrapper<DingdantongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
