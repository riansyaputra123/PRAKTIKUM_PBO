package pkg2109106078_rian_syaputra_ainun_naim_posttest4.data;

public final class Zombies extends Character implements Upgrade {
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

    @Override
    public void upgradeLevel1(){
        double persen_h = super.health * 0.15;
        super.health += persen_h;
        double persen_d = this.damage * 0.1;
        this.damage += persen_d;
        System.out.println("zombie successfully upgraded to level 2 with health increased by 15% and damage by 10%.");
    }
    @Override
    public void upgradeLevel2(){
        double persen = this.damage * 0.15;
        super.upgradeLevel2();
        this.damage += persen; 
        System.out.println("zombie successfully upgraded to level 2 with health increased by 20% and damage by 15%.");
    }
    @Override
    public void upgradeLevel3(){
        double persen = this.damage * 0.2; 
        super.upgradeLevel3();
        this.damage += persen; 
        System.out.println("zombie successfully upgraded to level 2 with health increased by 25% and damage by 20%.");
    }

    //Overloading
    public void showChar(){
        super.showChar();
        System.out.println("Damage    -> " + this.damage);
    }
    //Overloading
    public void showChar(boolean ver){
        if (ver) {
            super.showChar();
            System.out.println("Speed     -> " + this.speed);
        }
        else {
            showChar();
        }
    }
}
