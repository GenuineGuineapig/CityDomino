package citydomino_jnodop_inf102640.pp18_logic;

/**
 *
 * @author TheNodop2016
 */
public class Choose {
    private final Stones stone;
    private final Pos pos;
    private final int index;

    public Choose(Stones stone, Pos pos, int index) {
        this.stone = stone;
        this.pos = pos;
        this.index = index;
    }

    public Stones getStone() {
        return stone;
    }

    public Pos getPos() {
        return pos;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        final Choose other = (Choose) obj;
        return (this.index == other.index &&
                this.stone.equals(other.stone) &&
                this.pos.equals(other.pos));
    }
    


    @Override
    public String toString() {
        return "Choose{" + "stone=" + stone + ", pos=" + pos  + ", index= " + index + '}';
    }

    
    
}
