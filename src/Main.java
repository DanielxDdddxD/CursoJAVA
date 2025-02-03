import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String numerostr = JOptionPane.showInputDialog(null , "Esto es para ventana de mensaje ");
        int numeroDecimal =  Integer.parseInt(numerostr);
        System.out.println("numeroDecimal = " + numeroDecimal);

        int numeroBinario = 0b11110;
        System.out.println("numeroBinario" + numeroBinario);

        System.out.println("numero octal de "+ numeroDecimal +  " = " + Integer.toOctalString(numeroDecimal ));
        int numeroOctal  = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal = " + numeroDecimal +" = " + Integer.toHexString(numeroDecimal ));
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);


    }
}