package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.model.VoteTea;

public interface VoteTeaDao {

	List<VoteTea> listVoteTea();
	
	List<VoteTea> topEight();
	
	int updateVoteTea(int id);
}
