
package impl;

import first_semester_eksamen.Sample;
import first_semester_eksamen.Serving;
import first_semester_eksamen.ServingHandler;
import first_semester_eksamen.TimeFormatException;
import java.io.IOException;
import java.util.ArrayList;

public class ServingHandlerImpl implements ServingHandler{

    @Override
    public String readFile(String filename) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Serving> getServings(String data) throws TimeFormatException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Serving getHighestServing(ArrayList<Serving> servings) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Serving getLessServing(ArrayList<Serving> servings) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getValidServings(Serving serving) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isTooMuch(int limit, ArrayList<Serving> servings) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sortByTime(ArrayList<Serving> servings) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sortByAmount(ArrayList<Serving> servings) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Serving> getTooHighServings(int max, int min, ArrayList<Serving> servings) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Serving> getLessServings(int limit, ArrayList<Serving> servings) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTotalExcessServings(ArrayList<Serving> servings) {
        return 0;
    }

    @Override
    public int getTotalMissingServings(ArrayList<Serving> servings) {
        return 0;
    }

}
