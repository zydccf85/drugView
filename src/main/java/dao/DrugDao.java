package dao;

import java.util.List;

import entity.Drug;

public interface DrugDao {
	 List<Drug> findAll();
	 List<Drug> findByName(List<String> names);
	 List<Drug> findByCondition(Drug d);
	 int findAllCount();
	 List<String> findForm();
	 List<Drug> findByRandom(int num);
	 List<Drug> fingDrugName(String searchCode);
	
}
