/**
 * 
 */
package jp.codewindy.mybatis.dao.impl;

import static org.junit.Assert.fail;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import jp.codewindy.mybatis.dao.UserDao;
import jp.codewindy.mybatis.pojo.User;

/**
 * @author yui
 *
 */
public class UserDaoImplTest {

	private UserDao userDao;

	@Before
	public void setUp() throws Exception {

		String resource = "mybatis-config.xml";
		InputStream config = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		this.userDao = new UserDaoImpl(sqlSession);
	}

	@Test
	public void testUserDaoImpl() {
		System.err.println(this.userDao);
		
	}

	@Test
	public void testQueryUserById() {
		User user = this.userDao.queryUserById(1L);
		System.out.println("User ==" +user);
	}

	@Test
	public void testQueryAll() {
		List<User> queryAll = this.userDao.queryAll();
		System.err.println(queryAll);
	}

	@Test
	public void testSaveUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}

}
