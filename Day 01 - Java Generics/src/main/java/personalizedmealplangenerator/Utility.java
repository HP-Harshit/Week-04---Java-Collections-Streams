package personalizedmealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class Utility {

    // Method to check if a meal plan is valid
    public static <T extends MealPlan> boolean isValidMealPlan(T mealPlan) {
        return mealPlan != null;
    }

    // Helper method to generate a list of valid meal plans for a wildcard type
    public static List<Meal<? extends MealPlan>> generateMealPlansHelper(List<? extends MealPlan> mealPlans) {
        List<Meal<? extends MealPlan>> validMealPlans = new ArrayList<>();

        // Loop through each meal plan in the list
        for (MealPlan mealPlan : mealPlans) {
            // Check if the meal plan is valid
            if (isValidMealPlan(mealPlan)) {
                // Add the valid meal plan to the list
                validMealPlans.add(new Meal<>(mealPlan));
            }
        }
        return validMealPlans;
    }
}
