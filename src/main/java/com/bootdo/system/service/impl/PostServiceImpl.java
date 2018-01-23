package com.bootdo.system.service.impl;

import com.bootdo.system.domain.PostDOInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.PostDao;
import com.bootdo.system.domain.PostDO;
import com.bootdo.system.service.PostService;



@Service
public class PostServiceImpl implements PostService {
	@Autowired
	private PostDao postDao;
	
	@Override
	public PostDO get(Long id){
		return postDao.get(id);
	}
	
	@Override
	public List<PostDOInfo> list(Map<String, Object> map){
		return postDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return postDao.count(map);
	}
	
	@Override
	public int save(PostDO post){
		return postDao.save(post);
	}
	
	@Override
	public int update(PostDO post){
		return postDao.update(post);
	}
	
	@Override
	public int remove(Long id){
		return postDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return postDao.batchRemove(ids);
	}
	
}
