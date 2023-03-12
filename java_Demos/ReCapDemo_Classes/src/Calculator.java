import java.util.Arrays;

public class Calculator {
    public int topla(int... number1) {
        int sonuc = 0;
        for (int number : number1) {
            sonuc = sonuc + number;
        }
        return sonuc;
    }

    public int cikar(int... number1) {
        int sonuc = 0;
        for (int number : number1) {
            sonuc = number - sonuc;
        }
        return sonuc;
    }

    public int carp(int... number1) {
        int sonuc = 1;
        for (int number : number1) {
            sonuc = sonuc * number;
        }
        return sonuc;
    }

    public float bol(float number1,float number2) {
        return number1/number2;
    }
}
