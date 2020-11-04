package headfirst.factory.pizzafm;

public class BeijingStyleLambPizza extends Pizza{
    public BeijingStyleLambPizza() {
        name = "Beijing Style Lamb Pizza";
        dough = "Hand-made Dough";
        sauce = "Marinara Sauce";

        toppings.add("Lamb");
        toppings.add("Ricotta Cheese");
    }
}
