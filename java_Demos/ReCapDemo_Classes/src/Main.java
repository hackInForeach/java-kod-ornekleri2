public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int topla1=calculator.topla(1,2,3);
        float bol1=calculator.bol(100,3);
        int carp1=calculator.carp(1,2,3);
        int cikar1=calculator.cikar(1,2,3);

        System.out.println(
                topla1+"\n"
                +bol1+"\n"
                +carp1+"\n"
                +cikar1);

    }
}