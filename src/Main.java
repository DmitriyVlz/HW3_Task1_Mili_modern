public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int amount = 20_000;
        int mili = (int) service.calculate(amount);
        System.out.println(mili);
    }
}

