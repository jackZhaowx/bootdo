package com.bootdo.system.dao;

import com.bootdo.system.domain.PostDO;

import java.util.List;
import java.util.Map;

import com.bootdo.system.domain.PostDOInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 发帖表
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-01-23 09:52:48
 */
@Mapper
public interface PostDao {

	PostDO get(Long id);
	
	List<PostDOInfo> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(PostDO post);
	
	int update(PostDO post);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
