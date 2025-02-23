

public class EjemploStringInmutable {

    public static void main(String[] args) {
        String curso = " programacion java";
        String profesor = "Andres Guzman";

        String resultado = curso.concat(profesor);
        System.out.println("curso  = " +curso);
        System.out.println("resultado  = " +resultado);
        System.out.println(curso == resultado);

        /*String resultado2 = curso.transform(c -> {    // java 12 o sup
            return c + " con " + profesor;
        });
        System.out.println("curso  = " +curso);
        System.out.println("resultado2  = " +resultado2);*/

        String resultado3 = curso.replace("a", "á");

        System.out.println("resultado = " + resultado);
        System.out.println("resultado3  = " +resultado3);


    }
    }
