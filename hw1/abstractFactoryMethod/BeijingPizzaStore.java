package headfirst.factory.pizzaaf;

public class BeijingPizzaStore extends PizzaStore{
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new BeijingPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Beijing Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Beijing Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Beijing Style Clam Pizza");

        } else if (item.equals("lamb")) {
            pizza = new LambPizza(ingredientFactory);
            pizza.setName("Beijing Style Lamb Pizza");

        }
        return pizza;
    }
}
