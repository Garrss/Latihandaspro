import java.util.Scanner;

public class LatihanResistor {
    public static void main(String[] args) {
        int R1, R2, R3, R4, I;
        double V;

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan R1 : ");
        R1 = in.nextInt();
        System.out.print("Masukka R2 : ");
        R2 = in.nextInt();
        System.out.print("Masukkan R3 : ");
        R3 = in.nextInt();
        System.out.print("Masukkan R4 : ");
        R4 = in.nextInt();
        System.out.print("Masukkan I : ");
        I = in.nextInt();

        double Rtotal;
        Rtotal = ((1.0 / R1) + (1.0 / R2) + (1.0 / R3)+ R4);
        V = I * Rtotal;

        System.out.println("Hasilnya adalah = " + V);
    }
}


    

