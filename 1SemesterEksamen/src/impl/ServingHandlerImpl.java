
package impl;

import first_semester_eksamen.Sample;
import first_semester_eksamen.Serving;
import first_semester_eksamen.ServingHandler;
import first_semester_eksamen.TimeFormatException;

import java.io.IOException;
import java.util.ArrayList;

public class ServingHandlerImpl implements ServingHandler {
    /** @author Cherry Rose Semeña */
    @Override
    public void sortByTime(ArrayList<Serving> servings) {
    }
    /** @author Cherry Rose Semeña */
    @Override
    public String readFile(String filename) throws IOException {
        return null;
    }
    /** @author Cherry Rose Semeña */
    @Override
    public ArrayList<Serving> getServings(String data) throws TimeFormatException {
        return null;
    }

    /** @author Emmely Lundberg */
    @Override
    public Serving getHighestServing(ArrayList<Serving> servings) {
        Serving highest = null;
        int size = servings.size();
        int highestValue = -10;

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                highestValue = servings.get(i).getAmount();
                highest = servings.get(i);
            }
                if (servings.get(i).getAmount() > highestValue) {
                highest = servings.get(i);
                highestValue = servings.get(i).getAmount();
            }
        }
        return highest;
    }

    /** @author Emmely Lundberg */
    @Override
    public Serving getLessServing(ArrayList<Serving> servings) {
        Serving lowest = null;
        int size = servings.size();
        int lowestValue = -1;

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                lowestValue = servings.get(i).getAmount();
                lowest = servings.get(i);
            }
            if (servings.get(i).getAmount() < lowestValue) {
                lowest = servings.get(i);
                lowestValue = servings.get(i).getAmount();
            }
        }
        return lowest;
    }
    /** @author Cherry Rose Semeña */
    @Override
    public ArrayList<Serving> getValidServings(int max, int min, ArrayList<Serving> servings) {
        return null;
    }

    /** @author Emmely Lundberg */
    @Override
    public boolean isTooMuch(int limit, Serving serving) {

        if (serving.getAmount() > limit) {
            return true;
        }
        return false;
    }
    /** @author Cherry Rose Semeña */
    @Override
    public void sortByAmount(ArrayList<Serving> servings) {

    }
    /** @author Cherry Rose Semeña */
    @Override
    public ArrayList<Serving> getTooHighServings(int max, ArrayList<Serving> servings) {
        return null;
    }
    /** @author Cherry Rose Semeña */
    @Override
    public ArrayList<Serving> getLessServings(int limit, ArrayList<Serving> servings) {
        return null;
    }

    /** @author Emmely Lundberg */
    @Override
    public int getTotalExcessServings(int max, ArrayList<Serving> servings) {
        int size = servings.size();
        int amount = 0;

        for (int i = 0; i < size; i++) {
            if (servings.get(i).getAmount() > max) {
                amount += servings.get(i).getAmount();
            }
        }
        return amount;
    }

    /** @author Emmely Lundberg */
    @Override
    public int getTotalMissingServings(int min, ArrayList<Serving> servings) {
        int size = servings.size();
        int amount = 0;

        for (int i = 0; i < size; i++) {
            if (servings.get(i).getAmount() > min) {
                amount += min - servings.get(i).getAmount();
            }
        }
        return amount;
    }

}
