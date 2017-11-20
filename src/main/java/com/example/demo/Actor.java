package com.example.demo;

import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String name;
    private String realName;
    private String headShot;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName=realName;
    }

    public String getHeadShot() {
        return headShot;
    }

    public void setHeadShot(String headShot) {
        this.headShot=headShot;
    }

}
