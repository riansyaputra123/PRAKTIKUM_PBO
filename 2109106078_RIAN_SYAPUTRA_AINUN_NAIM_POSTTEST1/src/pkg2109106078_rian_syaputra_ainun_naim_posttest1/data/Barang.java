package pkg2109106078_rian_syaputra_ainun_naim_posttest1.data;

public class Barang {
    // Property
    private String nama_barang, merk_barang, warna_barang, kategori_barang, kode_barang;
    private int harga_barang;
    private double berat_barang;

    // Constructor
    public Barang(String nama, String kode, String merk, String warna, String kategori, double berat, int harga){
        this.nama_barang = nama;
        this.kode_barang = kode;
        this.merk_barang = merk;
        this.warna_barang = warna;
        this.kategori_barang = kategori;
        this.harga_barang = harga;
        this.berat_barang = berat;  
    }

    // Method
    public void display() {
        System.out.println("NAMA     >> " + this.nama_barang);
        System.out.println("KODE     >> " + this.kode_barang);
        System.out.println("MERK     >> " + this.merk_barang);
        System.out.println("WARNA    >> " + this.warna_barang);
        System.out.println("KATEGORI >> " + this.kategori_barang);
        System.out.println("BERAT    >> " + this.berat_barang + " Kg");
        System.out.println("HARGA    >> IDR " + this.harga_barang);
        System.out.println("+---------------------------------------------------------+");
    }

    public void setNama (String nama) {
        this.nama_barang = nama;
    }
    public void setKode (String kode) {
        this.kode_barang = kode;
    }
    public void setMerk (String merk) {
        this.merk_barang = merk;
    }
    public void setWarna (String warna) {
        this.warna_barang = warna;
    }
    public void setKategori (String kategori) {
        this.kategori_barang = kategori;
    }
    public void setBerat (double berat) {
        this.berat_barang = berat;
    }
    public void setHarga (int harga) {
        this.harga_barang = harga;
    }
    public String getKode(){
        return kode_barang;
    }
}