import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
       // String numeroStr = sc.nextLine();

        int numeroDecimal = 0;
        try {
            numeroDecimal = sc.nextInt();//Integer.parseInt(numeroStr);
        } catch (Exception e) {
            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal: " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHex = "numero Hexadexcimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;   // el += sirve como concatenacion
        mensaje += "\n" + resultadoHex;
        System.out.println(mensaje);

    }
}
