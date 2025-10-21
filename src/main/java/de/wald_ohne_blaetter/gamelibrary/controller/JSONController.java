package de.wald_ohne_blaetter.gamelibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.wald_ohne_blaetter.gamelibrary.game.Game;
import de.wald_ohne_blaetter.gamelibrary.game.GameService;

/**
 * Controller for handling HTTP requests related to {@link Game} entities.
 *
 * <p>
 * This controller provides endpoints for retrieving all games and creating a new game.
 * </p>
 *
 * @author Joern Klaßen
 * @version 0.0.1
 * @since 2025-03-21
 */
@RestController
public class JSONController {

    /**
     * Service class for game-related operations.
     * This is injected automatically by Spring.
     */
    @Autowired
    private GameService gameService;

    /**
     * Endpoint to retrieve all {@link Game} entities.
     *
     * @return A list of all games.
     */
    @GetMapping("all")
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    /**
     * Endpoint to create a new {@link Game}.
     *
     * @param game The game to be created.
     * @return The created game entity.
     */
    @PostMapping("create")
    public Game createGame(@RequestBody Game game) {
        return gameService.saveGame(game);
    }
}
