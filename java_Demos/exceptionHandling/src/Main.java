public class Main {
    public static void main(String[] args) {
        try {// burası kodun doğru çalışıp çalımadığını dener
            int[] numbers = new int[]{1, 1, 4, 5, 3};
            System.out.println(numbers[10]);

        }
        catch (ArrayIndexOutOfBoundsException exception) {//burası alınan hatanın karşılığında gösterilmesi isteneni ekranda gösterir ve birden fazla cath bloğu olabilir
            System.out.println("Dizi sınırları aşıldı");
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println("Elmayı armut gibi düşünemezsin");
        }
        catch (Exception exception){
            System.out.println("Loglandı! = "+ exception);
        }
        finally {// burası ister try ister catch bloğu çalışmasın sonra çalışır
            System.out.println("Ben her türlü çalışırım ama en son ben çalışırım");
        }
    }
}