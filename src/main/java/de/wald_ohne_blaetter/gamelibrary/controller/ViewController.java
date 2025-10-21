package de.wald_ohne_blaetter.gamelibrary.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import de.wald_ohne_blaetter.gamelibrary.game.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import de.wald_ohne_blaetter.gamelibrary.game.Game;

import static de.wald_ohne_blaetter.gamelibrary.game.GameTabelConstants.*;


@Controller
public class ViewController {

    /**
     * Service class for game-related operations.
     * This is injected automatically by Spring.
     */
    @Autowired
    private GameService gameService;

    /**
     * Model page connected with the database
     *
     * @param model to fill the right attributes
     * @return the index page
     */
    @GetMapping("/")
    public String getFromDatabase(Model model) {
        model.addAttribute("games", gameService.getAllGames());

        model.addAttribute("cols", ALL_GAMES_LABELS);

        return "index";
    }

    /**
     * Model page not connected with the database
     *
     * @param model to fill the right attributes
     * @return the index page
     */
    @GetMapping("/test")
    public String getFromHardcode(Model model) {
        model.addAttribute("games", getGames());

        model.addAttribute("cols", List.of(ID, NAME, EXPERIENCE_LENGTH));

        return "index";
    }

    private static List<Game> getGames() {
        List<Game> games = new ArrayList<Game>();
        Game siedler = new Game();
        siedler.setGame_name("Siedler");
        siedler.setGame_id(1L);
        siedler.setGame_price(BigDecimal.valueOf(13));
        siedler.setGame_experience_length(10);
        games.add(siedler);
        Game carcassonne = new Game();
        carcassonne.setGame_name("Carcassonne");
        carcassonne.setGame_id(2L);
        carcassonne.setGame_price(BigDecimal.valueOf(12.5));
        carcassonne.setGame_experience_length(10);
        games.add(carcassonne);
        Game uno = new Game();
        uno.setGame_name("Uno");
        uno.setGame_id(3L);
        uno.setGame_price(BigDecimal.valueOf(1.5));
        uno.setGame_experience_length(10);
        games.add(uno);
        return games;
    }
}
