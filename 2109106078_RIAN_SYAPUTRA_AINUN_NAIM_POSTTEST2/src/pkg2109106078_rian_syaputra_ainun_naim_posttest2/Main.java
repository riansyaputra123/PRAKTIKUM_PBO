
package pkg2109106078_rian_syaputra_ainun_naim_posttest2;

/**
 *
 * @author RIAN SYAPUTRA AINUN NAIM
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import pkg2109106078_rian_syaputra_ainun_naim_posttest2.data.Barang;


public class Main {

    /* 
    -------------------------------------------------VARIABEL DAN DEKLARASI GLOBAL-------------------------------------------------
     */

    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<Barang> dProduk = new ArrayList<>();
    static String nama, merk, warna, kategori, kode, kodeBarang;
    static int harga;
    static double berat;
    


    /* 
    -------------------------------------------------VOID MAIN-------------------------------------------------
     */

    public static void main(String[] args) throws NumberFormatException, IOException {

        dProduk.add(new Barang("Ideapad Slim 3i", "L321", "LENOVO", "Blue", "Laptop", 2.5, 12500000));
        dProduk.add(new Barang("TUF Gaming", "A455", "ASUS", "Grey", "Laptop", 3.1, 15700000));
        dProduk.add(new Barang("Logitech G512", "L222", "LOGITECH", "Carbon", "Keyboard", 1.13, 1360000));
        boolean bb = true;
        while(bb){
            clear();
            System.out.println("+---------------------------------------------------------+");
            System.out.println("|                >> MANAJEMEN DATA PRODUK <<              |");
            System.out.println("|                  >> ZONA COMPUTER ID <<                 |");
            System.out.println("+---------------------------------------------------------+");
            System.out.println("|[1]. TAMBAH BARANG                                       |");
            System.out.println("|[2]. LIHAT BARANG                                        |");
            System.out.println("|[3]. UBAH BARANG                                         |");
            System.out.println("|[4]. HAPUS BARANG                                        |");
            System.out.println("|[0]. KELUAR >>                                           |");
            System.out.println("+---------------------------------------------------------+");
            System.out.print("MASUKKAN PILIHAN >> ");
            int pilihan = Integer.parseInt(br.readLine());
            
            switch(pilihan) {
                case 1:
                    clear();
                    create();
                    break;
                case 2:
                    clear();
                    show ();
                    break;
                case 3:
                    clear();
                    update();
                    break;
                case 4:
                    clear();
                    remove();
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
    -------------------------------------------------VOID UNTUK CLEAR-------------------------------------------------
     */

     static void clear(){
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
    -------------------------------------------------VOID UNTUK MENAMBAH-------------------------------------------------
     */

    private static  void create () throws IOException {
        System.out.println("+---------------------------------------------------------+");
        System.out.println("|                   >> TAMBAH BARANG <<                   |");
        System.out.println("+---------------------------------------------------------+");
        System.out.print("| MASUKKAN NAMA BARANG        >> ");  nama = br.readLine();
        int xx = 0, uu = 1;
        while (xx != 1) {
            uu = 0;
            System.out.print("| MASUKKAN KODE BARANG        >> ");  kode = br.readLine();
            for (Barang barang : dProduk) {
                if (barang.getKode().equals(kode)) {
                    System.out.println("KODE SUDAH ADA! COBA KODE LAIN.");
                    uu = 1;
                    System.out.print("\nTekan [ENTER] Untuk Melanjutkan..."); br.readLine();
                }
            }
            if (uu != 1){
                xx = 1;
            }
        }
        System.out.print("| MASUKKAN MERK BARANG        >> ");  merk = br.readLine();
        System.out.print("| MASUKKAN WARNA BARANG       >> ");  warna = br.readLine();
        System.out.print("| MASUKKAN KATEGORI BARANG    >> ");  kategori = br.readLine();
        System.out.print("| MASUKKAN BERAT BARANG (Kg)  >> ");  berat = Double.parseDouble(br.readLine());
        System.out.print("| MASUKKAN HARGA BARANG (IDR) >> ");  harga = Integer.parseInt(br.readLine());

        Barang dataBarang = new Barang(nama, kode, merk, warna, kategori, berat, harga);
        dProduk.add(dataBarang);
        System.out.println("""
                                        BARANG BERHASIL DI TAMBAH!
                    """);
        System.out.print("\nTekan [ENTER] Untuk Melanjutkan..."); br.readLine();
    }

    // /* 
    // -------------------------------------------------VOID UNTUK MENAMPILKAN-------------------------------------------------
    //  */

    private static  void show () throws IOException {
        System.out.println("+---------------------------------------------------------+");
        System.out.println("|                   >> DAFTAR BARANG <<                   |");
        System.out.println("+---------------------------------------------------------+");
        if (dProduk.size() == 0){
            System.out.println("""                    
                

                                                    Data Masih kosong!!                

                                """);
            System.out.print("\nTekan [ENTER] Untuk Melanjutkan..."); br.readLine();
        }
        else {
            for (int i = 0; i < dProduk.size(); i += 1) {
                System.out.println("Produk >> [" + (i + 1)+"]");
                System.out.println("NAMA     >> " + dProduk.get(i).getNama());
                System.out.println("KODE     >> " + dProduk.get(i).getKode());
                System.out.println("MERK     >> " + dProduk.get(i).getMerk());
                System.out.println("WARNA    >> " + dProduk.get(i).getWarna());
                System.out.println("KATEGORI >> " + dProduk.get(i).getKategori());
                System.out.println("BERAT    >> " + dProduk.get(i).getBerat() + " Kg");
                System.out.println("HARGA    >> IDR " + dProduk.get(i).getHarga());
                System.out.println("+---------------------------------------------------------+");
            }
            System.out.print("\nTekan [ENTER] Untuk Melanjutkan..."); br.readLine();
        }
    }

    // /* 
    // -------------------------------------------------VOID UNTUK UBAH-------------------------------------------------
    //  */

    private static void update() throws IOException {
        int ketemu1 = 0;
        if (dProduk.size() == 0) {
            System.out.println("""                    
                

                                                    Data Masih kosong!!                

                                """);
            System.out.print("\nTekan [ENTER] Untuk Melanjutkan..."); br.readLine();
        } else {
                System.out.println("+---------------------------------------------------------+");
                System.out.println("|                    >> UBAH BARANG <<                    |");
                System.out.println("+---------------------------------------------------------+");
                
                for (int i = 0; i < dProduk.size(); i += 1) {
                    System.out.println("Produk >> [" + (i + 1)+"]");
                    System.out.println("NAMA     >> " + dProduk.get(i).getNama());
                    System.out.println("KODE     >> " + dProduk.get(i).getKode());
                    System.out.println("MERK     >> " + dProduk.get(i).getMerk());
                    System.out.println("WARNA    >> " + dProduk.get(i).getWarna());
                    System.out.println("KATEGORI >> " + dProduk.get(i).getKategori());
                    System.out.println("BERAT    >> " + dProduk.get(i).getBerat() + " Kg");
                    System.out.println("HARGA    >> IDR " + dProduk.get(i).getHarga());
                    System.out.println("+---------------------------------------------------------+");
                }
                System.out.print("MASUKKAN KODE BARANG >> ");  kode = br.readLine();

                for (Barang barang1 : dProduk) {
                    if (barang1.getKode().equals(kode)) {
                        System.out.print("| MASUKKAN NAMA BARANG        >> "); barang1.setNama(br.readLine());
                        System.out.print("| MASUKKAN MERK BARANG        >> "); barang1.setMerk(br.readLine());
                        System.out.print("| MASUKKAN WARNA BARANG       >> "); barang1.setWarna(br.readLine());
                        System.out.print("| MASUKKAN KATEGORI BARANG    >> "); barang1.setKategori(br.readLine());
                        System.out.print("| MASUKKAN BERAT BARANG (Kg)  >> "); barang1.setBerat(Double.parseDouble(br.readLine()));
                        System.out.print("| MASUKKAN HARGA BARANG (IDR) >> "); barang1.setHarga(Integer.parseInt(br.readLine()));
                        System.out.println("""
                                                \nBARANG BERHASIL DI UBAH!
                            """);
                        ketemu1 = 1;
                        System.out.print("\nTekan [ENTER] Untuk Melanjutkan..."); br.readLine();
                        break;
                    }
                }
                if (ketemu1 == 0) {
                System.out.println("""
                                                    KODE TIDAK DITEMUKAN!
                            """);
                System.out.print("\nTekan [ENTER] Untuk Melanjutkan..."); br.readLine();
                }
        }
    }

    // /* 
    // -------------------------------------------------VOID UNTUK HAPUS-------------------------------------------------
    //  */


    private static void remove () throws IOException {
        if (dProduk.size() == 0){
            System.out.println("""                    
                

                                                    Data Masih kosong!!                

                                """);
            System.out.print("\nTekan [ENTER] Untuk Melanjutkan..."); br.readLine();
        }
        else {
            // clear();
            System.out.println("+---------------------------------------------------------+");
            System.out.println("|                    >> HAPUS BARANG <<                   |");
            System.out.println("+---------------------------------------------------------+");
            boolean kodeBenar = false;
            for (int i = 0; i < dProduk.size(); i += 1) {
                System.out.println("Produk >> [" + (i + 1)+"]");
                System.out.println("NAMA     >> " + dProduk.get(i).getNama());
                System.out.println("KODE     >> " + dProduk.get(i).getKode());
                System.out.println("MERK     >> " + dProduk.get(i).getMerk());
                System.out.println("WARNA    >> " + dProduk.get(i).getWarna());
                System.out.println("KATEGORI >> " + dProduk.get(i).getKategori());
                System.out.println("BERAT    >> " + dProduk.get(i).getBerat() + " Kg");
                System.out.println("HARGA    >> IDR " + dProduk.get(i).getHarga());
                System.out.println("+---------------------------------------------------------+");
            }
            System.out.print("MASUKKAN KODE BARANG YANG AKAN DIHAPUS >> "); kode = br.readLine();
            for (int j = 0; j < dProduk.size(); j++) {
                if ((dProduk.get(j).getKode().equals(kode))) {
                    System.out.println("HAPUS BARANG " + kode + " ?");
                    System.out.print("KONFIRMASI TINDAKAN {y/n} >> "); String tindakan = br.readLine();
                    if (tindakan.equals ("y")){
                        dProduk.remove(j);
                        kodeBenar = true;
                        System.out.println("""

                                            BERHASIL MENGHAPUS BARANG!
                                """);
                        System.out.print("\nTekan [ENTER] Untuk Melanjutkan..."); br.readLine();
                        break;
                    }
                    else {
                        System.out.println("""

                                                GAGAL MENGHAPUS BARANG!
                                """);
                        kodeBenar = true;
                        System.out.print("\nTekan [ENTER] Untuk Melanjutkan..."); br.readLine();
                        break;
                    }
                }
            }
                    
            if (kodeBenar == false) {
                System.out.println("""

                                                    KODE TIDAK DITEMUKAN!
                            """);
                System.out.print("\nTekan [ENTER] Untuk Melanjutkan..."); br.readLine();
                }
        }
    }
}
