public class EjemploString {
    public static void main(String[] args) {
        String curso = "programacion java";
        String curso2 = new String("programacion Java");
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);//ignorecase ignora mayusculas y minusculas
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        String curso3 = "programacion java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);

    }
}
