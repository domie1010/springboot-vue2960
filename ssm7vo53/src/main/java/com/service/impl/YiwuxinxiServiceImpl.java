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


import com.dao.YiwuxinxiDao;
import com.entity.YiwuxinxiEntity;
import com.service.YiwuxinxiService;
import com.entity.vo.YiwuxinxiVO;
import com.entity.view.YiwuxinxiView;

@Service("yiwuxinxiService")
public class YiwuxinxiServiceImpl extends ServiceImpl<YiwuxinxiDao, YiwuxinxiEntity> implements YiwuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiwuxinxiEntity> page = this.selectPage(
                new Query<YiwuxinxiEntity>(params).getPage(),
                new EntityWrapper<YiwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiwuxinxiEntity> wrapper) {
		  Page<YiwuxinxiView> page =new Query<YiwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiwuxinxiVO> selectListVO(Wrapper<YiwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiwuxinxiVO selectVO(Wrapper<YiwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiwuxinxiView> selectListView(Wrapper<YiwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiwuxinxiView selectView(Wrapper<YiwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
