/**
 * 
 */
package jp.codewindy.mybatis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author <a>codewindy@foxmail.com</a>
 *         <p>
 *         1. 加载驱动的问题 a. 每次执行都要加载驱动 b. 驱动名称硬编码java代码中如需要改成oracle 需要改java 代码重新编译
 *         c. 解决方案 : 将驱动名称放置到外部的配置文件中
 *         </p>
 *         <p>
 *         2. 数据库连接信息硬编码到java 代码中
 *         </p>
 *         <p>
 *         3. 设置参数问题 a. 参数下标 硬编码java 代码中 需要人工判断参数位置 b. 参数值硬编码到代码中 如果需要该参数
 *         根据不同参数值传入
 *         </p>
 *         <p>
 *         4. 遍历结果集存在问题 需要人工判断字段名 以及位置 或者参数的类型 将结果集直接映射 pojo 对象
 *         </p>
 *         5. 频繁的创建连接 关闭导致资源浪费 影响性能 使用 连接池
 */
public class MyJDBC {
	public static void main(String[] args) throws Exception {
		Connection conn = null;

		PreparedStatement prep = null;
		// 执行查询
		ResultSet rs = null;

		try {
			// 加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 创建数据库链接conn
			String password = "123456";
			String url = "jdbc:mysql://127.0.0.1:3306/codewindy_mybatis1216";
			String user = "root";
			conn = DriverManager.getConnection(url, user, password);
			// 获取Statement 对象
			String sql = "select * from codewindy_mybatis1216.tb_user where id= ? ";
			prep = conn.prepareStatement(sql);
			// 设置参数 有2个参数 第一个 是下标 从1 开始 第二个是参数值
			// 为啥哟个long 是因为 数据库的id 使用的bigInt(20)
			prep.setLong(1, 2L);
			rs = prep.executeQuery();
			// 遍历结果集
			while (rs.next()) {
				System.err.println("id == " + rs.getLong("id"));
				System.err.println("name  == " + rs.getString("name"));
				System.err.println("password  == " + rs.getString("password"));
				System.err.println("sex  == " + rs.getInt("sex"));
			}
		} finally {
			// TODO: 在 连接不为空 关闭资源
			// 关闭连接 释放资源
			if (null != rs) {
				rs.close();
			}
			if (null != rs) {
				prep.close();
			}
			if (null != rs) {
				conn.close();
			}
		}
	}

}
