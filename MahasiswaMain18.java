
public class MahasiswaMain18 {
  public static void main(String[] args) {
   Mahasiswa18 mhs = new Mahasiswa18();

   //atribut
   mhs.nama = "Niky Tania";
   mhs.nim = "244107060";
   mhs.kelas = "SIB 1B";
   mhs.ipk = 3.55;
   
   mhs.tampilkanInformasi();
   mhs.ubahKelas("SIB 1E");
   mhs.updateIpk(3.70);
   mhs.tampilkanInformasi();

  }
}
