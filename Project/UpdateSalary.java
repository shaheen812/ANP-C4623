package employee;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.*;

import com.pack.dao.EmployeeDao;
import com.pack.model.Employee;

class UpdateSalary {
	
	private EmployeeDao emp;
	@BeforeEach
	void init() {
		emp = new EmployeeDao();
	}

	@Test
	void incrementedSalary() {
		double oldSalary = emp.getEmployeeDetail(2).getSalary();
		assertEquals((oldSalary + (oldSalary * 10 / 100)), emp.incrementSalary(2, 10));
		
	}
}
