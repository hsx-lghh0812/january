package com.Jan.may;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class GoodsInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	Boolean active; // 是否激活
	Date createDate;// 创建时间

	String creator;// 创建者
	String goodsName;// 名称
	String goodsNo;// 编号
	String goodsType;// 类型
	String goodsLogoPath;// logo
	String remark;//
	String purchaseDesc;// 购买描述
	String tags;// 所属分类
	String shareDesc;// 分享描述

	// @Transient // 不持久化到数据库
	@OneToMany(mappedBy = "goodsInfo", cascade = CascadeType.ALL, orphanRemoval = true)
	List<CloudPath> previewPics;// 预览图片
	// @Transient // 不持久化到数据库
	@OneToMany(mappedBy = "goodsInfo", cascade = CascadeType.ALL, orphanRemoval = true)
	List<GoodsSpec> GoodsSpec;// 商品规格

	@OneToMany(mappedBy = "goodsInfo", cascade = CascadeType.ALL, orphanRemoval = true)
	List<Recommend> recommend;

	@Transient
	List<GoodsInfo> recommendList = new ArrayList<GoodsInfo>();

	public List<GoodsInfo> getRecommendList() {
		return recommendList;
	}

	public void setRecommendList(List<GoodsInfo> recommendList) {
		this.recommendList = recommendList;
	}

	public List<Recommend> getRecommend() {
		return recommend;
	}

	public void setRecommend(List<Recommend> recommend) {
		this.recommend = recommend;
	}

	@OneToMany(mappedBy = "goodsInfo", cascade = CascadeType.ALL, orphanRemoval = true)
	List<Comment> comment;

	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	// public List<GoodsInfo> getRecommend() {
	// return recommend;
	// }
	//
	// public void setRecommend(List<GoodsInfo> recommend) {
	// this.recommend = recommend;
	// }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsNo() {
		return goodsNo;
	}

	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getGoodsLogoPath() {
		return goodsLogoPath;
	}

	public void setGoodsLogoPath(String goodsLogoPath) {
		this.goodsLogoPath = goodsLogoPath;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPurchaseDesc() {
		return purchaseDesc;
	}

	public void setPurchaseDesc(String purchaseDesc) {
		this.purchaseDesc = purchaseDesc;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getShareDesc() {
		return shareDesc;
	}

	public void setShareDesc(String shareDesc) {
		this.shareDesc = shareDesc;
	}

	public List<GoodsSpec> getGoodsSpec() {
		return GoodsSpec;
	}

	public void setGoodsSpec(List<GoodsSpec> goodsSpec) {
		GoodsSpec = goodsSpec;
	}

	public List<CloudPath> getPreviewPics() {
		return previewPics;
	}

	public void setPreviewPics(List<CloudPath> previewPics) {
		this.previewPics = previewPics;
	}

}
