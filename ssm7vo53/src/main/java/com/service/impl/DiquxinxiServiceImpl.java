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


import com.dao.DiquxinxiDao;
import com.entity.DiquxinxiEntity;
import com.service.DiquxinxiService;
import com.entity.vo.DiquxinxiVO;
import com.entity.view.DiquxinxiView;

@Service("diquxinxiService")
public class DiquxinxiServiceImpl extends ServiceImpl<DiquxinxiDao, DiquxinxiEntity> implements DiquxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiquxinxiEntity> page = this.selectPage(
                new Query<DiquxinxiEntity>(params).getPage(),
                new EntityWrapper<DiquxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiquxinxiEntity> wrapper) {
		  Page<DiquxinxiView> page =new Query<DiquxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiquxinxiVO> selectListVO(Wrapper<DiquxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiquxinxiVO selectVO(Wrapper<DiquxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiquxinxiView> selectListView(Wrapper<DiquxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiquxinxiView selectView(Wrapper<DiquxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
