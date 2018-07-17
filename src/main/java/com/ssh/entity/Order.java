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
@Getter
@Setter
@Table (name = "order")
public class Order implements Serializable {
    @Id
    @GeneratedValue
    @Column (name = "id")
    private Integer id;

    @Column (name = "proid")
    private Integer proId;

    @Column (name = "userid")
    private Integer userId;

    @Column (name = "sumprice")
    private double sumPrice;

    @Column( name ="createtime")
    private Date creatTime;

    @Column( name ="updatetime")
    private Date updateTime;
}
