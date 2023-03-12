import javax.swing.plaf.PanelUI;
import javax.swing.text.Style;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //readFile();
        //writeFile();
        //getFileInfo();
        //newFile();

    }

    public static void newFile() {
        File file = new File("C:\\java_Demos\\files\\students.txt");
        // bu kısıma dosya yolu girilir
        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu ");
            }else {
                System.out.println("Böyle bir dosya zaten mevcut ");
            }

            //file.createNewFile();
            // dosyo oluşturma komutudur fakat try catch içerisine almalısın herhagi bir hata olmasına karşı
            //oluşturduktan sonra true yada false döner
        }catch (IOException exception){
            exception.printStackTrace();
            // hatyı metin olarak ekrana basılması için : .printStackTrace();
        }
    }
    public static void getFileInfo(){
        File file = new File("C:\\java_Demos\\files\\students.txt");
        if (file.exists()){
             System.out.println("Böyle bir dosya mevcut: Özellikleri =");
             System.out.println("Dosya adı: "+file.getName());
             System.out.println("Dosya yolu: "+file.getAbsolutePath());
             System.out.println("Dosya yazılabilit mi: "+file.canWrite());
             System.out.println("Dosya okuabilir mi: "+file.canRead());
             System.out.println("Dosya boyutu(byte): "+file.length());

        }else {
            System.out.println("Böyle bir dosya mevcut değil!");
        }

    }
    public static void readFile(){
        File file=new File("C:\\java_Demos\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }catch (FileNotFoundException exception){
            exception.printStackTrace();
        }

    }
    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\java_Demos\\files\\students.txt",true));
            // true = dosyayı ekleme formatında aç üzerinedeğil ensonun yanına ekle
            writer.newLine();// şimdi ise enson bir sonraki satıra ekle
            writer.write("Ahmet");

            System.out.println("Dosya ya yazıldı: ");
            writer.close();
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }
}