package guru.qa;

public class Main {

    public static void main(String[] args) {

        byte typeByte; // = 0, -128 до 127 включительно, 1 байт
        short typeShort; // = 0, -32 768 до 32,767 включительно, 2 байта
        int typeInt; // = 0, -2147483648 до 2147483647 включительно, 4 байта
        long typeLong; // = 0L, –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807, 8 байт
        float typeFloat; // = 0.0f, -3.4*1038 до 3.4*1038, 4 байта
        double typeDouble; // = 0.0d, ±4.9*10-324 до ±1.7976931348623157*10308, 8 байт
        boolean typeBoolean; // false, 1 бит (но размер не определяется)
        char typeChar; // '\u0000', '\u0000' до '\uffff', один 16-битный символ Unicode

        Byte tByte = Byte.MAX_VALUE;
        Short tShort = Short.MIN_VALUE;
        Integer tInt = Integer.MAX_VALUE;
        Long tLong = Long.MIN_VALUE;
        Float tFloat = Float.MAX_VALUE;
        Double tDouble = Double.MIN_VALUE;
        Boolean tBoolean = Boolean.TRUE;
        Character tChar = Character.MIN_VALUE;
        String tString = "Hello, world!";

        byte aByte = 127;
        byte aByte1 = 2;
        short aShort = 32700;
        short aShort1 = 32767;
        int aInt = 100;
        int aInt1 = 50;
        double aDouble = 278.5;

        // Операторы математические + - * / %
        System.out.println(aByte + aByte1);
        System.out.println(aShort + aShort1);
        System.out.println((aInt + aInt1) / aDouble);
        System.out.println((aInt + aInt1) % aDouble);
        System.out.println(aInt - aDouble);
        System.out.println(aInt + aDouble);

        byte b0 = (byte) (Byte.MAX_VALUE + 1);
        System.out.println(b0 + " = Max_byte + 1");
        short s0 = (short) (Short.MIN_VALUE - 1);
        System.out.println(s0 + " = Min_short - 1");
        int i0 = Integer.MAX_VALUE + 1;
        System.out.println(i0 + " = Max_integer + 1"); //2147483647


        // Операторы условные > < >= <= == != !
        System.out.println(2 > 1 && 12 <= 2); // false
        System.out.println(1 > 2 || 12 >= 12); // true
        System.out.println((aInt + aInt1) / aDouble == 0 || (aInt + aInt1) % aDouble != 0); // true


        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Число " + i + " четное");
            } else {
                System.out.println("Число " + i + " нечетное");
            }
        }


    }
}