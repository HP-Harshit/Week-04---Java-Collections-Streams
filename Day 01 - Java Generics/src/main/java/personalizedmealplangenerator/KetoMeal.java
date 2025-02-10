package personalizedmealplangenerator;

// Class representing a Keto Meal that implements the MealPlan interface
class KetoMeal implements MealPlan {

    // Method to get the description of the Keto Meal
    @Override
    public String getMealPlan() {
        return "Keto Meal: High in fats, low in carbohydrates, and moderate in proteins.";
    }
}
