import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Paola", 528492, 40000);
    }

    @Test
    public void employeeHasNINumber(){
        assertEquals(528492, developer.getNI_number());
    }

    @Test
    public void employeeHasASalary(){
        assertEquals(40000, developer.getSalary(), 0.01);
    }

    @Test
    public void employeeHasName(){
        assertEquals("Paola", developer.getName());
    }

    @Test
    public void cannotChangeNameToNull(){
        developer.setName(null);
        assertEquals("Paola", developer.getName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(40100.5, developer.salaryRaise(100.5), 0.01);
    }

    @Test
    public void cannotRaiseByNegativeNumber(){
        assertEquals(40000, developer.salaryRaise(-100), 0.01);
    }

    @Test
    public void getBounsPay(){
        assertEquals(400, developer.payBonus(), 0.01);
    }
}
