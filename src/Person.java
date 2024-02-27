public class Person {
    private int hunger;

    private int thirst;

    private String name;

    public void Person(int hunger, int thirst, String name) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.name = name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }
}

//Accoppiare OnEat e OnDrink in consumable che diventa un supertipo di food e beverage e trasformalo in una classe astratta e interfaccia.
