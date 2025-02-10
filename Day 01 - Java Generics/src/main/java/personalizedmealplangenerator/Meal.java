package personalizedmealplangenerator;

// Generic class representing a Meal with a type parameter T that extends MealPlan
public class Meal<T extends MealPlan> {

    T mealPlan;  // Meal plan of type T

    // Constructor to initialize the Meal with the specified meal plan
    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    // Method to get the meal plan of the meal
    public T getMealPlan() {
        return mealPlan;
    }

    // Method to display the meal plan description
    public void displayMeal() {
        System.out.println(mealPlan.getMealPlan());
    }
}
