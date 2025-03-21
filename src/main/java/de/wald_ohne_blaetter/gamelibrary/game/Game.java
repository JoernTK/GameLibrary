package de.wald_ohne_blaetter.gamelibrary.game;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Represents a game in the game library.
 * <p>
 * This class is used as a JPA entity to store relevant information about a game.
 * </p>
 *
 * @author Joern Klassen
 * @version 0.0.1
 * @since 2025-03-21
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "price")
public class Game
{

  /**
   * Unique ID of the game. Automatically generated by the database.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   * Name of the game. Must not be null or empty.
   */
  private String name;

  /**
   * Price of the game. Stored as {@link BigDecimal} to avoid rounding errors.
   */
  private BigDecimal price;
}
