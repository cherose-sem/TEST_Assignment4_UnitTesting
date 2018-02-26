package impl;

import first_semester_eksamen.Handler;
import first_semester_eksamen.Sample;
import first_semester_eksamen.SlowSample;
import first_semester_eksamen.TimeFormatException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HandlerImpl implements Handler {

    public static final String FILENAME = "Samples.csv";

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

    @Override
    public ArrayList<Sample> getSamples(String data) throws TimeFormatException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sample getHighestAmplitude(ArrayList<Sample> samples) {
        Sample highestAmp = null;
        
        
        return highestAmp;
    }

    @Override
    public Sample getBiggestRise(ArrayList<Sample> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isTooLoud(int limit, ArrayList<Sample> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sortByTime(ArrayList<Sample> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sortByAmplitude(ArrayList<Sample> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Sample> getLoudSamples(int limit, ArrayList<Sample> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Sample> getSamplesBefore(Time limit, ArrayList<Sample> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public static void main(String[] args) throws IOException {
        System.out.println("------------ STARTING -----------");
        Handler hndl = new HandlerImpl();
        String res = hndl.readFile("Samples.csv");
        System.out.println(res);
    }

}
