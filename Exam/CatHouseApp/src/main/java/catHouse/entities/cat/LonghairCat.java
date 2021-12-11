package catHouse.entities.cat;

public class LonghairCat extends BaseCat{
    private final static int INITIAL_KILO=9;
    public LonghairCat(String name, String breed, double price) {
        super(name, breed, price);
        super.setKilograms(INITIAL_KILO);
    }
    @Override
    public void eating() {
        super.setKilograms(super.getKilograms()+3);
    }
}