package impl;

import first_semester_eksamen.Serving;
import first_semester_eksamen.ServingHandler;
import first_semester_eksamen.TimeFormatException;
import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class ServingHandlerImpl implements ServingHandler {

    /**
     * @author Cherry Rose Semeña
     */
    @Override
    public void sortByTime(ArrayList<Serving> servings) {
    }

    /**
     * @author Cherry Rose Semeña
     */
    @Override
    public String readFile(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        StringBuilder sb = new StringBuilder();
        try {
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        } finally {
            br.close();
        }
        String contents = sb.toString();
        return contents;
    }

    /**
     * @author Cherry Rose Semeña
     */
    @Override
    public ArrayList<Serving> getServings(String data) throws TimeFormatException {
        ArrayList<Serving> servings = new ArrayList();
        String[] lines = data.split("\n");
        
        for (int i = 1; i < lines.length-1; i++) {
            if (lines[i].length() > 0) {
//                System.out.println("THE LINE IS " + lines[i]);
                String[] arr = lines[i].split(",");
                String date = arr[0];
                String[] tm = arr[1].split(":");
                int hr = Integer.parseInt(tm[0]);
                int min = Integer.parseInt(tm[1]);
                Time time = new Time(hr, min);
//                System.out.println("Amt" + arr[2] + ".");
                boolean isNumber = Pattern.matches("[0-9]+", arr[2]);
                int amt;
                if (isNumber) {
                    amt = Integer.parseInt(arr[2]);
//                    System.out.println("HERE: " + number);
                }else{
                    amt = 0;
                }
//                int amp = Integer.parseInt(arr[2]);
                String waiter = arr[3];
                Serving serving = new ServingImpl(date, time, amt, waiter);
                servings.add(serving);
            }
        }
        
        return servings;
    }

    /**
     * @author Emmely Lundberg
     */
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

    /**
     * @author Emmely Lundberg
     */
    @Override
    public Serving getLessServing(ArrayList<Serving> servings){
        if(servings == null){
            return null;
        }
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

    /**
     * @author Cherry Rose Semeña
     */
    @Override
    public ArrayList<Serving> getValidServings(int max, int min, ArrayList<Serving> servings) {
        return null;
    }

    /**
     * @author Emmely Lundberg
     */
    @Override
    public boolean isTooMuch(int limit, Serving serving) {

        if (serving.getAmount() > limit) {
            return true;
        }
        return false;
    }

    /**
     * @author Cherry Rose Semeña
     */
    @Override
    public void sortByAmount(ArrayList<Serving> servings) {

    }

    /**
     * @author Cherry Rose Semeña
     */
    @Override
    public ArrayList<Serving> getTooHighServings(int max, ArrayList<Serving> servings) {
        return null;
    }

    /**
     * @author Cherry Rose Semeña
     */
    @Override
    public ArrayList<Serving> getLessServings(int limit, ArrayList<Serving> servings) {
        return null;
    }

    /**
     * @author Emmely Lundberg
     */
    @Override
    public int getTotalExcessServings(int max, ArrayList<Serving> servings) {
        int size = servings.size();
        int amount = 0;

        for (int i = 0; i < size; i++) {
            if (servings.get(i).getAmount() > max) {
                amount +=  servings.get(i).getAmount() - max;
            }
        }
        return amount;
    }

    /**
     * @author Emmely Lundberg
     */
    @Override
    public int getTotalMissingServings(int min, ArrayList<Serving> servings) {
        int size = servings.size();
        int amount = 0;

        for (int i = 0; i < size; i++) {
            if (servings.get(i).getAmount() < min) {
                amount += min - servings.get(i).getAmount();
            }
        }
        return amount;
    }

    public static void main(String[] args) throws IOException, TimeFormatException {
        System.out.println("------------ STARTING -----------");
        ServingHandler hndl = new ServingHandlerImpl();
        String res = hndl.readFile("Servings.csv");
//        System.out.println(res);
        ArrayList<Serving> servings = hndl.getServings(res);
        for (int i = 0; i < servings.size(); i++) {
            String s = servings.get(i).toString();
            System.out.println(s);
        }
    }
    
}
