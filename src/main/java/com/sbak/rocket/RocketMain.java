///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.sbak.rocket;
//
//import java.util.List;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
///**
// *
// * @author Bak
// */
//public class RocketMain {
//
//    private EntityManager em;
//    
//    public RocketMain() {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("rocketPersistenceUnit");
//        em = emf.createEntityManager();
//    }
//
//    
//    public static void main(String[] args) {
//        
//        RocketMain main = new RocketMain();
//        
//        List<Player> players = main.readPlayers();
//        //main.writeAttempt(players.get(0));
//
//    }
//
//    private List<Player> readPlayers() {
//        List<Player> players = em.createQuery("SELECT p FROM Player p").getResultList();
//        
//        return players;
//    }
//
//    private void writeAttempt(Player player) {
//        em.getTransaction().begin();
//
//        
//        Attempt attempt1 = new Attempt(player, "Opis 3");
//        
//        player.getAttempts().add(attempt1);
//        
//        em.persist(attempt1);
//        em.persist(player);
//        
//        em.getTransaction().commit();
//    }
//
//
//}
