import java.util.Scanner;
public class Ex005 {
    public static void main(String[] args) throws Exception {
        double metros, centimetros;
        System.out.println("Dite o valor em metros: ");
        Scanner tc = new Scanner(System.in);
        metros = tc.nextDouble();
        tc.close();

        centimetros = metros * 100;

        System.out.println("Em centímetros o valor é de: " + centimetros+" cm");

    }
}
