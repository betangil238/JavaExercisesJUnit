package GestorDeTareas;
//Crea una clase TaskManager que permita agregar, eliminar y listar tareas.
//Escribe pruebas unitarias para verificar que el gestor de tareas realiza las operaciones
//correctamente, como agregar una tarea, eliminar una tarea existente y listar las tareas disponibles.
public class Task {
	private String tarea;

	public Task(String tarea) {
		super();
		this.tarea = tarea;
	}

	public Task() {
		super();
	}

	public String getTarea() {
		return tarea;
	}

	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

}
