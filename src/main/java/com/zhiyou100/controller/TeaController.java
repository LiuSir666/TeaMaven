package com.zhiyou100.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiyou100.model.Tea;
import com.zhiyou100.service.TeaService;
import com.zhiyou100.vo.PageVO;
import com.zhiyou100.vo.RangeVO;
import com.zhiyou100.vo.ResponseVO;
import com.zhiyou100.vo.TeaVO;

@Controller
public class TeaController {

	@Autowired
	private TeaService teaService;
	
	@RequestMapping(path = "/addTea", method = RequestMethod.POST)
	public @ResponseBody ResponseVO<RangeVO> addTea(@RequestBody Tea tea){
		RangeVO rangeVO = teaService.saveTea(tea);
		if (rangeVO.getResult() == 1) {
			return new ResponseVO<RangeVO>(1, "添加成功", rangeVO);
		}else {
			return new ResponseVO<RangeVO>(-1, "添加失败", null);
		}
	}

	@RequestMapping(path = "/statisticsTea", method = RequestMethod.GET)
	public @ResponseBody ResponseVO<Integer[]> statisticsTea(){
		return new ResponseVO<Integer[]>(1, "统计成功", teaService.statisticsTea());
	}

	@RequestMapping(path = "/sortTea", method = RequestMethod.POST)
	public @ResponseBody ResponseVO<TeaVO> sortTea(@RequestBody PageVO pageVO){

		return new ResponseVO<TeaVO>(1, "查询成功", teaService.listTea(pageVO));
	}

	@RequestMapping(path = "/getTea/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseVO<Tea> getTea(@PathVariable("id") int id){
		return new ResponseVO<Tea>(1, "查询成功", teaService.getTea(id));
	}
}
