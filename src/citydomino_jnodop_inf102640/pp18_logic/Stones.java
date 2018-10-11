package citydomino_jnodop_inf102640.pp18_logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TheNodop2016
 */
public class Stones {
    
    private final Tiles fst;
    private final Tiles snd;
    private final int number;
    private int rotation;
    
    //Constructor for center
    Stones(Tiles fst, int number) {
        this.fst = fst;
        this.snd = new Tiles(Districts.none, 0);
        this.number = number;
        this.rotation = 0;
    }
    
    //Constructor for every other Stone
    Stones(Tiles fst, Tiles snd, int number) {
        this.fst = fst;
        this.snd = snd;
        this.number = number;
        this.rotation = 0;
    }
    
    public static final List<Stones> ALL_STONES = new ArrayList<>();  
    //Static Block zur Generation der vorgegebenen Steine
    static {
        ALL_STONES.add(new Stones(new Tiles(Districts.center, 0), new Tiles(Districts.center, 0), 0));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 0), new Tiles(Districts.park, 0), 1));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 0), new Tiles(Districts.park, 0), 2));
        ALL_STONES.add(new Stones(new Tiles(Districts.home, 0), new Tiles(Districts.home, 0), 3));
        ALL_STONES.add(new Stones(new Tiles(Districts.home, 0), new Tiles(Districts.home, 0), 4));
        ALL_STONES.add(new Stones(new Tiles(Districts.home, 0), new Tiles(Districts.home, 0), 5));
        ALL_STONES.add(new Stones(new Tiles(Districts.home, 0), new Tiles(Districts.home, 0), 6));
        ALL_STONES.add(new Stones(new Tiles(Districts.amusement, 0), new Tiles(Districts.amusement, 0), 7));
        ALL_STONES.add(new Stones(new Tiles(Districts.amusement, 0), new Tiles(Districts.amusement, 0), 8));
        ALL_STONES.add(new Stones(new Tiles(Districts.amusement, 0), new Tiles(Districts.amusement, 0), 9));
        ALL_STONES.add(new Stones(new Tiles(Districts.shopping, 0), new Tiles(Districts.shopping, 0), 10));
        ALL_STONES.add(new Stones(new Tiles(Districts.shopping, 0), new Tiles(Districts.shopping, 0), 11));
        ALL_STONES.add(new Stones(new Tiles(Districts.office, 0), new Tiles(Districts.office, 0), 12));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 0), new Tiles(Districts.home, 0), 13));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 0), new Tiles(Districts.amusement, 0), 14));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 0), new Tiles(Districts.shopping, 0), 15));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 0), new Tiles(Districts.office, 0), 16));
        ALL_STONES.add(new Stones(new Tiles(Districts.home, 0), new Tiles(Districts.amusement, 0), 17));
        ALL_STONES.add(new Stones(new Tiles(Districts.home, 0), new Tiles(Districts.shopping, 0), 18));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 1), new Tiles(Districts.home, 0), 19));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 1), new Tiles(Districts.amusement, 0), 20));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 1), new Tiles(Districts.shopping, 0), 21));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 1), new Tiles(Districts.office, 0), 22));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 1), new Tiles(Districts.industry, 0), 23));
        ALL_STONES.add(new Stones(new Tiles(Districts.home, 1), new Tiles(Districts.park, 0), 24));
        ALL_STONES.add(new Stones(new Tiles(Districts.home, 1), new Tiles(Districts.park, 0), 25));
        ALL_STONES.add(new Stones(new Tiles(Districts.home, 1), new Tiles(Districts.park, 0), 26));
        ALL_STONES.add(new Stones(new Tiles(Districts.home, 1), new Tiles(Districts.park, 0), 27));
        ALL_STONES.add(new Stones(new Tiles(Districts.home, 1), new Tiles(Districts.amusement, 0), 28));
        ALL_STONES.add(new Stones(new Tiles(Districts.home, 1), new Tiles(Districts.shopping, 0), 29));
        ALL_STONES.add(new Stones(new Tiles(Districts.amusement, 1), new Tiles(Districts.park, 0), 30));
        ALL_STONES.add(new Stones(new Tiles(Districts.amusement, 1), new Tiles(Districts.park, 0), 31));
        ALL_STONES.add(new Stones(new Tiles(Districts.amusement, 1), new Tiles(Districts.home, 0), 32));
        ALL_STONES.add(new Stones(new Tiles(Districts.amusement, 1), new Tiles(Districts.home, 0), 33));
        ALL_STONES.add(new Stones(new Tiles(Districts.amusement, 1), new Tiles(Districts.home, 0), 34));
        ALL_STONES.add(new Stones(new Tiles(Districts.amusement, 1), new Tiles(Districts.home, 0), 35));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 0), new Tiles(Districts.shopping, 1), 36));
        ALL_STONES.add(new Stones(new Tiles(Districts.amusement, 0), new Tiles(Districts.shopping, 1), 37));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 0), new Tiles(Districts.office, 1), 38));
        ALL_STONES.add(new Stones(new Tiles(Districts.shopping, 0), new Tiles(Districts.office, 1), 39));
        ALL_STONES.add(new Stones(new Tiles(Districts.industry, 1), new Tiles(Districts.park, 0), 40));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 0), new Tiles(Districts.shopping, 2), 41));
        ALL_STONES.add(new Stones(new Tiles(Districts.amusement, 0), new Tiles(Districts.shopping, 2), 42));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 0), new Tiles(Districts.office, 2), 43));
        ALL_STONES.add(new Stones(new Tiles(Districts.shopping, 0), new Tiles(Districts.office, 2), 44));
        ALL_STONES.add(new Stones(new Tiles(Districts.industry, 2), new Tiles(Districts.park, 0), 45));
        ALL_STONES.add(new Stones(new Tiles(Districts.office, 0), new Tiles(Districts.industry, 2), 46));
        ALL_STONES.add(new Stones(new Tiles(Districts.office, 0), new Tiles(Districts.industry, 2), 47));
        ALL_STONES.add(new Stones(new Tiles(Districts.park, 0), new Tiles(Districts.industry, 3), 48));
    }

    /**
     * gets the First Tile
     * @return the Tile
     */
    public Tiles getFst() {
        return fst;
    }

    /**
     * gets the Second Tile
     * @return the Tile
     */
    public Tiles getSnd() {
        return snd;
    }
    
    /**
     * gets the number
     * @return the number
     */
    public int getNum() {
        return number;
    }
    
    /**
     * gets the roation
     * @return the rotation
     */
    public int getRot() {
        return rotation;
    }
    
    /**
     * increases the rotation by 1 max. 3
     */
    public void incRot() {
        rotation++;
        rotation %= 4;
    }
    
    @Override
    public String toString() {
        return fst.toString() + snd.toString();
    }
}