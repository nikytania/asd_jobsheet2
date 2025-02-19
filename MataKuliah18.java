public class MataKuliah18 {
  String kodeMk;
  String nama;
  int sks;
  int jumlahJam;

  //konstruktor default
  public MataKuliah18(){
  }

  //konstruktor berparameter
  public MataKuliah18(String kodeMk, String nama, int sks, int jumlahJam){
    this.kodeMk = kodeMk;
    this.nama = nama;
    this.sks = sks;
    this.jumlahJam = jumlahJam;
  }

  // method untuk menampilkan informasi mata kuliah
  void tampilInformasi(){
    System.out.println("Kode MK: " + kodeMk);
    System.out.println("Nama: " + nama);
    System.out.println("SKS: " + sks);
    System.out.println("Jumlah Jam: " + jumlahJam);
  }

  //method mengubah SKS
  void ubahSKS(int sksBaru){
    this.sks = sksBaru;
    System.out.println("SKS berhasil diubah menjadi: " + sks);
  }

  //method menambah jumlah jam
  void tambahJam(int jam){
    this.jumlahJam += jam;
    System.out.println("Jumlah jam berhasil ditambah. Sekarang: " + jumlahJam);
  }

  //method mengurangi jumlah jam
  void kurangiJam(int jam){
    if (jumlahJam >= jam){
      this.jumlahJam -= jam;
      System.out.println("Jumlah jam berhasil dikurangi. Sekarang " + jumlahJam);
    } else {
      System.out.println("Pengurangan jam tidak dapat dilakukan");
    }
  }
}
