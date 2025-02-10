package personalizedmealplangenerator;

// Class representing a High Protein Meal that implements the MealPlan interface
class HighProteinMeal implements MealPlan {

    // Method to get the description of the High Protein Meal
    @Override
    public String getMealPlan() {
        return "High Protein Meal: Rich in protein sources like lean meats, beans, and legumes.";
    }
}
