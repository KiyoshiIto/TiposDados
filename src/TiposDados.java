public class TiposDados {

    public static void main(String[] args) {
        // dados tipo byte arazenam valores numéricos de -128 até 127
        byte b1 = -19;
        byte b2 = 10;

        // short: -32768 até 32767
        short s1 = 10000;

        // int: -2147483648 até 2137483647
        int i = 100000000;

        // long:- 9223372036854775808 até 9223372036854775807
        // deve-se utilizar ao final do número "L" ou "l" para definir corretamente como long
        long l = 1000000000000000000L;


        float f = 3.14F;

        double d1 = 3.14;
        double d2 = 3.14D;

        char c = 'w';

        String st = "Olá mundo";
        boolean bool = true;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c);
        System.out.println(st);
        System.out.println(bool);



    }
}
