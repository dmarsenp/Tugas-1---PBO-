class Buku {
    private String judul;
    private String pengarang;
    private double harga;

    Buku(String judul, String pengarang, double harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;

        System.out.println(judul + " -- " + pengarang + " -- " + harga);
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return judul;
    }

    public double getHarga() {
        return harga;
    }
}

class tugas2 {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 300000);
        Buku buku2 = new Buku("UML ", "Ivar Jacobson", 400000);

    }
}
