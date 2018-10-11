package citydomino_jnodop_inf102640.pp18_logic;

/**
 * Tiles fasst District mit Prestige zu einer Einheit zusammen.
 * @author TheNodop2016
 */
public class Tiles {

    private final Districts type;
    private final int prestige;

    public Tiles(Districts district, int prestige) {
        this.type = district;
        this.prestige = prestige;
    }
    
    //Methode zum bestimmen des Districttypen.
    public Districts getDistrict() {
        return type;
    }
    

    //Methode zum bestimmen des Districtprestige.
    public int getPrestige() {
        return prestige;
    }

    /**
     * Methode für Stein->String (prestige und district einzeln)
     * @return umgewandelter Stein als String.
     */
    @Override
    public String toString() {
        return prestige + type.getDistrict();
    }
}