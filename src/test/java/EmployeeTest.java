import Staff.Employee;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
        Manager manager;

        @Before
        public void before(){
            manager = new Manager("Paola", 528492, 40000, "HR");
        }

        @Test
        public void employeeHasNINumber(){
            assertEquals(528492, manager.getNI_number());
        }

        @Test
        public void employeeHasASalary(){
            assertEquals(40000, manager.getSalary(), 0.01);
        }

        @Test
        public void employeeHasName(){
            assertEquals("Paola", manager.getName());
        }

        @Test
        public void canRaiseSalary(){
            assertEquals(40100.5, manager.salaryRaise(100.5), 0.01);
        }

        @Test
        public void getBounsPay(){
            assertEquals(400, manager.payBonus(), 0.01);
        }

//        @Test
//        public void payBonus(){
//            assertEquals(40400, employee.BonusPay());
//        }



}
