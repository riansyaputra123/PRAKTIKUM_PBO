package pkg2109106078_rian_syaputra_ainun_naim_posttest4.data;
public abstract class Character {
    // Property
    protected String name;
    protected double health;
    protected final String id;
    protected int level = 0;

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int levelChar) {
        this.level = levelChar;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String nameChar) {
        this.name = nameChar;
    }

    public double getHealth() {
        return this.health;
    }

    public void setHealth(double healthChar) {
        this.health = healthChar;

    }
    public String getId() {
        return this.id;
    }

    // public void setId(String idChar) {
    //     this.id = idChar;
    // }


    

    

    // Constructor
    public Character(String nameChar, double healthChar, String idChar){
        this.name = nameChar;
        this.health = healthChar;
        this.id = idChar;
        this.level = 0;
    }

    // Method
    public abstract void upgradeLevel1();
    
    public void upgradeLevel2(){
        double persen = this.health * 0.2;
        this.health += persen;  
    }
    public void upgradeLevel3(){
        double persen = this.health * 0.25;  
        this.health += persen; 
    }

    public void showChar(){
        System.out.println("Id        -> " + this.id);
        System.out.println("Name      -> " + this.name);
        System.out.println("Health    -> " + this.health);
        System.out.println("Level     -> " + this.level);
    }
}