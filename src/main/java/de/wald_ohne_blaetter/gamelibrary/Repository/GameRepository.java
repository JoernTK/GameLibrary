package de.wald_ohne_blaetter.gamelibrary.Repository;

import de.wald_ohne_blaetter.gamelibrary.DTO.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
