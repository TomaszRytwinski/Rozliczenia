package com.rozliczenia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Expanse {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(nullable = false, unique = true)
    private String name;


    @OneToMany(cascade= CascadeType.ALL, mappedBy="expanse")
    private List<User> users;

    @ManyToOne(cascade = CascadeType.ALL)
    private Party party;



}
