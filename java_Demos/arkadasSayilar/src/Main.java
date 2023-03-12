public class Main {
    public static void main(String[] args) {
        System.out.println("arkadaş sayılar\n");
        //karşılıklı sayıların kendileri hariç pozitif bölenleri toplamı karşısındaki sayıya eşitse bunlara arkadaş sayı denir

        int number1=220,number2=2840;
        int total1=0,total2=0;
        for (int i =1;i<number1;i++){
            if (number1%i==0){
                total1=total1+i;
            }
        }
        if (total1==number2){
            for (int i=1;i<number2;i++){
                if (number2%i==0){
                    total2=total2+i;
                }
            }
        }
        if (total2==number1){
            System.out.println("Tebrikler arkadaş sayıyı buldunuz!");
            System.out.println("number1: "+number1+" total2: "+total2);
            System.out.println("number2: "+number2+" total1: "+total1);
        }else {
            System.out.println("Tebrikler arkadaş sayıyı BULAMADINIZ!");
            System.out.println("number1: "+number1+" total2: "+total2);
            System.out.println("number2: "+number2+" total1: "+total1);
        }
    }
}