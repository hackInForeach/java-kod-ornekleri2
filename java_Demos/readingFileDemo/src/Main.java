import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
         throws IOException: dosya okumayla ilgili olan hatalar
         */
        BufferedReader reader = null;
        int total = 0;
        try {
            // dosyayı önce belleğe alan sonrada okumamızı sağlayan bir class:
            reader = new BufferedReader(new FileReader("C:\\java_Demos\\readingFileDemo\\src\\sayilar.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);// herhangi bir değeri integere çevirme: Integer.valueOf();
            }
            System.out.println(total);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (NumberFormatException e1) {
            System.out.println(e1);
        } catch (IOException e2) {
            System.out.println(e2);
        } finally {
            /*
            dosya eğer bulunamazsa kapatacak birşetde olmaz
             oyüzden throws IOException ı public static void main(String[] args) ı
            yanına yazmamız gerekir
            */
            try {
                reader.close();
            } catch (Exception e) {

            }
        }

    }
}