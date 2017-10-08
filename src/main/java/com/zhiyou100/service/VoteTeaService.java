package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.model.VoteTea;

public interface VoteTeaService {

	List<VoteTea> listVoteTea();
	
	List<VoteTea> topEight();
	
	int updateVoteTea(int id);
}
