/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citydomino_jnodop_inf102640.pp18_logic;

import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author TheNodop2016
 */
public class Game {

    /**
     *ROW/COLS = Spielfeldabmessungen
     *NUMSTONES = Anzahl der Dominosteine
     */
    private final int ROWS = 5;
    private final int COLS = 5;
    private final int NUMSTONES = 48;
    public final static int BANK_SIZE = 4;
    public final static int PLAYER_CNT = Player.values().length;
    private int randNum = 0;
    private int score = 0;
    private final GUIConnector gui;
    private final Random rand = new Random();
    private final Tiles[][] board;
    private Stones currentStone;
    private Tiles tempTile;
    private String tempString;
    
    private ArrayList<Stones> stack;

    /**
     * Methode zum Aufbau eines Spielfeld anhand eines Strings
     * @param gui übergebene GUI-Schnittstelle
     * @param board übergebenes Spielfeld
     */
    public Game(GUIConnector gui, String board) {
        this.gui = gui;
        this.board = konsString(board);
        this.currentStone = Stones.ALL_STONES.get(randomGen());
        gui.displayGrid(this.board);
        }
    
    /**
     * Methode zum generieren einer zufälligen Zahl zur Steinauswahl.
     * @return generierte Zahl.
     */
    public int randomGen() {
        randNum = rand.nextInt(NUMSTONES);
        return randNum;
    }

    /**
     * Methode die aus einem String einen Stein generiert.
     *
     * @param stone der String aus dem generiert werden soll.
     * @return der generierte Stein.
     */
    private Tiles fromString(final String tile) {
        switch (tile) {
            case "P0":
                tempTile = new Tiles(Districts.park, 0);
                break;
            case "P1":
                tempTile = new Tiles(Districts.park, 1);
                break;
            case "P2":
                tempTile = new Tiles(Districts.park, 2);
                break;
            case "P3":
                tempTile = new Tiles(Districts.park, 3);
                break;
            case "H0":
                tempTile = new Tiles(Districts.home, 0);
                break;
            case "H1":
                tempTile = new Tiles(Districts.home, 1);
                break;
            case "H2":
                tempTile = new Tiles(Districts.home, 2);
                break;
            case "H3":
                tempTile = new Tiles(Districts.home, 3);
                break;
            case "A0":
                tempTile = new Tiles(Districts.amusement, 0);
                break;
            case "A1":
                tempTile = new Tiles(Districts.amusement, 1);
                break;
            case "A2":
                tempTile = new Tiles(Districts.amusement, 2);
                break;
            case "A3":
                tempTile = new Tiles(Districts.amusement, 3);
                break;
            case "S0":
                tempTile = new Tiles(Districts.shopping, 0);
                break;
            case "S1":
                tempTile = new Tiles(Districts.shopping, 1);
                break;
            case "S2":
                tempTile = new Tiles(Districts.shopping, 2);
                break;
            case "S3":
                tempTile = new Tiles(Districts.shopping, 3);
                break;
            case "O0":
                tempTile = new Tiles(Districts.office, 0);
                break;
            case "O1":
                tempTile = new Tiles(Districts.office, 1);
                break;
            case "O2":
                tempTile = new Tiles(Districts.office, 2);
                break;
            case "O3":
                tempTile = new Tiles(Districts.office, 3);
                break;
            case "I0":
                tempTile = new Tiles(Districts.industry, 0);
                break;
            case "I1":
                tempTile = new Tiles(Districts.industry, 1);
                break;
            case "I2":
                tempTile = new Tiles(Districts.industry, 2);
                break;
            case "I3":
                tempTile = new Tiles(Districts.industry, 3);
                break;
            case "C0":
                tempTile = new Tiles(Districts.center, 0);
                break;
            default:
                tempTile = new Tiles(Districts.none, 0);
        }
        return tempTile;
    }

    /**
     * Methode die ein Spielfeld in einen String umwandelt.
     *
     * @return Der String der das Spielfeld enthält.
     */
    @Override
    public String toString() {
        tempString = "";
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                tempTile = board[row][col];
                tempString += tempTile.toString();
            }
            tempString += System.lineSeparator();
        }
        return tempString;
    }
    
    /**
     * Methode zum erstellen eines Spielfeldes aus einem String.
     * @param konst Der String aus dem erstellt werden soll.
     * @return Das erstellte Spielfeld.
     */
    public Tiles[][] konsString(String konst) {
        Tiles[][] field = new Tiles[ROWS][COLS];
        String[] tiles = konst.split(" ");
        int counter = 0;
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
              field[row][col] = fromString(tiles[counter]);
              counter++;
            }
        }
        return field;
    }

    /**
     * Methode zum hinzufügen von Punkten.
     * @param points Die hinzuzufügenden Punkte.
     */
    public static void addPoints(int points) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Methode zum löschen des derzeitig ausgewählten Steines.
     */
    public static void deleteStone() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Methode zum rotieren des derzeitig ausgewählten Steines.
     */
    public static void rotateStone() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
