package citydomino_jnodop_inf102640.pp18_gui;

import citydomino_jnodop_inf102640.pp18_logic.GUIConnector;
import citydomino_jnodop_inf102640.pp18_logic.Player;
import citydomino_jnodop_inf102640.pp18_logic.Tiles;
import citydomino_jnodop_inf102640.pp18_logic.Stones;
import citydomino_jnodop_inf102640.pp18_logic.Districts;
import citydomino_jnodop_inf102640.pp18_logic.Pos;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author TheNodop2016
 */
public class JavaFXGUI implements GUIConnector {
    
    private ImageView[][] brett;
    private Stones currStone = null;
    
    protected static final Image EMPTY_IMG = new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Empty.png");

    public JavaFXGUI(ImageView[][] brett) {
        this.brett = brett;
    }
    
    private Image getImage(Tiles tile) {
        if (tile.getDistrict() == Districts.amusement && tile.getPrestige() == 0) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Amusement_0.png");
        }
        if (tile.getDistrict() == Districts.amusement && tile.getPrestige() == 1) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Amusement_1.png");
        }
        if (tile.getDistrict() == Districts.amusement && tile.getPrestige() == 2) {
            return new Image("file:i/pictures/Amusement_2.png");
        }
        if (tile.getDistrict() == Districts.amusement && tile.getPrestige() == 3) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Amusement_3.png");
        }
        if (tile.getDistrict() == Districts.home && tile.getPrestige() == 0) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Home_0.png");
        }
        if (tile.getDistrict() == Districts.home && tile.getPrestige() == 1) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Home_1.png");
        }
        if (tile.getDistrict() == Districts.home && tile.getPrestige() == 2) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Home_2.png");
        }
        if (tile.getDistrict() == Districts.home && tile.getPrestige() == 3) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Home_3.png");
        }
        if (tile.getDistrict() == Districts.industry && tile.getPrestige() == 0) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Industry_0.png");
        }
        if (tile.getDistrict() == Districts.industry && tile.getPrestige() == 1) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Industry_1.png");
        }
        if (tile.getDistrict() == Districts.industry && tile.getPrestige() == 2) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Industry_2.png");
        }
        if (tile.getDistrict() == Districts.industry && tile.getPrestige() == 3) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Industry_3.png");
        }
        if (tile.getDistrict() == Districts.office && tile.getPrestige() == 0) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Office_0.png");
        }
        if (tile.getDistrict() == Districts.office && tile.getPrestige() == 1) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Office_1.png");
        }
        if (tile.getDistrict() == Districts.office && tile.getPrestige() == 2) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Office_2.png");
        }
        if (tile.getDistrict() == Districts.office && tile.getPrestige() == 3) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Office_3.png");
        }
        if (tile.getDistrict() == Districts.park && tile.getPrestige() == 0) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Park_0.png");
        }
        if (tile.getDistrict() == Districts.park && tile.getPrestige() == 1) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Park_1.png");
        }
        if (tile.getDistrict() == Districts.park && tile.getPrestige() == 2) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Park_2.png");
        }
        if (tile.getDistrict() == Districts.park && tile.getPrestige() == 3) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Park_3.png");
        }
        if (tile.getDistrict() == Districts.shopping && tile.getPrestige() == 0) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Shopping_0.png");
        }
        if (tile.getDistrict() == Districts.shopping && tile.getPrestige() == 1) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Shopping_1.png");
        }
        if (tile.getDistrict() == Districts.shopping && tile.getPrestige() == 2) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Shopping_2.png");
        }
        if (tile.getDistrict() == Districts.shopping && tile.getPrestige() == 3) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Shopping_3.png");
        }
        if (tile.getDistrict() == Districts.center && tile.getPrestige() == 0) {
            return new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/CityHall_Empty.png");
        }
        throw new IllegalArgumentException("Unbekannter Stein");

    }
    @Override
    public void displayGrid(Tiles[][] board) {
    for(int row = 0; row < board.length; row++) {
                for(int col = 0; col < board[row].length; col++) {
                    brett[row][col].setImage(getImage(board[row][col]));
                }
                
            }
    }
    
    @Override
    public void drawStones(Stones[] stones) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void showResult(int Points) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void showWhosTurn(Player player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void showChooseBox(Stones stone) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void showRotateBox(Stones stone) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Marks the position of the domino on the game grid with the given effect.
     * A current domino has to be available. If there is no current domino (so,
     * no domino is the selected box, nothing happens).
     *
     * @param pos position of the first half of the domino; the current domino
     * is used to determine whether the cell to the right or below it is marked
     * as well
     * @param effect how the color of the cells given through pos is changed. If
     * is value is null any previous effects are removed.
     */
    private void addEffectToDominoPos(Pos pos, ColorAdjust effect) {
        if (this.currStone != null) {
            this.brett[pos.x()][pos.y()].setEffect(effect);
            if (this.currStone.getRot() % 2 == 0) {
                this.brett[pos.x() + 1][pos.y()].setEffect(effect);
            } else {
                this.brett[pos.x()][pos.y() + 1].setEffect(effect);
            }
        }
    }
    
    /**
     * Highlights two cells (= place for a domino) on the game grid in green.
     *
     * @param pos position of the top-left half of the domino.
     */
    protected void highlightDominoPosGreen(Pos pos) {
        ColorAdjust changeToGreen = new ColorAdjust();
        changeToGreen.setHue(0.75);
        changeToGreen.setSaturation(1.0);
        changeToGreen.setBrightness(0.5);

        addEffectToDominoPos(pos, changeToGreen);
    }

    /**
     * Highlights two cells (= place for a domino) on the game grid in red.
     *
     * @param pos position of the top-left half of the domino.
     */
    protected void highlightDominoPosRed(Pos pos) {
        ColorAdjust changeToGreen = new ColorAdjust();
        changeToGreen.setSaturation(1.0);
        changeToGreen.setBrightness(0.5);

        addEffectToDominoPos(pos, changeToGreen);
    }

    /**
     * Removes the highlight of a domino position on the game grid.
     *
     * @param pos position of the top-left half of the domino.
     */
    protected void removeHighlightDominoPos(Pos pos) {
        addEffectToDominoPos(pos, null);
    }
}
