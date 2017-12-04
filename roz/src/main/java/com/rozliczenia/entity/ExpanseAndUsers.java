package com.rozliczenia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class ExpanseAndUsers {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Expanse getExpanse() {
        return expanse;
    }

    public void setExpanse(Expanse expanse) {
        this.expanse = expanse;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    private Expanse expanse;

    @Column
    private int amount;


}
