/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citydomino_jnodop_inf102640.pp18_logic;

/**
 *
 * @author TheNodop2016
 */
/**
 * defines the methods needed by the FXMLController for reacting to the users input.
 * @author klk
 */
public interface GUI2Game {
   
    /**
     * swaps the dominos of current players bank at the index with the domino 
     * of the choose-box even if one of it is empty.
     * @param idx index of the banks cell
     */
    void clickOnPlayersBank(int idx);
    
    /**
     * the current Domino (that is shown in choose-box) is rotated 
     * by 90 degrees clockwise and shown. If the clickOnPlayersBank-box is 
     * empty and a cell of the current players bank is empty a new domino is 
     * dealt and shown in the box. If the choose-box is empty and the players 
     * bank full, the next player is to move.
     */
    void boxClicked();
    
    /**
     * checks if the current chosen domino fits at the position.
     * @param pos position describes the top-left halfs position
     * @return true, if the current chosen domino fits at the position.
     */
    boolean fits(Pos pos);
    
    /**
     * puts the current Domino to the given position on board and removes it
     * from the choose-box and switches to the next player.
     * @param posFst position to lay to describes the top-left halfs position
     */
    void setOnBoard(Pos posFst);
    
    /**
     * clears the board. Deals the dominos to the banks. <br>
     * Gets one of the stacks dominos and sets it to the middle of the board. <br>
     * Human player starts.
     */    
    void startGame();
}

