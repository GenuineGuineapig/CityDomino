package citydomino_jnodop_inf102640.pp18_logic;

/**
 * ENUM Verschiedener Distrikte des City-Dominos
 * @author TheNodop2016
 */
public enum Districts {
    none("N"), center("C"), amusement("A"), home("H"), industry("I"), office("O"), park("P"), shopping("S");
    private String type;
    
    Districts(String type) {
        this.type = type;
    }
    /**
     * Methode zum bestimmen des Namens eines Districts.
     * @return gibt den Namen des Districts zurück
     */
    public String getDistrict() {
        return type;
    }
    /**
     * Methode zum setzten einer Farbe.
     * @param district Zu setzender District.
     */
    public void setDistrict(final String district) {
        this.type = district;
    }
    /**
     * Methode zum überprüfen ob es sich um Center handelt..
     * @return True wenn Center, sonst False.
     */
    public boolean isCenter() {
        return this != Districts.center;
    }
}
