public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1000;

        int rublesForOneBonusMile = 20;

        int quantityOfBonusMiles = ticketPrice / rublesForOneBonusMile;

        System.out.println("Бонусные мили: " + quantityOfBonusMiles);
    }
}
