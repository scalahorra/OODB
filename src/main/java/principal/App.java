package principal;

import java.util.Arrays;
import java.util.Scanner;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

import modelo.Asignatura;
import modelo.Centro;
import modelo.Profesor;

public class App {

	public static void main(String[] args) {
		
		ODB odb = ODBFactory.open("neodatis.test");
		
		Asignatura asignatura1 = new Asignatura(1, "Ingles");
		Asignatura asignatura2 = new Asignatura(2, "Programacion Multimedia");
		Asignatura asignatura3 = new Asignatura(3, "Acceso a Datos");
		Asignatura asignatura4 = new Asignatura(4, "Programacion de Servicios y Procesos");
		Asignatura asignatura5 = new Asignatura(5, "Desarrollo de Interfaces");
		Asignatura asignatura6 = new Asignatura(6, "Empresa e Iniciativa Emprendedora");
		Asignatura asignatura7 = new Asignatura(7, "Sistemas de Gestion Empresarial");
		Asignatura asignatura8 = new Asignatura(8, "Tutoria");

		Profesor profesor1 = new Profesor(1, "Sentis", "Carlos", "25/5/2000", "H", 1, Arrays.asList(asignatura2, asignatura5));
		Profesor profesor2 = new Profesor(2, "Badia", "Maria", "10/2/2000", "M", 2, Arrays.asList(asignatura3));
		Profesor profesor3 = new Profesor(3, "Arruego", "Claudia", "18/1/2000", "M", 2, Arrays.asList(asignatura1, asignatura4));
		
		Centro centro1 = new Centro(1, "IES Corona de Aragon", 1, "Calle de Corona de Aragon", "Zaragoza", "Zaragoza", Arrays.asList(profesor1));
		Centro centro2 = new Centro(2, "Colegio Salesianos", 2, "Calle de San Juan Bosco", "Zaragoza", "Zaragoza", Arrays.asList(profesor2, profesor3));
		
		int opcion;
		
		do {
			
			//Menu
			System.out.println("");
			System.out.println("-- Menu --");
			System.out.println("1. Poblar la BBDD");
			System.out.println("2. Listar todos los centros");
			System.out.println("3. Listar todos los profesores");
			System.out.println("4. Listar todos los profesores de un centro");
			System.out.println("5. Listar todos los profesores de un centro cuya fecha de nacimiento sea anterior a 1993");
			System.out.println("6. Listar los profesores con sexo masculino que impartan la asignatura de Acceso a Datos");
			System.out.println("7. Comprobar que un profesor existe");
			System.out.println("0. Salir");
			System.out.println("--      --");
			
			Scanner scanner = new Scanner(System.in);
			opcion = scanner.nextInt();
			
			switch(opcion) {
			
			//Poblamos la BBDD
			case 1: 
				
				odb.store(centro1);
				odb.store(centro2);

				odb.store(profesor1);
				odb.store(profesor2);
				odb.store(profesor3);
				
				odb.store(asignatura1);
				odb.store(asignatura2);
				odb.store(asignatura3);
				odb.store(asignatura4);
				odb.store(asignatura5);
				odb.store(asignatura6);
				odb.store(asignatura7);
				odb.store(asignatura8);
				
				//Creamos los objetos
				Objects<Centro> centro;
				Objects<Profesor> profesor; 
				Objects<Asignatura> asignatura;
				
				System.out.println("Base de Datos poblada correctamente");
				
				break;
				
			//Listar todos los centros	
			case 2:
				
				centro = odb.getObjects(Centro.class);
				System.out.println(centro);
				
				break;
				
			//Listar todos los profesores	
			case 3:
				
				profesor = odb.getObjects(Profesor.class);
				System.out.println(profesor);
				break;
				
			//Listar todos los profesores de un centro	
			case 4:
				
				IQuery iQuery = new CriteriaQuery(Profesor.class, Where.equal("centro", 2));
				Objects<Profesor> profesorCentro = odb.getObjects(iQuery);
				
				while(profesorCentro.hasNext()) {
					Profesor p = profesorCentro.next();
					System.out.println(p);
				}
			}
			
					
		} while(opcion != 0);
		
		odb.close();
	}

}
