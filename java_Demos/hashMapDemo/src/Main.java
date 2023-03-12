import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap <String,String> dictionary = new HashMap<String,String>();
        dictionary.put("book","kitap");
        // ilk değer ikincisinin karşılığıdır ve .pu ile ekleriz
        dictionary.put("pencil","kalem");
        dictionary.put("could","soğuk");
        dictionary.put("hot","sıcak");
        dictionary.put("hat","şapka");


        //dictionary.remove("could");
        //dictionary.clear();
        System.out.println(dictionary.size());

        System.out.println(dictionary.get("could"));
        System.out.println("*****************");

        for (String item: dictionary.keySet()){
            System.out.println("Eleman-"+item+"/ Değer-"+dictionary.get(item));
        }


    }
}