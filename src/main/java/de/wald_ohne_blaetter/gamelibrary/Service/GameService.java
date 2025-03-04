package de.wald_ohne_blaetter.gamelibrary.Service;

import de.wald_ohne_blaetter.gamelibrary.DTO.Game;
import de.wald_ohne_blaetter.gamelibrary.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository repository;

    public Game saveGame(Game game){
        return repository.save(game);
    }

    public List<Game> getAllGames(){
        return repository.findAll();
    }
}
