package com.sbak.rocket;

import java.io.Serializable;
import javax.persistence.CascadeType;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Attempt implements Serializable {

    private static final long serialVersionUID = 2133424324L;
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String description;
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "PLAYER_ID")
    private Player player;

    public Attempt() {
    }

    public Attempt(Player player, String description) {
        this.player = player;
        this.description = description;
    }
 
    

    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }


    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
}