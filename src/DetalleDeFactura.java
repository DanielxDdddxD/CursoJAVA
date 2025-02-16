import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura");
        String nombreFactura = sc.nextLine();

        System.out.println("Ingrese el precio del primer producto: ");
        double precioProducto = sc.nextDouble();

        System.out.println("Ingrese el precio del segundo producto: ");
        double precioSegundoProducto = sc.nextDouble();

        double totalBruto = precioProducto + precioSegundoProducto;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        System.out.println("La factura  producto de  " + nombreFactura + " Tiene un total bruto de " + totalBruto
                + " con un impuesto de " + impuesto + " y el monto despues de impuesto es de " + totalNeto);


    }
}
