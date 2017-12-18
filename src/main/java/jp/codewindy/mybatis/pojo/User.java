/**
 * 
 */
package jp.codewindy.mybatis.pojo;

/*

 * Welcome to use the TableGo Tools.

 * 

 * http://vipbooks.iteye.com

 * http://blog.csdn.net/vipbooks

 * http://www.cnblogs.com/vipbooks

 * 

 */

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * TB_USER
 * 
 * @author 使用tableGo 生成vo pojo
 * @version 1.0.0 2017-12-16
 */
public class User implements java.io.Serializable {
	/** 版本号 */
	private static final long serialVersionUID = -357459267589583456L;

	/** id */
	private Long id;

	/** 用户名 */
	private String userName;

	/** 密码 */
	private String password;

	/** 姓名 */
	private String name;

	/** 年龄 */
	private Integer age;

	/** 性别，1男性，2女性 */
	private Byte[] sex;

	/** 出生日期 */
	private Date birthday;

	/** 创建时间 */
	private Date created;

	/** 更新时间 */
	private Date updated;

	/**
	 * 获取id
	 * 
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * 设置id
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取用户名
	 * 
	 * @return 用户名
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * 设置用户名
	 * 
	 * @param userName
	 *            用户名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 获取密码
	 * 
	 * @return 密码
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * 设置密码
	 * 
	 * @param password
	 *            密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 获取姓名
	 * 
	 * @return 姓名
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 设置姓名
	 * 
	 * @param name
	 *            姓名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取年龄
	 * 
	 * @return 年龄
	 */
	public Integer getAge() {
		return this.age;
	}

	/**
	 * 设置年龄
	 * 
	 * @param age
	 *            年龄
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * 获取性别，1男性，2女性
	 * 
	 * @return 性别
	 */
	public Byte[] getSex() {
		return this.sex;
	}

	/**
	 * 设置性别，1男性，2女性
	 * 
	 * @param sex
	 *            性别
	 */
	public void setSex(Byte[] sex) {
		this.sex = sex;
	}

	/**
	 * 获取出生日期
	 * 
	 * @return 出生日期
	 */
	public Date getBirthday() {
		return this.birthday;
	}

	/**
	 * 设置出生日期
	 * 
	 * @param birthday
	 *            出生日期
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * 获取创建时间
	 * 
	 * @return 创建时间
	 */
	public Date getCreated() {
		return this.created;
	}

	/**
	 * 设置创建时间
	 * 
	 * @param created
	 *            创建时间
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * 获取更新时间
	 * 
	 * @return 更新时间
	 */
	public Date getUpdated() {
		return this.updated;
	}

	/**
	 * 设置更新时间
	 * 
	 * @param updated
	 *            更新时间
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	// 使用pache 工具类 生成toString 方法
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
//		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
