package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.Condition;
import entity.Emp;

@Repository
public interface EmpDao {
	public int selectCount();
	public List<Emp> getAll();
	public List<Emp> findByCondition(Condition con);
	
}
