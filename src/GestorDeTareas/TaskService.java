package GestorDeTareas;
import java.util.ArrayList;
import java.util.Scanner;
public class TaskService {
	static ArrayList<Task> ListaTareas= new ArrayList<>();
	Scanner leer= new Scanner(System.in);
	public void AgregarTarea() {
		System.out.println("Porfavor ingrese una tarea");
		String tarea= leer.next();
		Task task= new Task(tarea);
		ListaTareas.add(task);
	}
	
	public static boolean ListarTareas() {
		if (ListaTareas.size()==0) {
			System.out.println("No hay tareas para listar");
			return false;
		}else {
			for (int i=0;i<ListaTareas.size();i++) {
				System.out.print("TAREA # "+ (i+1)+ " : ");
				System.out.println(ListaTareas.get(i).getTarea());
			}
			return true;
		}
	}
	
	public void EliminarTareas() {
		if (ListaTareas.size()==0) {
			System.out.println("No hay tareas para eliminar");
		}else {
			System.out.println("Cual tarea deseas eliminar?");
			int tarea= leer.nextInt();
			ListaTareas.remove(tarea-1);
			}
		}

	public ArrayList<Task> getListaTareas() {
		return ListaTareas;
	}
	
	
}
