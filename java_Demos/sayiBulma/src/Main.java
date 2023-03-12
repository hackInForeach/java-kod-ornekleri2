public class Main {
    public static void main(String[] args) {
        int[] numbers=new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int aranacak = -4;
        boolean yes=false;
        for (int number:numbers){
            if (aranacak==number){
                yes=true;
                break;
            }
        }if(yes==true){
            System.out.println("Dizi içinde mevcuttur");
        }else {
            System.out.println("Dizi içinde mevcut değildir");
        }
    }
}