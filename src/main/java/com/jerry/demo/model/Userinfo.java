package com.jerry.demo.model;


import javax.persistence.*;

/**
 * @author Jerry
 * @date 2020/12/22
 */
@Entity
@Table(name="userinfo")
public class Userinfo {
    
    @Id
    private int id;
    
    @Column(name="username")
    private String userName;
    
    public Userinfo() {
    }
    public Userinfo(String userName){
        this.userName=userName;
    }
    
    @Override
    public String toString() {
        return "Userinfo{" +
            "id=" + id +
            ", userName='" + userName + '\'' +
            '}';
    }
}
