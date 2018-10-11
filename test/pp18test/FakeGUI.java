package pp18test;

import citydomino_jnodop_inf102640.pp18_logic.GUIConnector;
import citydomino_jnodop_inf102640.pp18_logic.Player;
import citydomino_jnodop_inf102640.pp18_logic.Stones;
import citydomino_jnodop_inf102640.pp18_logic.Tiles;

/**
 *
 * @author TheNodop2016
 */
public class FakeGUI implements GUIConnector {
    @Override
    public void displayGrid(Tiles[][] board) {}
    
    @Override
    public void drawStones(Stones[] stones) {}
    
    @Override
    public void showResult(int Points) {}
    
    @Override
    public void showWhosTurn(Player player) {}
    
    @Override
    public void showChooseBox(Stones stone) {}
    
    @Override
    public void showCurrentBox(Stones stone) {}
}
