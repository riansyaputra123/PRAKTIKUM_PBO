
package pkg2109106078_rian_syaputra_ainun_naim_posttest1;

/**
 *
 * @author LENOVO
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import pkg2109106078_rian_syaputra_ainun_naim_posttest1.data.Barang;


public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<Barang> dataProduk = new ArrayList<>();
        String nama, merk, warna, kategori, kode;
        int harga;
        double berat;
        while(true){
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
                    System.out.println("+---------------------------------------------------------+");
                    System.out.println("|                   >> TAMBAH BARANG <<                   |");
                    System.out.println("+---------------------------------------------------------+");
                    System.out.print("| MASUKKAN NAMA BARANG        >> "); nama = br.readLine();
                    System.out.print("| MASUKKAN KODE BARANG        >> "); kode = br.readLine();
                    System.out.print("| MASUKKAN MERK BARANG        >> "); merk = br.readLine();
                    System.out.print("| MASUKKAN WARNA BARANG       >> "); warna = br.readLine();
                    System.out.print("| MASUKKAN KATEGORI BARANG    >> "); kategori = br.readLine();
                    System.out.print("| MASUKKAN BERAT BARANG (Kg)  >> "); berat = Double.parseDouble(br.readLine());
                    System.out.print("| MASUKKAN HARGA BARANG (IDR) >> "); harga = Integer.parseInt(br.readLine());
                    
                    Barang dataBarang = new Barang(nama, kode, merk, warna, kategori, berat, harga);
                    dataProduk.add(dataBarang);
                    System.out.println("""
                                                    BARANG BERHASIL DI TAMBAH!
                                """);
                    break;
                case 2:
                clear();
                    System.out.println("+---------------------------------------------------------+");
                    System.out.println("|                   >> DAFTAR BARANG <<                   |");
                    System.out.println("+---------------------------------------------------------+");
                    if (dataProduk.size() == 0){
                        System.out.println("""                    
                            

                                                                Data Masih kosong!!                
                        
                                            """);
                    }
                    else {
                        for (int i = 0; i < dataProduk.size(); i += 1) {
                            System.out.println("Produk >> [" + (i + 1)+"]");
                            dataProduk.get(i).display();
                        }
                    }
                    break;
                case 3:
                    clear();
                    Boolean ketemu = false;
                    if (dataProduk.size() == 0){
                        System.out.println("""                    
                            

                                                                Data Masih kosong!!                

                                            """);
                    break;
                    }
                    System.out.println("+---------------------------------------------------------+");
                    System.out.println("|                    >> UBAH BARANG <<                    |");
                    System.out.println("+---------------------------------------------------------+");
                    for (int i = 0; i < dataProduk.size(); i += 1) {
                        System.out.println("Produk >> [" + (i + 1)+"]");
                        dataProduk.get(i).display();
                    }
                    System.out.print("MASUKKAN KODE BARANG >> "); kode = br.readLine();
                    for (Barang barang : dataProduk) {
                        if (barang.getKode().equals(kode)) {
                            System.out.print("| MASUKKAN NAMA BARANG        >> "); barang.setNama(br.readLine());
                            System.out.print("| MASUKKAN MERK BARANG        >> "); barang.setMerk(br.readLine());
                            System.out.print("| MASUKKAN WARNA BARANG       >> "); barang.setWarna(br.readLine());
                            System.out.print("| MASUKKAN KATEGORI BARANG    >> "); barang.setKategori(br.readLine());
                            System.out.print("| MASUKKAN BERAT BARANG (Kg)  >> "); barang.setBerat(Double.parseDouble(br.readLine()));
                            System.out.print("| MASUKKAN HARGA BARANG (IDR) >> "); barang.setHarga(Integer.parseInt(br.readLine()));
                            System.out.println("""
                                                    \nBARANG BERHASIL DI UBAH!
                                """);
                            ketemu = true;
                            break;
                        }
                    }
                    if (ketemu == false) {
                    clear();
                    System.out.println("""
                                                        KODE TIDAK DITEMUKAN!
                                """);
                    }
                    break;
                case 4:
                    clear();
                    if (dataProduk.size() == 0){
                        System.out.println("""                    
                            

                                                                Data Masih kosong!!                

                                            """);
                    break;
                    }
                    Boolean kodeBenar = false;
                    System.out.println("+---------------------------------------------------------+");
                    System.out.println("|                    >> HAPUS BARANG <<                   |");
                    System.out.println("+---------------------------------------------------------+");
                    for (int i = 0; i < dataProduk.size(); i += 1) {
                        System.out.println("Produk >> [" + (i + 1)+"]");
                        dataProduk.get(i).display();
                    }
                    System.out.print("MASUKKAN KODE BARANG YANG AKAN DIHAPUS >> "); kode = br.readLine();
                    for (int j = 0; j < dataProduk.size(); j++) {
                        if ((dataProduk.get(j).getKode().equals(kode))) {
                            System.out.println("HAPUS BARANG " + kode + " ?");
                            System.out.print("KONFIRMASI TINDAKAN {y/n} >> "); String tindakan = br.readLine();
                            if (tindakan.equals("y")){
                                dataProduk.remove(j);
                                kodeBenar = true;
                                System.out.println("""

                                                    BERHASIL MENGHAPUS BARANG!
                                        """);
                                break;
                            }
                            else {
                                System.out.println("""

                                                        GAGAL MENGHAPUS BARANG!
                                        """);
                                kodeBenar = true;
                                break;
                            }
                        }
                    }
                            
                    if (kodeBenar == false) {
                        clear();
                        System.out.println("""

                                                            KODE TIDAK DITEMUKAN!
                                    """);
                        }
                            break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println(" Unknown Input!! ");
                break;
            }
        }
    }
    private static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
