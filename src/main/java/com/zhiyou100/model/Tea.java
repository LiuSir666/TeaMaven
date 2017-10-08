package com.zhiyou100.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Tea {

	private Integer id;
	/**
	 * 形状
	 */
	private Float shape;
	
	/**
	 * 色泽
	 */
	private Float color;
	
	/**
	 * 净度
	 */
	private Float neatness;
	
	/**
	 * 汤色
	 */
	private Float soupColor;

	/**
	 * 香气
	 */
	private Float fragrance;

	/**
	 * 滋味
	 */
	private Float taste;

	/**
	 * 叶底
	 */
	private Float leaf;

	/**
	 * 等级
	 */
	private Integer grade;
	
	// 客户端发送给服务器的时间格式
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	// 服务器发送给客户端的时间格式
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Shanghai") 
	private Date addTime;

	@Override
	public String toString() {
		return "Tea [id=" + id + ", shape=" + shape + ", color=" + color + ", neatness=" + neatness + ", soupColor="
				+ soupColor + ", fragrance=" + fragrance + ", taste=" + taste + ", leaf=" + leaf + ", grade=" + grade
				+ ", addTime=" + addTime + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getShape() {
		return shape;
	}

	public void setShape(Float shape) {
		this.shape = shape;
	}

	public Float getColor() {
		return color;
	}

	public void setColor(Float color) {
		this.color = color;
	}

	public Float getNeatness() {
		return neatness;
	}

	public void setNeatness(Float neatness) {
		this.neatness = neatness;
	}

	public Float getSoupColor() {
		return soupColor;
	}

	public void setSoupColor(Float soupColor) {
		this.soupColor = soupColor;
	}

	public Float getFragrance() {
		return fragrance;
	}

	public void setFragrance(Float fragrance) {
		this.fragrance = fragrance;
	}

	public Float getTaste() {
		return taste;
	}

	public void setTaste(Float taste) {
		this.taste = taste;
	}

	public Float getLeaf() {
		return leaf;
	}

	public void setLeaf(Float leaf) {
		this.leaf = leaf;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}


}
