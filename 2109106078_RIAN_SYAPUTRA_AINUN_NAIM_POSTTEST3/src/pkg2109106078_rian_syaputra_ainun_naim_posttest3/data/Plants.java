package pkg2109106078_rian_syaputra_ainun_naim_posttest3.data;

public class Plants extends Character{
    // Attribute
    private String type;
    private double damage;
    private int sunCost;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDamage() {
        return this.damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getSunCost() {
        return this.sunCost;
    }

    public void setSunCost(int sunCost) {
        this.sunCost = sunCost;
    }


    //Constructor
    public Plants (String nameChar, double toughnessChar, String idChar, int sunCostChar, String typeChar, double damageChar){
        super (nameChar, toughnessChar, idChar);
        this.type = typeChar;
        this.sunCost = sunCostChar;
        this.damage = damageChar;
    }
}
