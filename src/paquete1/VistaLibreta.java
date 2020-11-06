package paquete1;

import java.util.ArrayList;
import java.util.Scanner;

public class VistaLibreta implements iVista {
	
Scanner Leer = new Scanner(System.in);
Scanner LeerString = new Scanner(System.in);


	@Override
	public int mostrarMenu(ArrayList<String> menu) {
		System.out.println("---------- Menú ------------");
		// TODO Auto-generated method stub
		for(int i=0;i<menu.size();i++) {
			System.out.println(i+" - "+menu.get(i));
		}
		System.out.println("Seleccione una opción:");
		int tmp_op = Leer.nextInt();
		return tmp_op;
	}

	@Override
	public void mostrarLibreta(ArrayList<String> libreta) {
		// TODO Auto-generated method stub
		System.out.println("---------- Libreta ------------");
		for(int i=0; i<libreta.size(); i++) {
			System.out.println(libreta.get(i));
		}
		
	}

	@Override
	public int eliminarContacto(ArrayList<String> libreta) {
		// TODO Auto-generated method stub
		System.out.println("---------- Eliminar Contacto ------------");
		for(int i=0; i<libreta.size(); i++) {
			System.out.println(libreta.get(i));
		}
		int tmp_op = Leer.nextInt();
		return tmp_op;
	}

	@Override
	public String agregarContacto() {
		// TODO Auto-generated method stub
		System.out.println("---------- Agregar Contacto------------");
		System.out.println();
		String tmp_nuevoContacto = LeerString.nextLine();
		return tmp_nuevoContacto;
	}

}
