
import javax.lang.model.element.NestingKind;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

	public class main {

	    public static void main(String[] args) {
	        Scanner entradadedatos = new Scanner(System.in);

	        int opcionaelegir = 0;
	        Queue<String> cola = new LinkedList<>();


	        while(opcionaelegir != 7) {
	            System.out.println("Menu");
	            System.out.println("1. ingreso de los aviones");
	            System.out.println("2. Ver aviones en Hangar");
	            System.out.println("3. Ver el Avion Disponible");
	            System.out.println("4. Ver los aviones que están pendientes");
	            System.out.println("5. Ver el proximo avion que va a despegar");
	            System.out.println("6. Hacer que despegue el proximo avion");
	            System.out.println("7. Salir del programa");

	            opcionaelegir = entradadedatos.nextInt();

	            if(opcionaelegir == 1){

	                System.out.println("Aviones a ingresar: ");
	                int cantidad = entradadedatos.nextInt();

	                for (int i = 0; i < cantidad; i++) {
	                    System.out.println("Matricula de avion: ");
	                    cola.add(entradadedatos.next());
	                }

	            } else if(opcionaelegir == 2){
	                System.out.println("Aviones: ");

	                if (cola.isEmpty()){
	                    System.out.println("Está vacio.");
	                }else {
	                    System.out.println(cola);
	                }

	            } else if (opcionaelegir == 3){

	                System.out.println("Avion Disponible: " + cola.peek());

	            } else if(opcionaelegir == 4){

	                System.out.println("Aviones pendientes: ");
	                System.out.println(cola);

	            }else if(opcionaelegir == 5){

	                System.out.println("Proximo avion a despegar: " + cola.peek());

	            }else if(opcionaelegir == 6){

	                cola.remove(cola.peek());

	            }else{

	                if (opcionaelegir != 7){
	                    System.out.println("Dato incorrecto");
	                }

	            }
	        }

	        System.out.println("Gracias por usar el servicio.");

	    }
	}

