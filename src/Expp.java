import java.util.Scanner;
public class Expp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Giai PT Bac 2 Ax*x + Bx + C = 0");
        System.out.print("nhap A: " );
        double A = sc.nextDouble();
        System.out.print("nhap B: " );
        double B = sc.nextDouble();
        System.out.print("nhap C: " );
        double C = sc.nextDouble();

        QuadraticEquation aa = new QuadraticEquation(A, B, C);
        double Z = aa.getDiscriminant();
        if (Z < 0) System.out.println("Phuong trinh vo nghiem.");
        else if (Z == 0) System.out.println("PT co nghiem kep X1=X2= " + aa.getRoot1());
        else System.out.println("Pt co 2 nghiem la  X1 = " + aa.getRoot1() + " , X2 = " + aa.getRoot2());

    }


}
