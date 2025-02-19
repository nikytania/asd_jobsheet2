public class Dosen18 {
  String idDosen;
  String nama;
  boolean statusAktif;
  int tahunBergabung;
  String bidangKeahlian;

  // Konstruktor default
  public Dosen18() {
  }

  // Konstruktor berparameter
  public Dosen18(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
      this.idDosen = idDosen;
      this.nama = nama;
      this.statusAktif = statusAktif;
      this.tahunBergabung = tahunBergabung;
      this.bidangKeahlian = bidangKeahlian;
  }

  // Method untuk menampilkan informasi dosen
  void tampilInformasi() {
      System.out.println("ID Dosen: " + idDosen);
      System.out.println("Nama: " + nama);
      System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
      System.out.println("Tahun Bergabung: " + tahunBergabung);
      System.out.println("Bidang Keahlian: " + bidangKeahlian);
  }

  // Method untuk mengatur status aktif
  void setStatusAktif(boolean status) {
      this.statusAktif = status;
      System.out.println("Status aktif berhasil diubah menjadi: " + (status ? "Aktif" : "Tidak Aktif"));
  }

  // Method untuk menghitung masa kerja dosen
  int hitungMasaKerja(int thnSkrg) {
      return thnSkrg - tahunBergabung;
  }

  // Method untuk mengubah bidang keahlian
  void ubahKeahlian(String bidang) {
      this.bidangKeahlian = bidang;
      System.out.println("Bidang keahlian berhasil diubah menjadi: " + bidangKeahlian);
  }
}