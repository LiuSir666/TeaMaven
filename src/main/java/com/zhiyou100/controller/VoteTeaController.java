package com.zhiyou100.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiyou100.model.VoteTea;
import com.zhiyou100.service.VoteTeaService;
import com.zhiyou100.vo.ResponseVO;

@Controller
public class VoteTeaController {

	@Autowired
	private VoteTeaService voteTeaService;
	
	@RequestMapping(path = "/listVoteTea", method = RequestMethod.GET)
	public @ResponseBody ResponseVO<List<VoteTea>> listVoteTea(){
		List<VoteTea> list=voteTeaService.listVoteTea();
		for (VoteTea voteTea : list) {
			
			System.out.println(voteTea);
		}
		return new ResponseVO<List<VoteTea>>(1, "查询成功", voteTeaService.listVoteTea());
	}

	@RequestMapping(path = "/topEightTea", method = RequestMethod.GET)
	public @ResponseBody ResponseVO<List<VoteTea>> topEightTea(){
		return new ResponseVO<List<VoteTea>>(1, "查询成功", voteTeaService.topEight());
	}

	@RequestMapping(path = "/updateTea/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseVO<Integer> updateTea(@PathVariable("id") int id){
		if (voteTeaService.updateVoteTea(id) == 1) {
			return new ResponseVO<Integer>(1, "投票成功", null);
		}else {
			return new ResponseVO<Integer>(-1, "投票失败", null);
		}

	}
}
