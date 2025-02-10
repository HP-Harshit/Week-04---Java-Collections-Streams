package personalizedmealplangenerator;

import java.util.List;

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {

        // Creating instances of different meal plans
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal highProteinMeal = new HighProteinMeal();

        // Adding meal plans to a list
        List<MealPlan> mealList = List.of(vegetarianMeal, veganMeal, ketoMeal, highProteinMeal);

        // Generating a list of valid meal plans
        List<Meal<? extends MealPlan>> validMealList = Utility.generateMealPlansHelper(mealList);

        // Displaying all valid meal plans
        for (Meal<? extends MealPlan> meal : validMealList) {
            meal.displayMeal();
        }
    }
}
