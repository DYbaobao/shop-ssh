package com.ssh.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/13.
 */

@Data
@Setter
@Getter
@Entity
@Table (name = "category")
public class Category implements Serializable {
       @Id
       @GeneratedValue
       @Column(name = "id")
       private Integer id;

       @Column(name= "parent_id")
       private Integer parentId;

       @Column(name= "name")
       private String name;
}
