public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setHunger(70);

        // Creazione di un cibo e consumo da parte della persona
        Food food = new Food("Pizza", 30);
        food.consume(person);
        System.out.println("Hunger dopo aver mangiato: " + person.getHunger());

        // Creazione di una bevanda e consumo da parte della persona
        Beverage beverage = new Beverage("Water", 20);
        beverage.consume(person);
        System.out.println("Thirst dopo aver bevuto: " + person.getThirst());
    }
}