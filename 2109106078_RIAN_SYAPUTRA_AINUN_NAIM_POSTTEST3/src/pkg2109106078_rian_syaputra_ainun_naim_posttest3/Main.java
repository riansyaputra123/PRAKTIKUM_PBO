
package pkg2109106078_rian_syaputra_ainun_naim_posttest3;

/**
 *
 * @author RIAN SYAPUTRA AINUN NAIM
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import pkg2109106078_rian_syaputra_ainun_naim_posttest3.data.Plants;
import pkg2109106078_rian_syaputra_ainun_naim_posttest3.data.Zombies;

public class Main {
    /* 
    -------------------------------------------------DECLARATION OF GLOBAL VARIABEL-------------------------------------------------
     */
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<Plants> dPlants = new ArrayList<>();
    static ArrayList<Zombies> dZombies = new ArrayList<>();
    static String idPlant, idZombie;
    /* 
    -------------------------------------------------VOID MAIN----------------------------------------------------
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        /* 
        -------------------------------------------------CONTENTS OF THE PLANTS-------------------------------------------------
        */
        dPlants.add(new Plants("PeaShooter", 350, "P1", 100, "Attacker", 25));
        dPlants.add(new Plants("SnapDragon", 300, "P2", 150, "Attacker", 35));
        dPlants.add(new Plants("MelonPult", 325,"P3", 325, "Attacker", 80));
        /* 
        -------------------------------------------------CONTENTS OF THE ZOMBIES-------------------------------------------------
        */
        dZombies.add(new Zombies("Camel Zombie", 200, "Z1", "Creeper", 20));
        dZombies.add(new Zombies("ConeHead Zombie", 250, "Z2", "Basic", 20));
        dZombies.add(new Zombies("Eksplorer Zombie", 200, "Z3", "Hungry", 30));
        /* 
        -------------------------------------------------MAIN MENU-------------------------------------------------
        */
        boolean bb = true;
        while(bb){
            clear();
            System.out.println("+---------------------------------------------------------+");
            System.out.println("|                     >> SYSTEM GAME <<                   |");
            System.out.println("|                  >> PLANTS VS ZOMBIES <<                |");
            System.out.println("+---------------------------------------------------------+");
            System.out.println("|[1]. CREATE CHARACTER                                    |");
            System.out.println("|[2]. DISPLAY CHARACTER                                   |");
            System.out.println("|[3]. UPDATE CHARACTER                                    |");
            System.out.println("|[4]. DELETE CHARACTER                                    |");
            System.out.println("|[0]. EXIT >>                                             |");
            System.out.println("+---------------------------------------------------------+");
            System.out.print("ENTER CHOICE >> ");
            int choice = Integer.parseInt(br.readLine());
            
            switch(choice) {
                case 1:
                    clear();
                    create();
                    break;
                case 2:
                    clear();
                    display();
                    break;
                case 3:
                    clear();
                    update();
                    break;
                case 4:
                    clear();
                    delete();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println(" Unknown Input!! ");
                break;
            }
        }
    }
    /* 
    -------------------------------------------------VOID FOR CLEAR SCREEN-------------------------------------------------
    */
    private static void clear(){
        try{
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }catch(Exception ex){
            System.err.println("Tidak Bisa ClearScreen");
        }
    }
    /* 
    -------------------------------------------------VOID FOR CREATE-------------------------------------------------
    */
    private static  void create () throws IOException {
        System.out.println("\n>> Create Char <<\n");
        System.out.println("1. Plants");
        System.out.println("2. Zombies");
        System.out.print("\nEnter Input >> ");
        int choice = Integer.parseInt(br.readLine());
    
        switch (choice) {
            case 1:
                System.out.println("\n>> Create Plant <<\n");
                int xx = 0, uu = 1;
                while (xx != 1) {
                    uu = 0;
                    System.out.print("Id        -> "); idPlant = br.readLine();
                    for (Plants Plants1 : dPlants) {
                        if (Plants1.getId().equals(idPlant)) {
                            System.out.println("Id Plant Already Exist! Try Another Id.");
                            uu = 1;
                            System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                        }
                    }
                    if (uu != 1){
                        xx = 1;
                    }
                }
                System.out.print("Name      -> ");  String nameP = br.readLine();
                System.out.print("Toughness -> ");  double toughnessP = Double.parseDouble(br.readLine());
                System.out.print("Sun Cost  -> ");  int sunCostP = Integer.parseInt(br.readLine());
                System.out.print("Type      -> ");  String typeP = br.readLine();
                System.out.print("Damage    -> ");  double damageP = Double.parseDouble(br.readLine());
                Plants newPlants = new Plants(nameP, toughnessP, idPlant, sunCostP, typeP, damageP);
                dPlants.add(newPlants);
                System.out.println("\nPlant Has Been Successfully Created!");
                System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                break;
            case 2:
                System.out.println("\n>> Create Zombie <<");
                int rr = 0, kk = 1;
                while (rr != 1) {
                    kk = 0;
                    System.out.print("Id        -> "); idZombie = br.readLine();
                    for (Zombies Zombies1 : dZombies) {
                        if (Zombies1.getId().equals(idZombie)) {
                            System.out.println("Id Zombie Already Exist! Try Another Id.");
                            kk = 1;
                            System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                        }
                    }
                    if (kk != 1){
                        rr = 1;
                    }
                }
                System.out.print("Name      -> ");  String nameZ = br.readLine();
                System.out.print("Toughness -> ");  double toughnessZ = Double.parseDouble(br.readLine());
                System.out.print("Speed     -> ");  String speedZ = br.readLine();
                System.out.print("Damage    -> ");   double damageZ = Double.parseDouble(br.readLine());
                Zombies newZombies = new Zombies(nameZ, toughnessZ, idZombie, speedZ, damageZ);
                dZombies.add(newZombies);
                System.out.println("\nZombie Has Been Successfully Created!");
                System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                break;
        }
    }
    /* 
    -------------------------------------------------VOID FOR DISPLAY-------------------------------------------------
    */
    private static  void display() throws IOException {
        System.out.println("\n>> Display Char <<\n");
        System.out.println("1. Plants");
        System.out.println("2. Zombies");
        System.out.print("\nEnter Input >> ");
        int choice = Integer.parseInt(br.readLine());
    
        switch (choice) {
            case 1:
                System.out.println("\n>> List of Plants <<\n");
                System.out.println("+-----------------------------------------+\n");
                if (dPlants.size() == 0){
                    System.out.println("""                    
                        
                    Data Plants Still Empty!!                

                                        """);
                    System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                }
                else {
                    for (int i = 0; i < dPlants.size(); i += 1) {
                        System.out.println("Plants >> No." + (i + 1) + "\n");
                        System.out.println("Id        -> " + dPlants.get(i).getId());
                        System.out.println("Name      -> " + dPlants.get(i).getName());
                        System.out.println("Toughness -> " + dPlants.get(i).getToughness());
                        System.out.println("Sun Cost  -> " + dPlants.get(i).getSunCost());
                        System.out.println("Type      -> " + dPlants.get(i).getType());
                        System.out.println("Damage    -> " + dPlants.get(i).getDamage());
                        System.out.println("+-----------------------------------------+\n");
                    }
                    System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                }
                break;

            case 2:
                System.out.println("\n>> List of Zombies <<\n");
                System.out.println("+-----------------------------------------+\n");
                if (dZombies.size() == 0){
                    System.out.println("""                    
                        
                    Data Zombies Still Empty!!                

                                        """);
                    System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                }
                else {
                    for (int i = 0; i < dZombies.size(); i += 1) {
                        System.out.println("Zombies No. " + (i + 1) + "\n");
                        System.out.println("Id        -> " + dZombies.get(i).getId());
                        System.out.println("Name      -> " + dZombies.get(i).getName());
                        System.out.println("Toughness -> " + dZombies.get(i).getToughness());
                        System.out.println("Speed     -> " + dZombies.get(i).getSpeed());
                        System.out.println("Damage    -> " + dZombies.get(i).getDamage());
                        System.out.println("+-----------------------------------------+\n");
                    }
                    System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                }
                break;
        }
    }
    // /* 
    // -------------------------------------------------VOID UNTUK UBAH-------------------------------------------------
    //  */
    private static void update() throws IOException {
        System.out.println("\n>> Update Char <<\n");
        System.out.println("1. Plants");
        System.out.println("2. Zombies");
        System.out.print("\nEnter Input >> ");
        int choice = Integer.parseInt(br.readLine());
    
        switch (choice) {
            case 1:
                int if_Find1 = 0;
                if (dPlants.size() == 0) {
                    System.out.println("""                    
                        
                    Data Plants Still Empty!!                

                                        """);
                    System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                } 
                else {
                        System.out.println("\n>> List of Plants <<\n");
                        System.out.println("+-----------------------------------------+\n");
                        for (int i = 0; i < dPlants.size(); i += 1) {
                            System.out.println("Plants >> No." + (i + 1) + "\n");
                            System.out.println("Id        -> " + dPlants.get(i).getId());
                            System.out.println("Name      -> " + dPlants.get(i).getName());
                            System.out.println("Toughness -> " + dPlants.get(i).getToughness());
                            System.out.println("Sun Cost  -> " + dPlants.get(i).getSunCost());
                            System.out.println("Type      -> " + dPlants.get(i).getType());
                            System.out.println("Damage    -> " + dPlants.get(i).getDamage());
                            System.out.println("+-----------------------------------------+\n");
                        }
                        System.out.println("\n>> Update Plants <<\n");
                        System.out.print("Input Id Plant -> ");  idPlant = br.readLine();

                        for (Plants setPlant : dPlants) {
                            if (setPlant.getId().equals(idPlant)) {
                                System.out.print("New Name      -> "); setPlant.setName(br.readLine());
                                System.out.print("New toughness -> "); setPlant.setToughness(Double.parseDouble(br.readLine()));
                                System.out.print("New Sun Cost  -> "); setPlant.setSunCost(Integer.parseInt(br.readLine()));
                                System.out.print("New Type      -> "); setPlant.setType(br.readLine());
                                System.out.print("New Damage    -> "); setPlant.setDamage(Double.parseDouble(br.readLine()));
                                System.out.println("""
                                                        
                                The Plant Was Successfully Changed!
                                    """);
                                if_Find1 = 1;
                                System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                                break;
                            }
                        }
                        if (if_Find1 == 0) {
                        System.out.println("""
                        Id Plant Not Found!
                                    """);
                        System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                        }
                }
                break;

            case 2:
                int if_Find2 = 0;
                if (dPlants.size() == 0) {
                    System.out.println("""                    
                        
                    Data Zombies Still Empty!!                

                                        """);
                    System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                } 
                else {
                        System.out.println("\n>> List of Zombies <<\n");
                        System.out.println("+-----------------------------------------+\n");
                        for (int i = 0; i < dZombies.size(); i += 1) {
                            System.out.println("Zombies No. " + (i + 1) + "\n");
                            System.out.println("Id        -> " + dZombies.get(i).getId());
                            System.out.println("Name      -> " + dZombies.get(i).getName());
                            System.out.println("Toughness -> " + dZombies.get(i).getToughness());
                            System.out.println("Speed     -> " + dZombies.get(i).getSpeed());
                            System.out.println("Damage    -> " + dZombies.get(i).getDamage());
                            System.out.println("+-----------------------------------------+\n");
                        }
                        System.out.println("\n>> Update Zombies <<\n");
                        System.out.print("Input Id Zombie -> ");  idZombie = br.readLine();

                        for (Zombies setZombie : dZombies) {
                            if (setZombie.getId().equals(idZombie)) {
                                System.out.print("New Name      -> "); setZombie.setName(br.readLine());
                                System.out.print("New toughness -> "); setZombie.setToughness(Double.parseDouble(br.readLine()));
                                System.out.print("New Speed     -> "); setZombie.setSpeed(br.readLine());
                                System.out.print("New Damage    -> "); setZombie.setDamage(Double.parseDouble(br.readLine()));
                                System.out.println("""
                                                        
                                The Zombie Was Successfully Changed!
                                    """);
                                if_Find2 = 1;
                                System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                                break;
                            }
                        }
                        if (if_Find2 == 0) {
                        System.out.println("""
                        Id Plant Not Found!
                                    """);
                        System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                        }
                }
                break;
        }
    }
    // /* 
    // -------------------------------------------------VOID UNTUK HAPUS-------------------------------------------------
    //  */
    private static void delete () throws IOException {
        System.out.println("\n>> Delete Char <<\n");
        System.out.println("1. Plants");
        System.out.println("2. Zombies");
        System.out.print("\nEnter Input >> ");
        int choice = Integer.parseInt(br.readLine());
    
        switch (choice) {
            case 1:
                if (dPlants.size() == 0){
                    System.out.println("""                    
                                
                    Data Plants Still Empty!!                

                                                """);
                    System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                }
                else {
                    System.out.println("\n>> List of Plants <<\n");
                    System.out.println("+-----------------------------------------+\n");
                    boolean trueId = false;
                    for (int i = 0; i < dPlants.size(); i += 1) {
                        System.out.println("Plants >> No." + (i + 1) + "\n");
                        System.out.println("Id        -> " + dPlants.get(i).getId());
                        System.out.println("Name      -> " + dPlants.get(i).getName());
                        System.out.println("Toughness -> " + dPlants.get(i).getToughness());
                        System.out.println("Sun Cost  -> " + dPlants.get(i).getSunCost());
                        System.out.println("Type      -> " + dPlants.get(i).getType());
                        System.out.println("Damage    -> " + dPlants.get(i).getDamage());
                        System.out.println("+-----------------------------------------+\n");
                    }
                    System.out.println("\n>> Delete Plants <<\n");
                    System.out.print("Input Id Plant -> ");  idPlant = br.readLine();
                    for (int j = 0; j < dPlants.size(); j++) {
                        if ((dPlants.get(j).getId().equals(idPlant))) {
                            System.out.println("Delete Plants With Id " + idPlant + " ?");
                            System.out.print("Are You Sure You Want To Delete {y/n} >> "); String action = br.readLine();
                            if (action.equals ("y")){
                                dPlants.remove(j);
                                trueId = true;
                                System.out.println("""

                                Plant Has Been Successfully Deleted!
                                """);
                                System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                                break;
                            }
                            else {
                                System.out.println("""

                                Failed to Delete Plant!
                                        """);
                                trueId = true;
                                System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                                break;
                            }
                        }
                    }
                            
                    if (trueId == false) {
                        System.out.println("""

                        Id Plant Not Found!
                                    """);
                        System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                        }
                }
                break;
            case 2:
                if (dPlants.size() == 0){
                    System.out.println("""                    
                                
                    Data Zombies Still Empty!!                

                                                """);
                    System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                }
                else {
                    System.out.println("\n>> List of Zombies <<\n");
                    System.out.println("+-----------------------------------------+\n");
                    boolean trueId = false;
                    for (int i = 0; i < dZombies.size(); i += 1) {
                        System.out.println("Zombies >> No." + (i + 1) + "\n");
                        System.out.println("Id        -> " + dZombies.get(i).getId());
                        System.out.println("Name      -> " + dZombies.get(i).getName());
                        System.out.println("Toughness -> " + dZombies.get(i).getToughness());
                        System.out.println("Speed     -> " + dZombies.get(i).getSpeed());
                        System.out.println("Damage    -> " + dZombies.get(i).getDamage());
                        System.out.println("+-----------------------------------------+\n");
                    }
                    System.out.println("\n>> Delete Zombies <<\n");
                    System.out.print("Input Id Zombie -> ");  idZombie = br.readLine();
                    for (int j = 0; j < dZombies.size(); j++) {
                        if ((dZombies.get(j).getId().equals(idZombie))) {
                            System.out.println("Delete Zombies With Id " + idZombie + " ?");
                            System.out.print("Are You Sure You Want To Delete {y/n} >> "); String action = br.readLine();
                            if (action.equals ("y")){
                                dZombies.remove(j);
                                trueId = true;
                                System.out.println("""

                                Zombie Has Been Successfully Deleted!
                                """);
                                System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                                break;
                            }
                            else {
                                System.out.println("""

                                Failed to Delete Zombie!
                                        """);
                                trueId = true;
                                System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                                break;
                            }
                        }
                    }
                            
                    if (trueId == false) {
                        System.out.println("""

                        Id Zombie Not Found!
                                    """);
                        System.out.print("\nPress [ENTER] To Continue..."); br.readLine();
                        }
                }
                break;
        }
    }
}
