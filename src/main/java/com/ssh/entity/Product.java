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
@Table (name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue
    @Column (name = "proid" )
    private Integer proId;

    @Column (name = "proname")
    private String proName;

    @Column (name = "description")
    private String description;

    @Column (name = "price")
    private double price;

    @Column (name = "stock")
    private Integer stock;

    @Column (name = "picpath")
    private String picPath;

    @Column( name ="create_time")
    private Date creatTime;

    @Column( name ="update_time")
    private Date updateTime;
}
