package com.zhiyou100.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.VoteTeaDao;
import com.zhiyou100.model.VoteTea;
import com.zhiyou100.service.VoteTeaService;
@Service
public class VoteTeaServiceImpl implements VoteTeaService {

	@Autowired
	private VoteTeaDao voteTeaDao;
	
	public List<VoteTea> listVoteTea() {
		return voteTeaDao.listVoteTea();
	}

	public List<VoteTea> topEight() {
		return voteTeaDao.topEight();
	}

	public int updateVoteTea(int id) {
		return voteTeaDao.updateVoteTea(id);
	}

}
