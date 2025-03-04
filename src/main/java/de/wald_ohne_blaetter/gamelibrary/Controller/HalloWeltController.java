package de.wald_ohne_blaetter.gamelibrary.Controller;

import de.wald_ohne_blaetter.gamelibrary.DTO.Game;
import de.wald_ohne_blaetter.gamelibrary.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HalloWeltController {

    @Autowired
    private GameService gameService;

    @GetMapping("Baum")
    public String helloWorld(){
        return "halloWelt";
    }

    @GetMapping("all")
    public List<Game> getAllGames()
    {
        return gameService.getAllGames();
    }

    @PostMapping("create")
    public Game createGame(@RequestBody Game game){
        return gameService.saveGame(game);
    }
}
