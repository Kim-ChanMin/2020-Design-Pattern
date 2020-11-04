package headfirst.factory.pizzafm;

public class SeoulStyleVeggiePizza extends Pizza{
    public SeoulStyleVeggiePizza() {
        name = "Seoul Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
