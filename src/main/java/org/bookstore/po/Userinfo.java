package org.bookstore.po;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 19:21
 */
public class Userinfo {
    private Integer id;

    private String username;

    private String password;

    private String sex;

    private Integer age;

//    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public Integer getUserid() {
//		return userid;
//	}
//
//	public void setUserid(Integer userid) {
//		this.userid = userid;
//	}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
