/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_semester_eksamen;

import java.io.IOException;
import java.util.ArrayList;

import impl.ServingHandlerImpl;
import impl.ServingImpl;
import impl.Time;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Cherry Rose Semeña, Emmely Lundberg
 */
public class ServingHandlerTest {
    private final ServingHandler instance = new ServingHandlerImpl();
    private int min;
    private int max;
    private ArrayList<Serving> servings;

    public ServingHandlerTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        this.servings = new ArrayList<Serving>();

        this.min = 155;
        this.max = 165;

        Time t = new Time("10:01");


        this.servings.add(new ServingImpl("24-12-2017", t, 157, "André"));
        this.servings.add(new ServingImpl("24-12-2017", t, 147, "Sofia"));
        this.servings.add(new ServingImpl("24-12-2017", t, 142, "Paula"));
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of readFile method, of class ServingHandler.
     */
    @Test
    public void testReadFile() throws IOException {
        System.out.println("readFile");
        String filename = "Servings.csv";
        String expResult = "";
        String result = instance.readFile(filename);
        assertNotEquals(expResult, result);
    }
    
    /**
     * Test of readFile method, of class ServingHandler.
     */
    @Test (expected = IOException.class)
    public void testReadFileNoFileFound() throws Exception {
        System.out.println("readFile");
        String filename = "Serve.csv";
        instance.readFile(filename);
    }

    /**
     * Test of getServings method, of class ServingHandler.
     */
    @Test
    public void testGetServings() throws Exception {
        System.out.println("getServings");
        String data = "DATE,TIME,AMOUNT,WAITER\n"
                + "28-02-2018,23:00,143,Cherry";
        ArrayList<Serving> result = instance.getServings(data);
        assertNotEquals(null, result);
        assertEquals(1, result.size());
    }
    
    /**
     * Test of getServings method, of class ServingHandler.
     */
    @Test (expected = TimeFormatException.class)
    public void testGetServingsWrongTime() throws Exception {
        System.out.println("getServings");
        String data = "DATE,TIME,AMOUNT,WAITER\n"
                + "28-02-2018,100:00,143,Cherry";
        ArrayList<Serving> result = instance.getServings(data);
    }

    /**
     * @author Emmely Lundberg
     * Test of getHighestServing method, of class ServingHandler.
     */
    @Test
    public void testGetHighestServing() {
        System.out.println("getHighestServing");
        int expResult = 157;
        Serving result = instance.getHighestServing(servings);
        assertEquals(expResult, result.getAmount());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * @author Emmely Lundberg
     * Test of getLessServing method, of class ServingHandler.
     */
    @Test
    public void testGetLessServing() {
        System.out.println("getLessServing");
        ServingHandler instance = new ServingHandlerImpl();
        Serving expResult = null;
//        Serving result = instance.getLessServing(servings);
        //      assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //public String getDate();
        //public Time getTime();
        //ServingImpl(String date, Time time, int amount, String type)
        int exp = 142;
        Serving result2 = instance.getLessServing(servings);
        assertEquals(exp, result2.getAmount());

        //todo fake an array of servings
        // test that the function returns the lower

    }

    /**
     * Test of getValidServings method, of class ServingHandler.
     */
    @Test
    public void testGetValidServings() {
        System.out.println("getValidServings");
        double expResult = 3;
        ArrayList<Serving> result = instance.getValidServings(123, 33, servings);
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * @author Emmely Lundberg
     * Test of isTooMuch method, of class ServingHandler.
     */
    @Test
    public void testIsTooMuch() {
        System.out.println("isTooMuch");
        Time t = new Time("10:01");
        ServingHandler instance = new ServingHandlerImpl();
        Serving serving = new ServingImpl("24-12-2017", t, 166, "André");
        boolean expResult = true;
        boolean result = instance.isTooMuch(this.max, serving);
        assertEquals(expResult, result);


        serving = new ServingImpl("24-12-2017", t, 165, "André");
        expResult = false;
        result = instance.isTooMuch(this.max, serving);
        assertEquals(expResult, result);


        serving = new ServingImpl("24-12-2017", t, 164, "André");
        expResult = false;
        result = instance.isTooMuch(this.max, serving);
        assertEquals(expResult, result);

    }

    /**
     * Test of sortByAmount method, of class ServingHandler.
     */
    @Test
    public void testSortByAmount() {
        System.out.println("sortByAmount");
        ArrayList<Serving> servings = null;
        ServingHandler instance = new ServingHandlerImpl();
        instance.sortByAmount(servings);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTooHighServings method, of class ServingHandler.
     */
    @Test
    public void testGetTooHighServings() {
        System.out.println("getTooHighServings");
        int max = 0;
        int min = 0;
        ArrayList<Serving> servings = null;
        ServingHandler instance = new ServingHandlerImpl();
        ArrayList<Serving> expResult = null;
        ArrayList<Serving> result = instance.getTooHighServings(max, servings);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLessServings method, of class ServingHandler.
     */
    @Test
    public void testGetLessServings() {
        System.out.println("getLessServings");
        int limit = 0;
        ArrayList<Serving> servings = null;
        ServingHandler instance = new ServingHandlerImpl();
        ArrayList<Serving> expResult = null;
        ArrayList<Serving> result = instance.getLessServings(limit, servings);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * @author Emmely Lundberg
     * Test of isTooMuch method, of class ServingHandler.
     */
    @Test
    public void testGetTotalExcessServings() {
        System.out.println("testGetTotalExcessServings");
        Time t = new Time("10:01");

        this.servings.add(new ServingImpl("24-12-2017", t, 167, "André"));

        this.servings.add(new ServingImpl("24-12-2017", t, 166, "André"));
        this.servings.add(new ServingImpl("24-12-2017", t, 165, "André"));

        int expResult = 3;
        int result = instance.getTotalExcessServings(this.max, servings);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * @author Emmely Lundberg
     * Test of isTooMuch method, of class ServingHandler.
     */
    @Test
    public void testGetTotalMissingServing() {
        System.out.println("testGetTotalMissingServing");
        int expResult = 3;
        ArrayList<Serving> servings = new ArrayList<Serving>();
        Time t = new Time("10:01");
        servings.add(new ServingImpl("24-12-2017", t, 156, "André"));
        servings.add(new ServingImpl("24-12-2017", t, 155, "André"));
        servings.add(new ServingImpl("24-12-2017", t, 154, "Sofia"));
        servings.add(new ServingImpl("24-12-2017", t, 153, "Paula"));
        int result = instance.getTotalMissingServings(this.min, servings);
        assertEquals(expResult, result);
    }


}
