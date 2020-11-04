package headfirst.factory.pizzaaf;

public class BeijingPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough() {
        return new HandMadeDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new RicottaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }

    public Lamb createLamb() {
        return new LambSteak();
    }
}
