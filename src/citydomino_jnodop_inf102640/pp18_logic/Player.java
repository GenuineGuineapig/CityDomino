package citydomino_jnodop_inf102640.pp18_logic;

/**
 *
 * @author TheNodop2016
 */
public enum Player {
    HUMAN(0), BOT1(1), BOT2(2), BOT3(3);
    private int number;
    
    Player(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }
    
    public Player next() {
        int ord = this.ordinal();
        ord = (ord + 1) % Player.values().length;
        return Player.values()[ord];
    }
}