package citydomino_jnodop_inf102640.pp18_logic;

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
    public void showRotateBox(Stones stone) {}
}
