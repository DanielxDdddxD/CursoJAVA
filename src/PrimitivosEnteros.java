public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a" + Byte.BYTES);
        System.out.println("tipo byte corresponde en byte a" + Byte.SIZE);
        System.out.println("valor maximo de un byrte" + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte" + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en short a" + Short.BYTES);
        System.out.println("tipo short corresponde en short a" + Short.SIZE);
        System.out.println("valor maximo de un short" + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short" + Short.MIN_VALUE);

        int numeroInt = 32768;
        System.out.println("numeroShort = " + numeroInt);
        System.out.println("tipo short corresponde en bytes a" + Integer.BYTES);
        System.out.println("tipo short corresponde en bytes a" + Integer.SIZE);
        System.out.println("valor maximo de un int " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int" + Integer.MIN_VALUE);

        long numeroLong = 2147483648999L;
        System.out.println("numeroLong = " + numeroLong);

        System.out.println("tipo short corresponde en short a" + Long.BYTES);
        System.out.println("tipo short corresponde en short a" + Long.SIZE);
        System.out.println("valor maximo de un Long" + Long.MAX_VALUE);
        System.out.println("Valor minimo de un Long" + Long.MIN_VALUE);

    }
}
