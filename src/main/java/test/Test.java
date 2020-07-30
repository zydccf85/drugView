package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dao.DrugDao;
import entity.Drug;

public class Test {
	
	@org.junit.Test
	public void test() throws IOException {
		String resource = "config/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession =sqlSessionFactory.openSession();
		DrugDao drugdao = sqlSession.getMapper(DrugDao.class);
		List<Drug> list = drugdao.findAll();
		System.out.println(list);
	}
	
	
	
}
