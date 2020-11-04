package headfirst.factory.pizzaaf;

public class LambPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public LambPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        lamb = ingredientFactory.createLamb();
    }
}
