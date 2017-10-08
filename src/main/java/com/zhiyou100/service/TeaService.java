package com.zhiyou100.service;

import com.zhiyou100.model.Tea;
import com.zhiyou100.vo.PageVO;
import com.zhiyou100.vo.RangeVO;
import com.zhiyou100.vo.TeaVO;

public interface TeaService {

	/**
	 * 分页展示茶叶信息
	 * @param pageVO
	 * @return pageIndex，pageCount，List<Tea> teas
	 */
	TeaVO listTea(PageVO pageVO);
	
	/**
	 * 添加茶叶
	 * @param tea
	 * @return float[] similar，result，level
	 */
	RangeVO saveTea(Tea tea);
	
	/**
	 * 统计茶叶
	 * @return 各个等级茶叶的数量
	 */
	Integer[] statisticsTea();
	
	Tea getTea(int id);
}
