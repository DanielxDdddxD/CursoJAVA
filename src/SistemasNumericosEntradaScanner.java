import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        String numeroStr = sc.nextLine();

        int numeroDecimal = 0;
        try {
             numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 11110;
        String mensajeBinario = "Numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeBinario);

        int numeroOctal = 036;
        String mensajeOctal = "numero hexadecimal de " + numeroOctal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeOctal);


        String mensajeHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;   // el += sirve como concatenacion
        mensaje += "\n" + mensajeHexa;
        System.out.println(mensaje);

    }
}
