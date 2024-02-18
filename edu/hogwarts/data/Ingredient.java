package edu.hogwarts.data;

public class Ingredient extends TeachingMaterial {
    String name;
    double amount;
    String unit;

    public Ingredient(String name, boolean onShoppingList, boolean required, boolean provided, String notes, double amount, String unit) {
        this.name = name;
        this.onShoppingList = onShoppingList;
        this.required = required;
        this.provided = provided;
        this.notes = notes;
    }
    public Ingredient() {
        
    }
}
