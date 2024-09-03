package Java_Basic;

public class VongLapFor {
    public VongLapFor() {
    }

    public static void main(String[] args) {
        int[] a = new int[26];
        int b = 0;

        for(int i = 0; i <= 50; i += 2) {
            System.out.println(i);
            if (i % 2 == 0) {
                a[b] = i;
                ++b;
            }
        }

        System.out.println("các số chẵn từ 0 đến 50 là: ");
        int[] var7 = a;
        int var4 = a.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int number = var7[var5];
            System.out.print("" + number + " ");
        }

    }
}
