package personalizedmealplangenerator;

// Class representing a Vegetarian Meal that implements the MealPlan interface
class VegetarianMeal implements MealPlan {

    // Method to get the description of the Vegetarian Meal
    @Override
    public String getMealPlan() {
        return "Vegetarian Meal: Includes vegetables, fruits, grains, and dairy.";
    }
}
