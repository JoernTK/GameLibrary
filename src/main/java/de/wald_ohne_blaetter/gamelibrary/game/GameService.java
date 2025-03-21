package de.wald_ohne_blaetter.gamelibrary.game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class for managing game-related operations.
 *
 * <p>
 * This service provides methods for saving a new game and retrieving all games from the repository.
 * </p>
 *
 * @author Joern Klaßen
 * @version 0.0.1
 * @since 2025-03-21
 */
@Service
public class GameService {

  /**
   * Repository for managing {@link Game} entities.
   * This is injected automatically by Spring.
   */
  @Autowired
  private GameRepository repository;

  /**
   * Saves a new or existing {@link Game} entity in the repository.
   *
   * @param game The game to be saved.
   * @return The saved game entity.
   */
  public Game saveGame(Game game) {
    return repository.save(game);
  }

  /**
   * Retrieves all {@link Game} entities from the repository.
   *
   * @return A list of all games.
   */
  public List<Game> getAllGames() {
    return repository.findAll();
  }
}