package com.sbak.rocket;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bak
 */
@RestController
public class RocketController {
    
    @Autowired
    private PlayerComponent playerController;
    
    @CrossOrigin(origins = "*")
    @RequestMapping("/players")
    public List<Player> getAllPlayers() {
        PlayerComponent playerComponent = new PlayerComponent();
        return playerController.getAll();
    }
}
