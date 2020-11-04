package headfirst.factory.pizzafm;

public class BeijingPizzaStore extends PizzaStore{
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new BeijingStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new BeijingStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new BeijingStyleClamPizza();
        } else if (item.equals("lamb")) {
            return new BeijingStyleLambPizza();
        } else return null;
    }
}
