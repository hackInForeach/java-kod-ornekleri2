public abstract class GameCalculator {
    //abstrack bir sınıfın abstrack olabilmesi için abstrack imzası ile beslenmesi gerekiyor
    public abstract void hesapla(); // bu arkadaşı bu sınıfın çocukları kendileri vermek zorunda ve içermesi gerekiyor bunu
    public final void gameOver(){// bu arkadaş ise bu sınıfı kullanan herkez böyle kullanacak değiştiremez olduğu gibi kullanacak
        System.out.println("Game Over!");
    }
}
