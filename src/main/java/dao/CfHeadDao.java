package dao;
import java.util.List;
import java.util.Map;

import entity.CfHead;
import entity.CfHeadCondition;

public interface CfHeadDao {
	public List<CfHead> findAll();
	public List<CfHead> find(CfHeadCondition condition);
	public List<CfHead> findSingle(CfHeadCondition condition);
	public List<String> findDoctors();
	public List<Map<String,Object>> findCftypeTongji(CfHeadCondition condition);
}
