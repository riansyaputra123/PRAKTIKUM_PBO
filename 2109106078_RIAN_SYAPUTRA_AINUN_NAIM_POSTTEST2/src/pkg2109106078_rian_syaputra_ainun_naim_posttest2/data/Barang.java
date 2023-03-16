package pkg2109106078_rian_syaputra_ainun_naim_posttest2.data;

public class Barang {
    // Property
    private String Nama;
    private String Merk;
    private String Warna;
    private String Kategori;
    private String Kode;
    private int Harga;
    private double Berat;

    public String getNama() {
        return this.Nama;
    }

    public void setNama (String Nama) {
        this.Nama = Nama;
    }

    public String getMerk() {
        return this.Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getWarna() {
        return this.Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public String getKategori() {
        return this.Kategori;
    }

    public void setKategori(String Kategori) {
        this.Kategori = Kategori;
    }

    public String getKode() {
        return this.Kode;
    }

    public void setKode(String Kode) {
        this.Kode = Kode;
    }

    public int getHarga() {
        return this.Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public double getBerat() {
        return this.Berat;
    }

    public void setBerat(double Berat) {
        this.Berat = Berat;
    }

    

    // Constructor
    public Barang(String nama, String kode, String merk, String warna, String kategori, double berat, int harga){
        this.Nama = nama;
        this.Kode = kode;
        this.Merk = merk;
        this.Warna = warna;
        this.Kategori = kategori;
        this.Harga = harga;
        this.Berat = berat;  
    }

    // Method
}