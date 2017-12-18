/**
 * 
 */
package jp.codewindy.mybatis.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.codewindy.mybatis.pojo.User;

/**
 * @author  jvm 参数 添加   -Dorg.slf4j.simpleLogger.defaultLogLevel=DEBUG
 *
 */
public class MyBatis_sessionFactory {
	private static final Logger log = LoggerFactory.getLogger(MyBatis_sessionFactory.class);

	public static void main(String[] args) throws IOException {
		log.info("开始执行 mybatis ");
		System.err.println("*********************************");
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		System.err.println("sqlSessionFactory 是 = " + sqlSessionFactory);
		SqlSession session = sqlSessionFactory.openSession();
		System.err.println("对象 mybatis 的session 是 = " + session);
		// statement 是使用 命名空间.id 名称 abc.queryUserById
		User user = session.selectOne("abc.queryUserById", 2L);
		log.info("mybatis 执行结束..user json 格式是 ={}", user.getBirthday());
		//log.info("我是测试String %s");

		System.err.println(user);
		session.close();

	}

}
