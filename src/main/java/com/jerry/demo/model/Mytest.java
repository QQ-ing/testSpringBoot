package com.jerry.demo.model;


import javax.persistence.*;

/**
 * @author Jerry
 * @date 2020/12/22
 */
@Entity
@Table(name="mytest")
public class Mytest {
    
    @Id
    private int id;
    
    @Column(name="username")
    private String userName;
    
    public Mytest() {
    }
    public Mytest(String userName){
        this.userName=userName;
    }
    
    @Override
    public String toString() {
        return "MyTest{" +
            "id=" + id +
            ", userName='" + userName + '\'' +
            '}';
    }
}
