package com.sao.euphonious.core.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by navia on 2015/2/5.
 */
@Entity
@Table(name = "student")
public class Student {
    private Integer id;
    private Integer age;
    private String name;

    public Student() {
    }

    public Student(String name, Integer id, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(name = "name", length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
