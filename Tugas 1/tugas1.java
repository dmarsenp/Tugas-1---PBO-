class Barang {
    private String idProduk;
    private String nama;
    private double harga;

    Barang(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;

        System.out.println(idProduk + "--" + nama + "--" + harga);
    }

    Barang(String idProduk, String nama) {
        this.idProduk = idProduk;
        this.nama = nama;

    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public void print() {
        System.out.println(idProduk + "--" + nama + "--" + harga);
    }
}

class tugas1 {
    public static void main(String[] args) {
        Barang barang1 = new Barang("BRG-001", "Tas Gucci");
        barang1.setHarga(1200);

        Barang barang2 = new Barang("BRG-002", "Printer Epson L355");
        barang2.setHarga(200);

        barang1.print();
        barang2.print();

        Barang barang3 = new Barang("BRG-003", "Koper", 150);
        Barang barang4 = new Barang("BRG-004", "Helm", 20);

        System.out.println("Total Harga = " + (barang1.getHarga() + barang3.getHarga() + barang4.getHarga()));
    }
}