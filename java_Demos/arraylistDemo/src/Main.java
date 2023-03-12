import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        // dizi böyle tanımlanıp import
        // edildiğinde içeride herşey olabilir!


        numbers.add(1);
        numbers.add('c');
        numbers.add(1112);
        numbers.add(13.2);
        numbers.add("Doğukan");

        System.out.println(numbers.size());//listede kaç kişi var
        System.out.println(numbers.get(2));//listenin n. ci sırasında kim var
        numbers.set(0,500);
        // bir dizi deki n. indext teki
        // elemanı değiştirmek .set(bunu,bununla);
        numbers.remove(2);
        // .remove(dizideki şu indexi sil)
        numbers.clear();
        // dizideki herşeyi sil


        System.out.println("*****************");

        for (Object number:numbers){
            System.out.println(number);
        }


//        int[] numbers = new int[]{1,2,3};
//        numbers = new int[4];
//        for (int number:numbers){
//            System.out.println(number);
//        }
    }
}