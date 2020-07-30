package dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import entity.TongJi;

@Repository
public interface TongJiDao {
	void getTongJi(Map<String,Object> map);
	List<TongJi> getByRandom(int num);
}
