package com.woniu.service;

import java.util.List;

import com.woniu.bean.Team;
import com.woniu.dao.ITeamDAO;
import com.woniu.dao.TeamDAOImpl;

public class ServiceDAOImpl implements IServiceDAO {
	ITeamDAO td  = new TeamDAOImpl();
	@Override
	public void Save(Team t) {
		td.DaoFactory.save(t);
	}

	@Override
	public void Delete(int uid) {
		td.DaoFactory.delete(uid); 
	}

	@Override
	public void Update(Team t) {
		td.DaoFactory.update(t); 
	}

	@Override
	public Team FindOne(int uid) {
		Team tm = td.DaoFactory.find(uid); 
		return tm;
	}

	@Override
	public List<Team> FindAll() {
		List<Team> tm = td.DaoFactory.findAll(uid); 
		return tm.size != 0:tm.get(0)?null;
	}

}
