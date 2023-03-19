package pkg2109106078_rian_syaputra_ainun_naim_posttest3.data;

public class Zombies extends Character {
    // Attribute
    private String speed;
    private double damage;

    public String getSpeed() {
        return this.speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public double getDamage() {
        return this.damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }


    //Constructor
    public Zombies (String nameChar, double toughnessChar, String idChar, String speedChar, double damageChar){
        super (nameChar, toughnessChar, idChar);
        this.speed = speedChar;
        this.damage = damageChar;
    }
}
