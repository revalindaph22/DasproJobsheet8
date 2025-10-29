import java.util.Scanner;

public class RataNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalNilai, rataNilai;
        int j = 1;

        while (j <= 5) {
            System.out.println("Input Nilai Mahasiswa ke " + j);
            totalNilai = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Nilai ke-" + i + " = ");
            int nilaiMhs = sc.nextInt();
            totalNilai += nilaiMhs;
        }

        rataNilai = totalNilai / 5;
        System.out.println("Rata-rata Nilai Mahasiswa ke " + j + " adalah " + rataNilai);
        System.out.println();
        j++;
        }
        sc.close();
    }
}
