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
 *
 * @author Cherry Rose Semeña, Emmely Lundberg
 */
public class ServingHandlerTest {
    
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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of readFile method, of class ServingHandler.
     */
    @Test
    public void testReadFile() throws Exception {
        System.out.println("readFile");
        String filename = "";
        ServingHandler instance = new ServingHandlerImpl();
        String expResult = "";
        String result = instance.readFile(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServings method, of class ServingHandler.
     */
    @Test
    public void testGetServings() throws Exception {
        System.out.println("getServings");
        String data = "";
        ServingHandler instance = new ServingHandlerImpl();
        ArrayList<Serving> expResult = null;
        ArrayList<Serving> result = instance.getServings(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHighestServing method, of class ServingHandler.
     */
    @Test
    public void testGetHighestServing() {
        System.out.println("getHighestServing");
        ArrayList<Serving> servings = null;
        ServingHandler instance = new ServingHandlerImpl();
        Serving expResult = null;
        Serving result = instance.getHighestServing(servings);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLessServing method, of class ServingHandler.
     */
    @Test
    public void testGetLessServing() {
        System.out.println("getLessServing");
        ArrayList<Serving> servings = null;
        ServingHandler instance = new ServingHandlerImpl();
        Serving expResult = null;
        Serving result = instance.getLessServing(servings);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //public String getDate();
        //public Time getTime();
        //ServingImpl(String date, Time time, int amount, String type)
        Time t = new Time("10:01");
        servings.add (new ServingImpl("24-12-2017", t,157,"André"));
        servings.add (new ServingImpl("24-12-2017", t,147,"Sofia"));
        servings.add (new ServingImpl("24-12-2017", t,142,"Paula"));
        Serving result2 = instance.getLessServing(servings);
        assertEquals(142, result2.getAmount());

        //todo fake an array of servings
        // test that the function returns the lower

    }

    /**
     * Test of getValidServings method, of class ServingHandler.
     */
    @Test
    public void testGetValidServings() {
        System.out.println("getValidServings");
        Serving serving = null;
        ArrayList<Serving> servings = null;

        ServingHandler instance = new ServingHandlerImpl();
        double expResult = 3;
        ArrayList<Serving> result = instance.getValidServings(123,33,servings);
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTooMuch method, of class ServingHandler.
     */
    @Test
    public void testIsTooMuch() {
        System.out.println("isTooMuch");
        int limit = 0;
        ArrayList<Serving> servings = null;
        ServingHandler instance = new ServingHandlerImpl();
        boolean expResult = false;
        boolean result = instance.isTooMuch(limit, servings);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortByTime method, of class ServingHandler.
     */
    @Test
    public void testSortByTime() {
        System.out.println("sortByTime");
        ArrayList<Serving> servings = null;
        ServingHandler instance = new ServingHandlerImpl();
        instance.sortByTime(servings);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        ArrayList<Serving> result = instance.getTooHighServings(max, min, servings);
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


    
}
