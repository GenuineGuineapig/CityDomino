/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citydomino_jnodop_inf102640.pp18_gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import citydomino_jnodop_inf102640.pp18_logic.GUIConnector;
import citydomino_jnodop_inf102640.pp18_logic.Game;
import citydomino_jnodop_inf102640.pp18_logic.Pos;
import javafx.event.EventHandler;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;

/**
 * FXML Controller class
 *
 * @author TheNodop2016
 */
public class FXMLDocumentController implements Initializable {

    public final int ROWS = 5;
    public final int COLS = 5;
    
    @FXML
    private GridPane playerPane;
    @FXML
    private GridPane selectPane;
    @FXML
    private Pane currentBox;
    @FXML
    private GridPane citycenterPane;
    @FXML
    private Button up;
    @FXML
    private Button down;
    @FXML
    private Button left;
    @FXML
    private Button right;
    @FXML
    private GridPane kiPaneA;
    @FXML
    private GridPane kiPaneC;
    @FXML
    private GridPane kiPaneB;
    @FXML
    private Button drehen;
    @FXML
    private Button loeschen;
    
    private GUIConnector gui;
    
    private Game logik;
    
    private final String tKons = String.format("P0 P0 P0 P0 P0"
                                + " P0 P0 P0 P0 P0"
                                + " P0 P0 C0 P0 P0"
                                + " P0 P0 P0 P0 P0"
                                + " P0 P0 P0 P0 P0");

    /**
     * creates an array of imageviews corresponding to the gridPane. Each
     * imageView becomes a child of the gridPane and fills a cell. For proper
     * resizing it is binded to the gridPanes width and height.
     *
     * @return an array of imageviews added to the gridPane
     */
    private ImageView[][] initImages(GridPane gridPane) {
        int colcount = gridPane.getColumnConstraints().size();
        int rowcount = gridPane.getRowConstraints().size();
        ImageView[][] imageViews = new ImageView[colcount][rowcount];
        // bind each Imageview to a cell of the gridpane
        for (int x = 0; x < colcount; x++) {
            for (int y = 0; y < rowcount; y++) {
                //creates an empty imageview
                imageViews[x][y] = new ImageView();
                //add the imageview to the cell and
                //assign the correct indicees for this imageview, so you later can use GridPane.getColumnIndex(Node)
                gridPane.add(imageViews[x][y], x, y);

                //the image shall resize when the cell resizes
                imageViews[x][y].fitWidthProperty().bind(gridPane.widthProperty().divide(colcount));
                imageViews[x][y].fitHeightProperty().bind(gridPane.heightProperty().divide(rowcount));
            }
        }
        return imageViews;
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ImageView[][] imageView = initImages(playerPane);
        gui = new JavaFXGUI(imageView);
        logik = new Game(gui, tKons);
    }    

    @FXML
    private void moveUp(ActionEvent event) {
    }

    @FXML
    private void moveDown(ActionEvent event) {
    }

    @FXML
    private void moveLeft(ActionEvent event) {
    }

    @FXML
    private void moveRight(ActionEvent event) {
    }

    @FXML
    private void turnStone(ActionEvent event) {
    }

    @FXML
    private void deleteStone(ActionEvent event) {
    }
}
