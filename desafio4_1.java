import java.util.Scanner;

public class desafio4_1 {

    //la función f(x)
    public static double f(double x) {
        return 25 * Math.pow(x, 3) - 6 * Math.pow(x, 2) + 7 * x - 88;
    }

    //  primera derivada de f(x)
    public static double fPrim(double x) {
        return 75 * Math.pow(x, 2) - 12 * x + 7;
    }

    //segunda derivada de f(x)
    public static double fDoblePrim(double x) {
        return 150 * x - 12;
    }

    //  tercera derivada de f(x)
    public static double fTriplePrim(double x) {
        return 150;
    }

    public static void main(String[] args) {
        // Definimos los valores de x0 y x1
    	Scanner sc = new Scanner(System.in);

    	 System.out.print("Introduce el valor de x0: ");
	        double x0 = sc.nextDouble();

	        System.out.print("Introduce el valor de x1: ");
	        double x1 = sc.nextDouble();
        double h = x1 - x0;

        // Aproximación de primer orden
        double aproxPrimerOrden = f(x0) + fPrim(x0) * h;

        // Aproximación de segundo orden
        double aproxSegundoOrden = f(x0) + fPrim(x0) * h + (fDoblePrim(x0) / 2) * Math.pow(h, 2);

        // Aproximación de tercer orden
        double aproxTercerOrden = f(x0) + fPrim(x0) * h + (fDoblePrim(x0) / 2) * Math.pow(h, 2)
                + (fTriplePrim(x0) / 6) * Math.pow(h, 3);

        // Resultados
        System.out.println("Aproximación de primer orden: " + aproxPrimerOrden);
        System.out.println("Aproximación de segundo orden: " + aproxSegundoOrden);
        System.out.println("Aproximación de tercer orden: " + aproxTercerOrden);

        // Valor exacto de f(x1)
        System.out.println();
        double valorExacto = f(x1);
        System.out.println("Valor exacto de f(x1): " + valorExacto);
        
        //error
        System.out.println();
        System.out.println("error relativo porcentual de cada aprox: ");
        System.out.println("Error de primer orden: " + Math.abs((valorExacto-aproxPrimerOrden)/valorExacto)*100);
        System.out.println("Error de segundo orden: " + Math.abs((valorExacto-aproxSegundoOrden)/valorExacto)*100);
        System.out.println("Error de tercer orden: " + Math.abs((valorExacto-aproxTercerOrden)/valorExacto)*100);
    }
}
