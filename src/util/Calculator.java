package util;

public class Calculator {
    public final double PI = 3.14159;
    // final = valor constante, inalterável
    // padrão de constante usa letra maiúscula

    // SÃO METÓDOS ESTÁTICOS POIS ESTÃO SENDO DECLARADOS DENTRO DE UM MÉTODO ESTÁTICO (main)
    public double circumference (double radius){
        return 2.0 * PI * radius;
    }

    public double volume (double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
