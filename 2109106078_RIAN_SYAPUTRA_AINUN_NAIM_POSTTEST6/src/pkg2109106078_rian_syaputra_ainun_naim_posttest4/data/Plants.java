package pkg2109106078_rian_syaputra_ainun_naim_posttest4.data;


public class Plants extends Character implements Upgrade{
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

    @Override
    public void upgradeLevel1(){
        double persen_h = super.health * 0.15;
        super.health += persen_h;
        double persen_d = this.damage * 0.1;
        this.damage += persen_d; 
        System.out.println("plant successfully upgraded to level 1 with health increased by 15% and damage by 10%.");
    }
    @Override
    public void upgradeLevel2(){
        double persen = this.damage * 0.15;
        super.upgradeLevel2();
        this.damage += persen;  
        System.out.println("plant successfully upgraded to level 2 with health increased by 20% and damage by 15%.");
    }
    @Override
    public void upgradeLevel3(){
        double persen = this.damage * 0.2; 
        super.upgradeLevel3();
        this.damage += persen; 
        System.out.println("plant successfully upgraded to level 3 with health increased by 25% and damage by 20%.");
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
            System.out.println("Damage    -> " + this.damage);
            System.out.println("SunCost   -> " + this.sunCost);
            System.out.println("Type      -> " + this.type);
        }
        else {
            showChar();
        }
    }

    // @Override
    // public void start(){
    //     try {
    //         System.out.println("WELCOME TO MINI GAME");
    //         for (Plants tanaman : plants ) {
    //             System.out.println("Plants >> No." + plants.indexOf(tanaman) + 1 + "\n");
    //             System.out.println("Id        -> " + tanaman.getId());
    //             System.out.println("Name      -> " + tanaman.getName());
    //             System.out.println("Health    -> " + tanaman.getHealth());
    //             System.out.println("Sun Cost  -> " + tanaman.getSunCost());
    //             System.out.println("Type      -> " + tanaman.getType());
    //             System.out.println("Damage    -> " + tanaman.getDamage());
    //             System.out.println("Level     -> " + tanaman.getLevel());
    //             System.out.println("+-----------------------------------------+\n");
    //         }
    //         System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
    //     } catch (NumberFormatException e) {
    //         e.printStackTrace();
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    // @Override
    // public void attack(){}

}
