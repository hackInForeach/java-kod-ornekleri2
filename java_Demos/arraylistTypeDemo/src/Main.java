import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cties = new ArrayList<String>();
        // <hangi tip ile çalışılack??>
        cties.add("Ankara");
        cties.add("İstanbul");
        cties.add("İzmir");
        cties.add("Aydın");

        cties.remove(1);
        cties.set(0,"ahmet");
        //cties.clear();
        System.out.println(cties.get(2));
        Collections.sort(cties);
        //koleksiyonu sırala(Collections.sort(liste))

        System.out.println("////////////");

        for (String ctiy : cties) {
            System.out.println(ctiy);
        }

    }
}