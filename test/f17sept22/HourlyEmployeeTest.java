package f17sept22;

import java.time.LocalDate;
import java.time.Month;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JWright
 */
public class HourlyEmployeeTest {
    HourlyEmployee emp;
    
    public HourlyEmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        emp = new HourlyEmployee(25.76,"Joel", "Smith-Hat", "978 235 212", LocalDate.of(1956, Month.MARCH, 14));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPayRate method, of class HourlyEmployee.
     */
    @Test
    public void testGetPayRate() {
        System.out.println("getPayRate");
        double expResult = 25.76;
        double result = emp.getPayRate();
        assertEquals(expResult, result, 0.0);
    }

    
    /**
     * Test of setPayRate method, of class HourlyEmployee.
     */
    @Test
    public void testSetPayRate() {
        try{
            emp.setPayRate(5.00);
            fail("$5.00 wage should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.print("Successfully found "+e.getMessage());
        }
        
    }

    /**
     * Test of getHoursWorked method, of class HourlyEmployee.
     */
    @Test
    public void testGetHoursWorked() {
        System.out.println("getHoursWorked");
        HourlyEmployee instance = null;
        double expResult = 0.0;
        double result = instance.getHoursWorked();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoursWorked method, of class HourlyEmployee.
     */
    @Test
    public void testSetHoursWorked() {
        System.out.println("setHoursWorked");
        double hoursWorked = 0.0;
        HourlyEmployee instance = null;
        instance.setHoursWorked(hoursWorked);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePay method, of class HourlyEmployee.
     */
    @Test
    public void testCalculatePay() {
        System.out.println("calculatePay");
        HourlyEmployee instance = null;
        double expResult = 0.0;
        double result = instance.calculatePay();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
