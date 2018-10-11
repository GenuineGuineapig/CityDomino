package citydomino_jnodop_inf102640.pp18_logic;

/**
 * TODO: COMMENT, CHANGE, TEST!
 */
public class Result {
    private final int[] points;
    private Player winner;

    public Result(int[] points, Player winner) {
        this.points = points;
        this.winner = winner;
    }

    public int[] getPoints() {
        return points;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
    
    /**
     * increments the points of this result by the points of the parameter.
     * @param points points to inc with
     * @pre the length of the given array must be the same as this points-array-length
     */
    public void incPoints(int[] points) {
        assert points.length == this.points.length;
        for (int i = 0; i < Player.values().length; i++) {
            this.points[i] += points[i];
        }
    }

    @Override
    public String toString() {
        return "Result{" + "points=" + points + ", winner=" + winner + '}';
    }
    
}
