package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final double PI = 3.14159;
    // final = valor constante, inalterável
    // padrão de constante usa letra maiúscula

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);

        sc.close();

        // NÃO PODE CHAMAR MÉTODOS NÃO-ESTÁTICO NUM MÉTODO ESTÁTICO (main é um método estático)
        // por exemplo: se os métodos circumference e volume não fossem static, não poderiam está na classe main
    }

    // SÃO METÓDOS ESTÁTICOS POIS ESTÃO SENDO DECLARADOS DENTRO DE UM MÉTODO ESTÁTICO (main)
    public static double circumference (double radius){
        return 2.0 * PI * radius;
    }

    public static double volume (double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

}