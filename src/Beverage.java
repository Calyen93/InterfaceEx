class Beverage extends AbstractConsumable {
    public Beverage(String name, int effectiveness) {
        super(name, effectiveness);
    }

    @Override
    public void consume(Person person) {
        person.setThirst(person.getThirst() - effectiveness);
    }
}


