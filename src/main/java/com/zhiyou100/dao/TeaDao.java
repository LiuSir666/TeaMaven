package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.model.Tea;
import com.zhiyou100.vo.PageVO;

public interface TeaDao {

	/**
	 * 通过id获取所得的茶叶信息
	 * @param id
	 * @return
	 */
	Tea getTea(int id);

	/**
	 * 添加茶叶信息
	 * @param tea
	 * @return
	 */
	int saveTea(Tea tea);
	
	/**
	 * 获取茶叶总数量
	 * @return
	 */
	int listCount();
	
	/**
	 * 获取指定茶叶等级的数量 
	 * @param grade
	 * @return
	 */
	int getCountByGrade(int grade);
	
	/**
	 * 分页展示茶叶信息列表
	 * @param pageVO
	 * @return
	 */
	List<Tea> listTea(PageVO pageVO);
}
