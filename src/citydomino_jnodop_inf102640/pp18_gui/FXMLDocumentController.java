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
import citydomino_jnodop_inf102640.pp18_logic.Game;
import citydomino_jnodop_inf102640.pp18_logic.Pos;
import citydomino_jnodop_inf102640.pp18_logic.GUI2Game;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseButton;
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
    private GridPane currentBox;
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
    
    private GUI2Game game;
    
    private JavaFXGUI gui;
    
    private Game logik;
    
    private final String tKons = String.format("N0 N0 N0 P0 N0"
                                + " N0 P0 P1 P0 N0"
                                + " N0 A0 C0 P0 N0"
                                + " N0 A2 N0 P0 N0"
                                + " I0 A0 N0 P0 P0");

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
    
    private ImageView[] initCurrentImages(GridPane gridPane) {
        ImageView[] imageViews = new ImageView[2];
        //creates an empty imageview
        imageViews[0] = new ImageView(new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Amusement_0.png"));
        //add the imageview to the cell and
        //assign the correct indicees for this imageview, so you later can use GridPane.getColumnIndex(Node)
        gridPane.add(imageViews[0], 0, 0);
        imageViews[0].fitWidthProperty().bind(gridPane.widthProperty().divide(2));
        imageViews[0].fitHeightProperty().bind(gridPane.heightProperty().divide(1));
        //creates an empty imageview
        imageViews[1] = new ImageView(new Image("citydomino_jnodop_inf102640/pp18_gui/pictures/Park_0.png"));
        //add the imageview to the cell and
        //assign the correct indicees for this imageview, so you later can use GridPane.getColumnIndex(Node)
        gridPane.add(imageViews[1], 0, 1);
        imageViews[1].fitWidthProperty().bind(gridPane.widthProperty().divide(2));
        imageViews[1].fitHeightProperty().bind(gridPane.heightProperty().divide(1));
        return imageViews;
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ImageView[][] imageView = initImages(playerPane);
        this.addDragAndDropHandlers(imageView);
        ImageView[] currentImageView = initCurrentImages(currentBox); 
        gui = new JavaFXGUI(imageView, currentImageView);
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
    
    @FXML
    private void onClickPnSelected(MouseEvent event) {
        game.boxClicked();
    }
    
    @FXML
    private void onDragDetectedPnSelected(MouseEvent event) {
        /* drag was detected, start a drag-and-drop gesture*/
        /* allow any transfer mode */
        Dragboard db = this.currentBox.startDragAndDrop(TransferMode.MOVE);
        ClipboardContent content = new ClipboardContent();

        content.putString("");
        db.setContent(content);

        db.setDragView(this.currentBox.snapshot(new SnapshotParameters(), null), 10, 10);

        event.consume();

    }
    
    /* AUTHOR: NIKLAS DREWS @FXML
    private void dropOnBoard(DragEvent event) {
        int r = -1;
        int c = -1;
        for (Node node : boardfield.getChildren()) {
            if (node.getBoundsInParent().contains(event.getX(), event.getY())) {
                // to use following methods the columnIndex and rowIndex
                // must have been set when adding the imageview to the grid
                c = GridPane.getColumnIndex(node);
                r = GridPane.getRowIndex(node);
            }
        }
        // if there is a valid position and the card could be placed
        if (r != -1 && c != -1 && logic.placeCard(selectedCard, r, c)) {
            Dragboard db = event.getDragboard();
            // unset dragboard content
            db.setContent(null);
            updateSingleField(r, c);
            settempTurnPoints(logic.getTempPoints());
            updateHand();
        }
    }*/
    
    private void addDragAndDropHandlers(ImageView[][] imgVws) {
        for (int x = 0; x < imgVws.length; x++) {
            for (int y = 0; y < imgVws[x].length; y++) {
                final int fx = x; 
                final int fy = y; 
                imgVws[x][y].setOnDragOver((EventHandler<DragEvent>) (DragEvent event) -> {
                    if (event.getGestureSource() == currentBox) {
                        event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
                    }
                    event.consume();
                });
                imgVws[x][y].setOnDragEntered((EventHandler<DragEvent>) (DragEvent event) -> {
                    Pos pos = new Pos(fx, fy);
                    if (this.game.fits(pos)) {
                        this.gui.highlightDominoPosGreen(pos);
                    } else {
                        this.gui.highlightDominoPosRed(pos);
                    }
                    event.consume();
                });
                imgVws[x][y].setOnDragExited((EventHandler<DragEvent>) (DragEvent event) -> {
                    this.gui.removeHighlightDominoPos(new Pos(fx, fy));
                    event.consume();
                });
                imgVws[x][y].setOnDragDropped((EventHandler<DragEvent>) (DragEvent event) -> {
                    boolean success = false;
                    Pos pos = new Pos(fx, fy); 
                    if (this.game.fits(pos)) {
                        success = true;
                        this.gui.removeHighlightDominoPos(pos);
                        this.game.setOnBoard(pos);  
                    }
                    event.setDropCompleted(success);
                    event.consume();
                });
            }
        }
    }
    @FXML
    private void onClickGrdPnBank(MouseEvent event) {
        int x = -1;
        int y = -1;
        boolean leftClicked = event.getButton() == MouseButton.PRIMARY;
        boolean rightClicked = event.getButton() == MouseButton.SECONDARY;

        //determine the imageview of the grid that contains the coordinates of the mouseclick 
        //to determine the board-coordinates
        for (Node node : selectPane.getChildren()) {
            if (node instanceof ImageView) {
                if (node.getBoundsInParent().contains(event.getX(), event.getY())) {
                    //to use following methods the columnIndex and rowIndex
                    //must have been set when adding the imageview to the grid
                    x = GridPane.getColumnIndex(node);
                    y = GridPane.getRowIndex(node);
                }
            }
        }

        if (x >= 0 && y >= 0 && leftClicked) {
            this.game.clickOnPlayersBank(y);
        }
    }
}
