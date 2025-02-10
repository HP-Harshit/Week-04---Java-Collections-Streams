package personalizedmealplangenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PersonalizedMealPlanGeneratorTest {

    // Test for the VegetarianMeal class
    @Test
    void testVegetarianMeal() {
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        assertEquals("Vegetarian Meal: Includes vegetables, fruits, grains, and dairy.", vegetarianMeal.getMealPlan());
    }

    // Test for the VeganMeal class
    @Test
    void testVeganMeal() {
        VeganMeal veganMeal = new VeganMeal();
        assertEquals("Vegan Meal: Includes vegetables, fruits, grains, and plant-based proteins.", veganMeal.getMealPlan());
    }

    // Test for the KetoMeal class
    @Test
    void testKetoMeal() {
        KetoMeal ketoMeal = new KetoMeal();
        assertEquals("Keto Meal: High in fats, low in carbohydrates, and moderate in proteins.", ketoMeal.getMealPlan());
    }

    // Test for the HighProteinMeal class
    @Test
    void testHighProteinMeal() {
        HighProteinMeal highProteinMeal = new HighProteinMeal();
        assertEquals("High Protein Meal: Rich in protein sources like lean meats, beans, and legumes.", highProteinMeal.getMealPlan());
    }

    // Test for the Meal class
    @Test
    void testMeal() {
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        Meal<VegetarianMeal> meal = new Meal<>(vegetarianMeal);
        assertEquals(vegetarianMeal, meal.getMealPlan());
        meal.displayMeal();
    }

    // Test for the Utility class
    @Test
    void testUtility() {
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal highProteinMeal = new HighProteinMeal();

        List<MealPlan> mealList = List.of(vegetarianMeal, veganMeal, ketoMeal, highProteinMeal);
        List<Meal<? extends MealPlan>> validMealPlans = Utility.generateMealPlansHelper(mealList);

        assertEquals(4, validMealPlans.size());
    }
}
