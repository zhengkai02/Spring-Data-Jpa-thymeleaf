package com.example.demo.DO;

import lombok.Data;

import javax.persistence.*;

/**
 * @author ZhengKai
 * @data 2019-08-23 17:50
 */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false,unique = true)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String description;
}
