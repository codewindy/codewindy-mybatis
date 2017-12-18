/**
 * 
 */
package jp.codewindy.mybatis.dao;

import java.util.List;

import jp.codewindy.mybatis.pojo.User;

/**
 * @author yui 简单的crud 接口
 *
 */
public interface UserDao {
	/**
	 * 根据 用户id 查询 出 对象 User
	 * @param id
	 * @return
	 */
	public User queryUserById(Long id);
	
	public List<User> queryAll();
	
	public Integer saveUser(User user);
	
	public Integer updateUser(User user);
	
	/**根据id 删除用户*/
	public Integer deleteUser(Long id);

}
