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


import com.dao.GukexinxiDao;
import com.entity.GukexinxiEntity;
import com.service.GukexinxiService;
import com.entity.vo.GukexinxiVO;
import com.entity.view.GukexinxiView;

@Service("gukexinxiService")
public class GukexinxiServiceImpl extends ServiceImpl<GukexinxiDao, GukexinxiEntity> implements GukexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GukexinxiEntity> page = this.selectPage(
                new Query<GukexinxiEntity>(params).getPage(),
                new EntityWrapper<GukexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GukexinxiEntity> wrapper) {
		  Page<GukexinxiView> page =new Query<GukexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GukexinxiVO> selectListVO(Wrapper<GukexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GukexinxiVO selectVO(Wrapper<GukexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GukexinxiView> selectListView(Wrapper<GukexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GukexinxiView selectView(Wrapper<GukexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
