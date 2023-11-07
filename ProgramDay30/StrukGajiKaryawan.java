package ProgramDay30;

public class StrukGajiKaryawan {
    public static void main(String[] args) {
        int jumlahHariKerja = 25 ;
        int gajiPerHari = 1200000; 
        int uangMakanPerHari = 15000;
        
        int gajiKotor = jumlahHariKerja * gajiPerHari;
        int totalUangMakan = jumlahHariKerja * uangMakanPerHari;
        int gajiBersih = gajiKotor - totalUangMakan; 
        
        System.out.println("<=========STRUK GAJI KARYAWAN=========>");
        
        System.out.println("Jumlah Hari Kerja\t: " + jumlahHariKerja);
        System.out.println("Gaji Perhari\t\t: Rp." + gajiPerHari);
        System.out.println("Uang Makan Perhari\t: Rp." + uangMakanPerHari);
        System.out.println("Gaji Kotor\t\t: Rp." + gajiKotor);
        System.out.println("Total Uang Makan\t\t: Rp." + totalUangMakan);
        System.out.println("Gaji Bersih\t\t: Rp." + gajiBersih);
    }
}
