package com.zhiyou100.vo;

import java.util.List;

import com.zhiyou100.model.Tea;

public class TeaVO {

	private Integer pageIndex;

	private Integer pageCount;

	private List<Tea> teas;
	
	public TeaVO(Integer pageIndex, Integer pageCount, List<Tea> teas) {
		super();
		this.pageIndex = pageIndex;
		this.pageCount = pageCount;
		this.teas = teas;
	}

	@Override
	public String toString() {
		return "TeaVO [pageIndex=" + pageIndex + ", pageCount=" + pageCount + ", teas=" + teas + "]";
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public List<Tea> getTeas() {
		return teas;
	}

	public void setTeas(List<Tea> teas) {
		this.teas = teas;
	}
	
	
}
