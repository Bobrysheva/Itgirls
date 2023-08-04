package week2;

public class BoxingUnboxing {
    public static void main (String[] args) {
        byte a = 5;
        Byte boxed;
        boxed= new Byte(a);
        a = boxed.byteValue();

        short b = 2;
        Short boxedS;
        boxedS = Short.valueOf(b);
        b = boxedS;

        int c = 3;
        Integer boxedC;
        boxedC = c;
        c = boxedC;


    }

}
