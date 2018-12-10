
import java.util.Scanner;
import java.io.File;

public class Humano {
	
	private int id;
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Hola");		

	}
	
	
	private void initTodo() {
		File fichero = new File("hola.txt");
	}

}
