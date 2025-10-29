import java.util.Scanner;

public class Star21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // membuat objek Scanner bernama sc
        // Scanner : membaca input pengguna

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        // input nilai N berjenis data Integer
        // Integer ukuran 4 byte (1 byte = 8 bit → 4 × 8 = 32 bit)
        // batas Integer -2,147,483,648 sampai 2,147,483,647.

        // sintaks (aturan penulisan code program) perulangan
        for (int i = 1; i > N; i++) { //mencetak nilai N, dimana output <= N 
            System.out.print("*");
            //format harus print, untuk ingin menampilkan tanpa ada baris baru
        }
    sc.close();
    // menutup objek Scanner setelah selesai digunakan
    // hemat memori dan mencegah kebocoran sumber daya dalam program
    }
}
