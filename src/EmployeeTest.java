import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;
import com.model.jreflect.Employee;
import com.model.jreflect.Employee;

public class EmployeeTest {

	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Employee employee = new Employee(3,"Dzen");
		
		ReflectionTestUtils.setField(employee, "id", 2);
		Assert.assertEquals(employee.getId(),2); 
		
		   assertTrue(ReflectionTestUtils.invokeMethod(employee, "toStringEmpl").equals("Employee id = "+employee.getId()
		   + " Employee name ="+employee.getName()));
		   
		   ReflectionTestUtils.setField(employee, "id", 5);
		   ReflectionTestUtils.setField(employee, "name", "Dzmitry");
		   
		   Assert.assertEquals(ReflectionTestUtils.invokeMethod(employee, "toStringEmpl"),"Employee id = 5 Employee name =Dzmitry" );
		   
		   // put parameters inside invoke for method with params
		   Assert.assertEquals(ReflectionTestUtils.invokeMethod(employee, "toStringEmplParam",3,"Dzen"),"Employee id = 5 Employee name =Dzmitry" );
		   
		   // Also we can test Protected and Private methods
		   
	}

	@After
	public void tearDown() throws Exception {
	}


}
