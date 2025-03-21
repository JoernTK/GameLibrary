package de.wald_ohne_blaetter.gamelibrary.game;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing {@link Game} entities.
 *
 * <p>
 * This interface extends {@link JpaRepository} to provide CRUD operations
 * and query methods for the {@link Game} entity.
 * </p>
 *
 * @author Joern Klaßen
 * @version 0.0.1
 * @since 2025-03-21
 */
@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    // Additional query methods can be defined here if needed
}
