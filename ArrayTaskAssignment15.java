import java.util.Scanner;
public class ArrayTaskAssignment15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int sumElemen = sc.nextInt();
        int[] arr = new int[sumElemen];

        int scoreHigh = arr[0];
        int scoreLow = arr[0];
        int total = 0;

        for (int i = 0; i < sumElemen; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            total += arr[i];
            if (i == 0) {
                scoreHigh = arr[i];
                scoreLow = arr[i];
            } else {
                if (arr[i] > scoreHigh) {
                    scoreHigh = arr[i];
                }
                if (arr[i] < scoreLow) {
                    scoreLow = arr[i];
                }
            }
        }

        double rataRata = (double) total / sumElemen;

        System.out.println("Nilai Tertinggi: " + scoreHigh);
        System.out.println("Nilai Terendah: " + scoreLow);
        System.out.println("Nilai Rata-rata: " + rataRata);
    }
}
