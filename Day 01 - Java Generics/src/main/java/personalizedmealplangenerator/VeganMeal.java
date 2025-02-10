package personalizedmealplangenerator;

// Class representing a Vegan Meal that implements the MealPlan interface
class VeganMeal implements MealPlan {

    // Method to get the description of the Vegan Meal
    @Override
    public String getMealPlan() {
        return "Vegan Meal: Includes vegetables, fruits, grains, and plant-based proteins.";
    }
}
