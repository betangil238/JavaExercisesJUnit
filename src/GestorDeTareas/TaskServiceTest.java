package GestorDeTareas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskServiceTest {
	TaskService ts = new TaskService();

	@Test
	void testAgregarTarea() {
		int tamano=ts.getListaTareas().size();
		ts.AgregarTarea();
		int tamano1=ts.getListaTareas().size();
		assertTrue((tamano+1)==tamano1);
	}

	@Test
	void testListarTareas() {
		assertTrue(ts.ListarTareas());
	}

	@Test
	void testEliminarTareas() {
		int tamano=ts.getListaTareas().size();
		ts.EliminarTareas();
		int tamano1=ts.getListaTareas().size();
		assertTrue((tamano-1)==tamano1);
	}

}
