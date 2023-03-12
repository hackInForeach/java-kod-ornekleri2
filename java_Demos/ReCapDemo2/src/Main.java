public class Main {
    public static void main(String[] args) {
        double[] myList = {5.7, 3.4, 5.6, 1.2};

        for (double listNumber : myList) {
            System.out.println(listNumber);
        }
        System.out.println("--------------------");

        // liste içerisindeki elemanların toplamı
        double toplam = 0;
        for (double list : myList) {
            toplam = toplam + list;
        }
        System.out.println("Toplam sonuç= " + toplam);
        System.out.println("--------------------");

        // dizi içerisindeki en büyük sayıyı bul
        double enBuyuk = myList[0];
        for (double list : myList) {
            if (enBuyuk < list) {
                enBuyuk = list;
            }
        }
        System.out.println("Dizideki En büyük sayı: " + enBuyuk);

    }
}