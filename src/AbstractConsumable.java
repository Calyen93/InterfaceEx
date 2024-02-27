abstract class AbstractConsumable implements Consumable {
    protected String name;
    protected int effectiveness;

    public AbstractConsumable(String name, int effectiveness) {
        this.name = name;
        this.effectiveness = effectiveness;
    }
}