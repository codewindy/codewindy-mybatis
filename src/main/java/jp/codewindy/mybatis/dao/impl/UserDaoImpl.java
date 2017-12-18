/**
 * 
 */
package jp.codewindy.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jp.codewindy.mybatis.dao.UserDao;
import jp.codewindy.mybatis.pojo.User;

/**
 * @author yui  实现类中使用sqlSession 没有使用spring 注入 就是用构造方法注入
 *
 */
public class UserDaoImpl implements UserDao{
	
	private SqlSession sqlSession;
	
	
	
	/**
	 * @param sqlSession
	 */
	public UserDaoImpl(SqlSession sqlSession) {
		super();
		this.sqlSession = sqlSession;
	}


	@Override
	public User queryUserById(Long id) {
		// TODO Auto-generated method stub
		return this.sqlSession.selectOne("test.queryUserById", id);
	}

	
	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		return this.sqlSession.selectList("test.queryAll", null);
	}

	
	@Override
	public Integer saveUser(User user) {
		// TODO Auto-generated method stub
		return this.sqlSession.insert("saveUser", user);
	}

	
	@Override
	public Integer updateUser(User user) {
		// TODO Auto-generated method stub
		User user2 = new User();
		user2.setName("steveJobs@apple");
		return this.sqlSession.update("updateUser", user);
	}

	
	@Override
	public Integer deleteUser(Long id) {
		// TODO Auto-generated method stub
		return this.sqlSession.delete("deleteUser",id);
	}

}
