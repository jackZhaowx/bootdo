package com.bootdo.system.service;

import com.bootdo.system.domain.PostDO;
import com.bootdo.system.domain.PostDOInfo;

import java.util.List;
import java.util.Map;

/**
 * 发帖表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-01-23 09:52:48
 */
public interface PostService {
	
	PostDO get(Long id);
	
	List<PostDOInfo> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PostDO post);
	
	int update(PostDO post);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
