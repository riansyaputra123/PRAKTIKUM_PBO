package pkg2109106078_rian_syaputra_ainun_naim_posttest3.data;

public class Character {
    // Property
    protected String name;
    protected double toughness;
    protected String id;

    public String getName() {
        return this.name;
    }

    public void setName(String nameChar) {
        this.name = nameChar;
    }

    public double getToughness() {
        return this.toughness;
    }

    public void setToughness(double toughnessChar) {
        this.toughness = toughnessChar;

    }
    public String getId() {
        return this.id;
    }

    public void setId(String idChar) {
        this.id = idChar;
    }


    

    

    // Constructor
    public Character(String nameChar, double toughnessChar, String idChar){
        this.name = nameChar;
        this.toughness = toughnessChar;
        this.id = idChar;
    }

    // Method
}