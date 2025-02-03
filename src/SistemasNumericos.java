import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;
        try {
             numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
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

        int numeroHexa = 0x1e;
        String mensajeHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println("numeroHexa = " + numeroHexa);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;   // el += sirve como concatenacion
        mensaje += "\n" + mensajeHexa;
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
