public class Main {
    public static void main(String[] args) {
        GameCalculator[] gameCalculators = new GameCalculator[]{
                new KidsGameCalculator(), new ManGameCalculator(), new WomanGamaCalculato() , new OlderGameCalculator()
        };
        for (GameCalculator calculators:gameCalculators){
            calculators.gameOver();
            calculators.hesapla();
            System.out.println("------------");
        }

    }
}