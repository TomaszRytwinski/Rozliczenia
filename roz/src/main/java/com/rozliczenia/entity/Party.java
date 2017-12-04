package com.rozliczenia.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Party {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(columnDefinition = "Date")
    private Date date;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="party")
    private List<Expanse> expanses;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Expanse> getExpanses() {
        return expanses;
    }

    public void setExpanses(List<Expanse> expanses) {
        this.expanses = expanses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
