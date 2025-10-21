package de.wald_ohne_blaetter.gamelibrary.game;

import java.util.List;

/**
 * Spalten-Definitionen für die Game-Tabelle.
 * - Nutzt "path" (Bean-Path) statt Methodenaufrufe.
 * - Ist immutable (public static final + unmodifiable lists).
 * - Bietet fertige Presets (DEFAULT, COMPACT, MINIMAL).
 */

public class GameTabelConstants {

    // Ein einzelner Spalteneintrag: Pfad (Bean-Property) + Label (Anzeige)
    public record GameTabelLabel(String attribut, String label) { }


    public static GameTabelLabel ID = new GameTabelLabel("game_id", "ID");

    public static GameTabelLabel NAME = new GameTabelLabel("game_name", "Name");

    public static GameTabelLabel RELEASE_DATE = new GameTabelLabel("game_release_date", "Veröffentlichungsdatum");

    public static GameTabelLabel PUBLISHER = new GameTabelLabel("publisher_id.publisher_name", "Verlag");

    public static GameTabelLabel PRICE = new GameTabelLabel("game_price", "Preis");

    public static GameTabelLabel LINK = new GameTabelLabel("game_link", "Link");

    public static GameTabelLabel OWNER = new GameTabelLabel("player_id.player_first_name", "Besitzer");

    public static GameTabelLabel LENGTH = new GameTabelLabel("game_length", "Boxdauer");

    public static GameTabelLabel EXPERIENCE_LENGTH = new GameTabelLabel("game_experience_length", "Erfahrungsspieldauer");

    public static GameTabelLabel PLAYING_FIELD = new GameTabelLabel("game_playing_field", "Spielfeldgröße");

    public static GameTabelLabel BOX_SIZE = new GameTabelLabel("game_box_size", "Schachtelgröße");

    public static GameTabelLabel MAX_PLAYERS = new GameTabelLabel("game_max_players", "Max. Spieler");

    public static GameTabelLabel MIN_PLAYERS = new GameTabelLabel("game_min_players", "Min. Spieler");

    public static GameTabelLabel OPTIMAL_MAX_PLAYERS = new GameTabelLabel("game_optimal_max_players", "Opt. Max. Spieler");

    public static GameTabelLabel OPTIMAL_MIN_PLAYERS = new GameTabelLabel("game_optimal_min_players", "Opt. Min. Spieler");

    public static GameTabelLabel IS_COOPERATIVE = new GameTabelLabel("game_is_cooperative", "Kooperativ");

    public static GameTabelLabel ADRESSE = new GameTabelLabel("address_id.getStreetAndNumber", "Adresse");

    //public static GameTabelLabel GENRE = new GameTabelLabel("genre_id", "Genre");

    public static GameTabelLabel EXIT_GAME = new GameTabelLabel("game_is_exit_game", "Exit-Game");

    public static GameTabelLabel NOTES = new GameTabelLabel("game_notes", "Notizen");



    // Voreinstellungen (unmodifiable)
    public static final List<GameTabelLabel> ALL_GAMES_LABELS = List.of(ID, NAME, RELEASE_DATE, PUBLISHER, PRICE, LINK, OWNER, LENGTH,
            EXPERIENCE_LENGTH, PLAYING_FIELD, BOX_SIZE, MAX_PLAYERS, MIN_PLAYERS, OPTIMAL_MAX_PLAYERS,
            OPTIMAL_MIN_PLAYERS, IS_COOPERATIVE, ADRESSE, EXIT_GAME, NOTES); //GENRE,

    // Voreinstellungen (modifiable)
    public static List<GameTabelLabel> ALL_GAMES_LABELS_MODIFIABLE = List.of(ID, NAME, RELEASE_DATE, PUBLISHER, PRICE, LINK, OWNER, LENGTH,
            EXPERIENCE_LENGTH, PLAYING_FIELD, BOX_SIZE, MAX_PLAYERS, MIN_PLAYERS, OPTIMAL_MAX_PLAYERS,
            OPTIMAL_MIN_PLAYERS, IS_COOPERATIVE, ADRESSE, EXIT_GAME, NOTES); //GENRE,
}