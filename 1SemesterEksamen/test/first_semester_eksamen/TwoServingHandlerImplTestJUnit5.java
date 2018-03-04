package first_semester_eksamen;

import impl.ServingHandlerImpl;
import impl.ServingImpl;
import impl.Time;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoServingHandlerImplTestJUnit5 {
    /** JUnit 5 – Parameterized Tests */

    @DisplayName("Get total excess serving")
    @ParameterizedTest(name = "\"{0}{1}{2}\" should be {4}")
    @CsvSource({ "167, 166, 165, 3", "167, 165, 164, 2", "167, 166, 166, 4"})
    void getTotalExcessServings(int amount1, int amount2, int amount3, int expResult) {
        ServingHandler instance = new ServingHandlerImpl();
        ArrayList<Serving> servings = new ArrayList<Serving>();
        Time t = new Time("10:01");
        servings.add(new ServingImpl("24-12-2017", t, amount1, "André"));
        servings.add(new ServingImpl("24-12-2017", t, amount2, "André"));
        servings.add(new ServingImpl("24-12-2017", t, amount3, "Sofia"));

        int result = instance.getTotalExcessServings(servings);
        assertEquals(expResult, result);
    }
    @DisplayName("Get amount of wine missing in serveing")
    @ParameterizedTest(name = "\"{0}{1}{2}{3}\" should be {4}")
    @CsvSource({ "156, 155, 154, 153, 3", "156, 155, 154, 152, 4", "156, 155, 154, 151, 5"})
    void getTotalMissingServings(int amount1, int amount2, int amount3, int amount4, int expResult) {
        ServingHandler instance = new ServingHandlerImpl();
        ArrayList<Serving> servings = new ArrayList<Serving>();
        Time t = new Time("10:01");
        servings.add(new ServingImpl("24-12-2017", t, amount1, "André"));
        servings.add(new ServingImpl("24-12-2017", t, amount2, "André"));
        servings.add(new ServingImpl("24-12-2017", t, amount3, "Sofia"));
        servings.add(new ServingImpl("24-12-2017", t, amount4, "Paula"));
        int result = instance.getTotalMissingServings(servings);
        assertEquals(expResult, result);
    }


}