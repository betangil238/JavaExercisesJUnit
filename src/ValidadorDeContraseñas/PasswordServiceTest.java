package ValidadorDeContraseñas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordServiceTest {
	PasswordService ps =new PasswordService();

	@Test
	void testContainSpecialChar() {
		assertTrue(ps.containSpecialChar("Daniel123456."));
	}

	@Test
	void testContainUpper() {
		assertTrue(ps.containUpper("Daniel123456."));
	}

	@Test
	void testMinimumlength() {
		assertTrue(ps.minimumlength("Daniel1234567890."));
	}

}
