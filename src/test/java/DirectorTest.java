import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Paola", 528492, 40000, "HR", 1500.10);
    }

    @Test
    public void employeeHasNINumber(){
        assertEquals(528492, director.getNI_number());
    }

    @Test
    public void employeeHasASalary(){
        assertEquals(40000, director.getSalary(), 0.01);
    }

    @Test
    public void employeeHasName(){
        assertEquals("Paola", director.getName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(40100.5, director.salaryRaise(100.5), 0.01);
    }

    @Test
    public void getBounsPay(){
        assertEquals(800, director.payBonus(), 0.01);
    }

    @Test
    public void getBudget(){
        assertEquals(1500.10, director.getBudget(), 0.01);
    }
}
