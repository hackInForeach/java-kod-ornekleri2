public class Main {
    public static void main(String[] args) {
        System.out.println("Bu program sesli harfi bulur");

        String[] inceSesli = new String[8];
        inceSesli[0]="E";
        inceSesli[1]="İ";
        inceSesli[2]="Ö";
        inceSesli[3]="Ü";
        inceSesli[4]="e";
        inceSesli[5]="i";
        inceSesli[6]="ö";
        inceSesli[7]="ü";
        String[] kalinSesli = new String[8];
        kalinSesli[0]="A";
        kalinSesli[1]="I";
        kalinSesli[2]="O";
        kalinSesli[3]="U";
        kalinSesli[4]="a";
        kalinSesli[5]="ı";
        kalinSesli[6]="o";
        kalinSesli[7]="u";

        String harf="Ü";
        String inceSesMesaj="İnce Sesli",
                kalinSesMesaj="Kalın Sesli",
                erorMesaj="Lütfen 8 sesli harften birini giriniz!";
        boolean eror =false ;
        for (String ince:inceSesli){
            if (harf==ince){
                System.out.println("Girilen harf "+inceSesMesaj);
                eror=true;
                break;
            }
        }for (String kalin:kalinSesli){
            if (harf==kalin){
                System.out.println("Girilen harf "+kalinSesMesaj);
                eror=true;
                break;
            }
        }if (eror==false){
            System.out.println(erorMesaj);
        }
    }
}