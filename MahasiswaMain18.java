
public class MahasiswaMain18 {
  public static void main(String[] args) {
   Mahasiswa18 mhs1 = new Mahasiswa18();

   //atribut
   mhs1.nama = "Muhammad Ali Farhan";
   mhs1.nim = "2241720171";
   mhs1.kelas = "SI 2J";
   mhs1.ipk = 3.55;
   
   mhs1.tampilkanInformasi();
   mhs1.ubahKelas("SI 2K");
   mhs1.updateIpk(3.60);
   mhs1.tampilkanInformasi();

    //mahasiswa dengan kontruktor berparameter
   Mahasiswa18 mhs2 = new Mahasiswa18("Annisa Nabila","2141720",3.25,"TI 2L");
   mhs2.updateIpk(3.30);
   mhs2.tampilkanInformasi();

   //object baru konstruktor berparameter
   Mahasiswa18 mhsniky = new Mahasiswa18("Niky Tania","244107060",3.75,"SIB 1B" );
   mhsniky.tampilkanInformasi();

  }
}
