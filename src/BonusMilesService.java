public class BonusMilesService {
    public long calculate(int amount) {
        int bonus = 20;
        int mili = amount / bonus;
        return mili;
    }
}
