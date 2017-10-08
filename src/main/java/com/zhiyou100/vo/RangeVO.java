package com.zhiyou100.vo;

import java.util.Arrays;

public class RangeVO {

	private float[] similar;
	
	private Integer result;
	
	private String level;
	
	public RangeVO(float[] similar, Integer result, String level) {
		super();
		this.similar = similar;
		this.result = result;
		this.level = level;
	}

	@Override
	public String toString() {
		return "RangeVO [similar=" + Arrays.toString(similar) + ", result=" + result + ", level=" + level + "]";
	}

	public float[] getSimilar() {
		return similar;
	}

	public void setSimilar(float[] similar) {
		this.similar = similar;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	
}
