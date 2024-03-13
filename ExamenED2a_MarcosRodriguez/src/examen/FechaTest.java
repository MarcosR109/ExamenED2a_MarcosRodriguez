package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {
	Fecha f1 = new Fecha();

	@Test
	void test0() {
		assertTrue(f1.validarFecha(1, 2, 1));
	}
	
	@Test
	void test1() {
		assertFalse(f1.validarFecha(25000, 2000, 0));
	}
	
	@Test
	void test2() {
		assertFalse(f1.validarFecha(45000, 0, 1));
	}
	
	@Test
	void test3() {
		assertFalse(f1.validarFecha(0,1,1));
	}
	

}
