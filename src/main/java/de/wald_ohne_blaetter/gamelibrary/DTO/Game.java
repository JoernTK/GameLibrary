package de.wald_ohne_blaetter.gamelibrary.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Game
{

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long gameId;

  private String gameName;
  private float price;
}
