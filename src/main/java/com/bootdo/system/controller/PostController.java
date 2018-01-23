package com.bootdo.system.controller;

import java.util.List;
import java.util.Map;

import com.bootdo.system.domain.PostDOInfo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.system.domain.PostDO;
import com.bootdo.system.service.PostService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 发帖表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-01-23 09:52:48
 */
 
@Controller
@RequestMapping("/system/post")
public class PostController {
	@Autowired
	private PostService postService;
	
	@GetMapping()
	@RequiresPermissions("system:post:post")
	String Post(){
	    return "system/post/post";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:post:post")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<PostDOInfo> postList = postService.list(query);
		int total = postService.count(query);
		PageUtils pageUtils = new PageUtils(postList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:post:add")
	String add(){
	    return "system/post/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:post:edit")
	String edit(@PathVariable("id") Long id,Model model){
		PostDO post = postService.get(id);
		model.addAttribute("post", post);
	    return "system/post/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:post:add")
	public R save( PostDO post){
		if(postService.save(post)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:post:edit")
	public R update( PostDO post){
		postService.update(post);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:post:remove")
	public R remove( Long id){
		if(postService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:post:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		postService.batchRemove(ids);
		return R.ok();
	}
	
}
