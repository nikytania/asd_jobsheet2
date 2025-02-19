public class DosenMain18 {
  public static void main(String[] args) {

    // Objek pertama menggunakan konstruktor default
    Dosen18 dosen1 = new Dosen18();
    dosen1.idDosen = "DSN123";
    dosen1.nama = "Dr. Pangalila";
    dosen1.statusAktif = true;
    dosen1.tahunBergabung = 2010;
    dosen1.bidangKeahlian = "Pemrograman Web";

    dosen1.tampilInformasi();
    dosen1.setStatusAktif(false);
    System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
    dosen1.ubahKeahlian("Machine Learning");
    dosen1.tampilInformasi();

    System.out.println();
    
    // Objek kedua menggunakan konstruktor berparameter
    Dosen18 dosen2 = new Dosen18("DSN456", "Prof. Mahmudin", true, 2005, "Artificial Intelligent");
    dosen2.tampilInformasi();
    dosen2.setStatusAktif(true);
    System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
    dosen2.ubahKeahlian("Cyber Security");
    dosen2.tampilInformasi();
  }
}