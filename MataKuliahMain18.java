public class MataKuliahMain18 {
  public static void main(String[] args) {
    MataKuliah18 mk1 = new MataKuliah18();

    mk1.kodeMk = "26f";
    mk1.nama = "Basis Data";
    mk1.sks = 3;
    mk1.jumlahJam = 4;

    mk1.tampilInformasi();
    mk1.ubahSKS(4);
    mk1.tambahJam(1);
    mk1.kurangiJam(3);
    mk1.tampilInformasi();

    System.out.println();

    //object ke dua
    MataKuliah18 mk2 = new MataKuliah18("25f", "Algoritma dan Struktur Data", 3, 5);
    mk2.tampilInformasi();
    mk2.ubahSKS(5);
    mk2.tambahJam(1);
    mk2.kurangiJam(3);
    mk2.tampilInformasi();
  }
  
}
