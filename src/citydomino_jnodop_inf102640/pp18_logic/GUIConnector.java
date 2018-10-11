package citydomino_jnodop_inf102640.pp18_logic;

/**
 *
 * @author TheNodop2016
 */
public interface GUIConnector {
//enthält kein JavaFX
   
    void displayGrid(Tiles[][] board);
    void drawStones(Stones[] stones);
    void showResult(int Points);
    void showWhosTurn(Player player);
    void showChooseBox(Stones stone);
    void showRotateBox(Stones stone);
}
