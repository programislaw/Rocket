/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbak.rocket;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.stereotype.Component;

/**
 *
 * @author Bak
 */
@Component
public class PlayerComponent {

    private EntityManager em;
    
    public PlayerComponent() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("rocketPersistenceUnit");
        em = emf.createEntityManager();
    }
    
    public List<Player> getAll() {
        List<Player> players = em.createQuery("SELECT p FROM Player p").getResultList();
        for (Player player : players) {
            for (Attempt attempt : player.getAttempts()) {
                attempt.setPlayer(null);
            }
        }
        return players;
    }
}
