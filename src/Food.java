class Food extends AbstractConsumable{
    private String name;

    private int effectiveness;

    public Food(String name, int effectiveness) {
        super (name, effectiveness);
    }

    //Indica che una dichiarazione di metodo è destinata a sovrascrivere una dichiarazione di metodo in un supertipo.
    // Se un metodo è annotato con questo tipo di annotazione, i compilatori sono tenuti a generare un messaggio di errore
    // a meno che non sia soddisfatta almeno una delle seguenti condizioni:
    @Override
    public void consume(Person person) {
        if (person.getHunger() <= 50) {
            return;
        }
        person.setHunger(person.getHunger() - effectiveness);
    }
}
