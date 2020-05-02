package com.ebw.bean;

import java.util.Date;

public class ShowData {
    private Integer id;
    private Date date;
    private String name;

    public ShowData() {
    }

    public ShowData(Integer id, Date date, String name) {
        this.id = id;
        this.date = date;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ShowData{" +
                "id=" + id +
                ", date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
}
