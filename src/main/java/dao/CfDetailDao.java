package dao;

import java.util.List;

import entity.CfDetail;

public interface CfDetailDao {
	public List<CfDetail> findAll();
	public List<CfDetail> find(CfDetail condition);
	public List<CfDetail> findByOpertime(String opertime);
}
