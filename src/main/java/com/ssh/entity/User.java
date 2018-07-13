package com.ssh.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/7/11.
 */
@Data
@Entity
@Setter
@Getter
@Table(name="user")
public class User implements Serializable {
    @Id
    @GeneratedValue
    @Column (name = "userid")
    private Integer userId;


    @Column (name = "username")
    private String userName;


    @Column (name = "password")
    private String password;


    @Column (name = "sex")
    private String sex;


    @Column (name = "birthday")
    private Date birthday;


    @Column (name = "identitycode")
    private String identityCode;


    @Column (name = "email")
    private String email;


    @Column (name = "mobile")
    private String mobile;


    @Column (name = "address" )
    private String address;

    @Column (name = "status" )
    private Integer status;

    @Column (name = "money" )
    private double money;

    @Column( name ="create_time")
    private Date creatTime;

    @Column( name ="update_time")
    private Date updateTime;
}
