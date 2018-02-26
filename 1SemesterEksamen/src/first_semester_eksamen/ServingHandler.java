
package first_semester_eksamen;

import impl.Time;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Cherry Rose Semeña & Emmely
 */
public interface ServingHandler {
    /**
     * Convert a file to a String
     * @param filename The name of the file to be read
     * @return The file content as a String
     * @throws IOException if file is missing or locked
     */
    public String readFile(String filename) throws IOException;
    
    /**
     * Converts file content to proper objects
     * @param data The file content as a String
     * @return a list of Serving objects
     * @throws TimeFormatException if time is formated badly
     */
    public ArrayList<Serving> getServings(String data) throws TimeFormatException;
    
    /**
     * Identifies the Serving with the highest amount served. 
     * @param servings The list of Samples based on file content
     * @return the identified Serving object
     */
    public Serving getHighestServing(ArrayList<Serving> servings);
    
    /**
     * Identifies the Sample with the highest amplitude. Peaks are ignored.
     * @param samples The list of Samples based on file content
     * @return the identified Sample object
     */
    public Serving getLessServing(ArrayList<Serving> servings);
    
    /**
     * Identifies the sample which have increased the most in amplitude 
     * compared to its predecessor. 
     * The compared values are signed - It is NOT the numerical difference 
     * that counts.
     * @param samples The list of Samples based on file content - At least 
     * 2 values are required
     * @return the identified Sample object
     */
    public double getValidServings(Serving serving);
    
    /**
     * Determines whether or not any sample surpasses the set limit. 
     * Peaks matter
     * @param limit The highest allowed value
     * @param samples The list of Samples based on file content
     * @return true if any amplitude or peak is greater than the limit,
     * false in any other case.
     */
    public boolean isTooMuch(int limit, ArrayList<Serving> servings);
    
    /**
     * Sorts samples by time
     * @param samples The list that will be sorted
     */
    public void sortByTime(ArrayList<Serving> servings);
    
    /**
     * sorts samples by amplitude (ignore peak)
     * @param samples The list that will be sorted
     */
    public void sortByAmount(ArrayList<Serving> servings);
    
    /**
     * Retrieves a subset containing the too high servings
     * @param max The maximum servings allowed - 155ml
     * @param min The minimum servings allowed - 165ml
     * @param servings The list from which to get the subset
     * @return a new list containing the subset
     */
    public ArrayList<Serving> getTooHighServings(int max, int min, ArrayList<Serving> servings);
    
    /**
     * Retrieves a subset containing only the samples that have a timestamp 
     * earlier than the limit. (NOT equal to the limit!)
     * @param limit The time limit
     * @param samples The list from which to get the subset
     * @return a new list containing the subset
     */
    public ArrayList<Serving> getLessServings(int limit, ArrayList<Serving> servings);    
}
