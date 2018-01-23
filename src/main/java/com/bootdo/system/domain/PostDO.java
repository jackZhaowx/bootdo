package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 发帖表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-01-23 09:52:48
 */
public class PostDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//发帖表
	private Long id;
	//发帖者主键id
	private Long posterId;
	//创建时间
	private Date createTime;
	//帖子内容
	private String content;
	//转发的源头贴的主键id
	private Long rootPostId;
	//被转发的帖子的主键id
	private Long repostId;
	//0=deleted, 1=normal
	private Integer status;
	//是否置顶(0否1是)
	private Integer stickFlag;
	//增加帖子阅读量
	private Long readingQuantity;
	//1，图片动态；2，视频动态；3，直播动态；4，广告；5直播回放
	private Integer category;
	//增加直播视频链接
	private String link;
	//封面
	private String coverimg;
	//群组id
	private Long groupId;
	//风景表主键
	private Long viewId;
	//景点所在的位置
	private String cityName;
	//景点name
	private String viewName;
	//帖子 发直播信息 
	private Long infoid;
	//
	private String playtime;
	//帖子浏览量
	private String views;
	//
	private String englishContent;
	//帖子的唯一标志
	private String uniqueId;
	//帖子的分类
	private Long sourceType;
	//直播房间号
	private String liveCode;
	//推流地址
	private String pushFlow;
	//拉流地址
	private String pullFlow;
	//帖子标签
	private String tag;
	//帖子的优先级
	private Long score;
	//帖子的更新时间
	private Date updateTime;
	//帖子来源关联（media_soure表)
	private Integer source;
	//线上活动主键id
	private Long activityId;

	/**
	 * 设置：发帖表
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：发帖表
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：发帖者主键id
	 */
	public void setPosterId(Long posterId) {
		this.posterId = posterId;
	}
	/**
	 * 获取：发帖者主键id
	 */
	public Long getPosterId() {
		return posterId;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：帖子内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：帖子内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：转发的源头贴的主键id
	 */
	public void setRootPostId(Long rootPostId) {
		this.rootPostId = rootPostId;
	}
	/**
	 * 获取：转发的源头贴的主键id
	 */
	public Long getRootPostId() {
		return rootPostId;
	}
	/**
	 * 设置：被转发的帖子的主键id
	 */
	public void setRepostId(Long repostId) {
		this.repostId = repostId;
	}
	/**
	 * 获取：被转发的帖子的主键id
	 */
	public Long getRepostId() {
		return repostId;
	}
	/**
	 * 设置：0=deleted, 1=normal
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：0=deleted, 1=normal
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：是否置顶(0否1是)
	 */
	public void setStickFlag(Integer stickFlag) {
		this.stickFlag = stickFlag;
	}
	/**
	 * 获取：是否置顶(0否1是)
	 */
	public Integer getStickFlag() {
		return stickFlag;
	}
	/**
	 * 设置：增加帖子阅读量
	 */
	public void setReadingQuantity(Long readingQuantity) {
		this.readingQuantity = readingQuantity;
	}
	/**
	 * 获取：增加帖子阅读量
	 */
	public Long getReadingQuantity() {
		return readingQuantity;
	}
	/**
	 * 设置：1，图片动态；2，视频动态；3，直播动态；4，广告；5直播回放
	 */
	public void setCategory(Integer category) {
		this.category = category;
	}
	/**
	 * 获取：1，图片动态；2，视频动态；3，直播动态；4，广告；5直播回放
	 */
	public Integer getCategory() {
		return category;
	}
	/**
	 * 设置：增加直播视频链接
	 */
	public void setLink(String link) {
		this.link = link;
	}
	/**
	 * 获取：增加直播视频链接
	 */
	public String getLink() {
		return link;
	}
	/**
	 * 设置：封面
	 */
	public void setCoverimg(String coverimg) {
		this.coverimg = coverimg;
	}
	/**
	 * 获取：封面
	 */
	public String getCoverimg() {
		return coverimg;
	}
	/**
	 * 设置：群组id
	 */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	/**
	 * 获取：群组id
	 */
	public Long getGroupId() {
		return groupId;
	}
	/**
	 * 设置：风景表主键
	 */
	public void setViewId(Long viewId) {
		this.viewId = viewId;
	}
	/**
	 * 获取：风景表主键
	 */
	public Long getViewId() {
		return viewId;
	}
	/**
	 * 设置：景点所在的位置
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * 获取：景点所在的位置
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * 设置：景点name
	 */
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	/**
	 * 获取：景点name
	 */
	public String getViewName() {
		return viewName;
	}
	/**
	 * 设置：帖子 发直播信息 
	 */
	public void setInfoid(Long infoid) {
		this.infoid = infoid;
	}
	/**
	 * 获取：帖子 发直播信息 
	 */
	public Long getInfoid() {
		return infoid;
	}
	/**
	 * 设置：
	 */
	public void setPlaytime(String playtime) {
		this.playtime = playtime;
	}
	/**
	 * 获取：
	 */
	public String getPlaytime() {
		return playtime;
	}
	/**
	 * 设置：帖子浏览量
	 */
	public void setViews(String views) {
		this.views = views;
	}
	/**
	 * 获取：帖子浏览量
	 */
	public String getViews() {
		return views;
	}
	/**
	 * 设置：
	 */
	public void setEnglishContent(String englishContent) {
		this.englishContent = englishContent;
	}
	/**
	 * 获取：
	 */
	public String getEnglishContent() {
		return englishContent;
	}
	/**
	 * 设置：帖子的唯一标志
	 */
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	/**
	 * 获取：帖子的唯一标志
	 */
	public String getUniqueId() {
		return uniqueId;
	}
	/**
	 * 设置：帖子的分类
	 */
	public void setSourceType(Long sourceType) {
		this.sourceType = sourceType;
	}
	/**
	 * 获取：帖子的分类
	 */
	public Long getSourceType() {
		return sourceType;
	}
	/**
	 * 设置：直播房间号
	 */
	public void setLiveCode(String liveCode) {
		this.liveCode = liveCode;
	}
	/**
	 * 获取：直播房间号
	 */
	public String getLiveCode() {
		return liveCode;
	}
	/**
	 * 设置：推流地址
	 */
	public void setPushFlow(String pushFlow) {
		this.pushFlow = pushFlow;
	}
	/**
	 * 获取：推流地址
	 */
	public String getPushFlow() {
		return pushFlow;
	}
	/**
	 * 设置：拉流地址
	 */
	public void setPullFlow(String pullFlow) {
		this.pullFlow = pullFlow;
	}
	/**
	 * 获取：拉流地址
	 */
	public String getPullFlow() {
		return pullFlow;
	}
	/**
	 * 设置：帖子标签
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	/**
	 * 获取：帖子标签
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * 设置：帖子的优先级
	 */
	public void setScore(Long score) {
		this.score = score;
	}
	/**
	 * 获取：帖子的优先级
	 */
	public Long getScore() {
		return score;
	}
	/**
	 * 设置：帖子的更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：帖子的更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：帖子来源关联（media_soure表)
	 */
	public void setSource(Integer source) {
		this.source = source;
	}
	/**
	 * 获取：帖子来源关联（media_soure表)
	 */
	public Integer getSource() {
		return source;
	}
	/**
	 * 设置：线上活动主键id
	 */
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}
	/**
	 * 获取：线上活动主键id
	 */
	public Long getActivityId() {
		return activityId;
	}
}
