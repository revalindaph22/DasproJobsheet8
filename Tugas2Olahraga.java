import java.util.Scanner;

public class Tugas2Olahraga {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] Olahraga = {"Tenis Meja", "Basket", "Bulu Tangkis"};
        System.out.println("Daftar Cabang Olahraga di Polinema");
        System.out.print("Masukkan banyak politeknik yang mengikuti : ");
        int JumlahPoltek = sc.nextInt();
        sc.nextLine();
        
        int TotalAtlet = 0;
        for (int i = 1; i < JumlahPoltek; i++) {
            System.out.print("\nData Politeknik ke-" +i+ " : ");
            String NamaPoltek = sc.nextLine();
            for (int j = 0; j < Olahraga.length; j++) {
                System.out.print("Jumlah atlet cabang " + Olahraga[j] + " : ");
                int JumlahAtlet = sc.nextInt();
                sc.nextLine();
                
            TotalAtlet += JumlahAtlet;
            for (int k = 0; k <= JumlahAtlet; k++) {
                System.out.print("Nama atlet ke-" + k + " : ");
                String NamaAtlet = sc.nextLine();
            }
            System.out.println("=== " + JumlahAtlet + " atlet cabang " + Olahraga[j] + " dari " + NamaPoltek + " berhasil ditambahkan! ===");
            }
        }

        System.out.println("=== SEMUA DATA ATLET BERHASIL DITAMBAHKAN ===");
        System.out.println("Total Politeknik         : " + JumlahPoltek);
        System.out.println("Total Cabang Olahraga    : " + Olahraga.length);
        System.out.println("Total Keseluruhan Atlet  : " + TotalAtlet );
        sc.close();
    }
}