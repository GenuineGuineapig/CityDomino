package citydomino_jnodop_inf102640.pp18_logic;

/**
 *
 * @author TheNodop2016
 */
public class SaveLoad {
    
    public final int ROWS = 5;
    public final int COLS = 5;
    private Districts district = Districts.none;
    private int tempInt = 0;
    private String saveState = "empty";
    
    //Umwandlung von Districts zu String 
    //@param field = Zu speicherndes Districtsarray
    private String toString(Stones[][] field) {
        //Methode noch nicht implementiert.
    return saveState;
    }
    
    //Umwandlung von String zu District
    //@param save = umzuwandelnder String
    private Districts toDistrict(String save) {
        //Methode noch nicht implementiert.
    return district;
    }
    
    //Umwandlung von String zu Prestige
    //@param save = umzuwandelnder String
    private int toPrestige(String save) {
        //Methode noch nicht implementiert.
    return tempInt;
    }
    
    //Speichern vom Districtsarray in einem Spielstand
    //@param field = Zu speicherndes array
    private String saveDistricts(Districts[][] field) {
        //Methode noch nicht implementiert.
    return saveState;
    }
    
    //Speichern vom Prestigearray in einem Spielstand
    //@param field = Zu speicherndes array
    private String savePrestiges(int[][] field) {
        //Methode noch nicht implementiert.
    return saveState;
    }
    
    //Laden des Districtsarray aus einem Spielstand
    //@param save = Der zu ladene Speicherstand
    private Districts[][] loadDistricts(String save) {
    Districts[][] field = new Districts [ROWS][COLS];
    for (int row = 0; row < ROWS; row++) {
        for (int col = 0; col < COLS; col++) {
            field[row][col] = toDistrict(save);
            }
        }            
    return field;
    }    
    
    //Laden des Prestigearrays aus einem Spielstand
    //@param save = Der zu ladene Speicherstand
    private int[][] loadPrestiges(String save) {
    int[][] field = new int [ROWS][COLS];
    for (int row = 0; row < ROWS; row++) {
        for (int col = 0; col < COLS; col++) {
            field[row][col] = toPrestige(save);
            }
        }            
    return field;
    }
}
