package com.ssh.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/7/13.
 */
@Data
@Entity
@Setter
@Getter
@Table(name="cart")
public class Cart implements Serializable {
    @Id
    @GeneratedValue
    @Column (name= "id")
    private Integer id;

    @Column (name= "userid")
    private Integer userId;

    @Column (name= "proid")
    private Integer proId;

    @Column (name= "privace")
    private double privace;

    @Column( name ="create_time")
    private Date creatTime;

    @Column( name ="update_time")
    private Date updateTime;
}
