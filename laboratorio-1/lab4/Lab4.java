import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Lab4 {

	/*

	- 	Realice cada punto en el orden que desee
	- 	El ejericio debe ser realizado con los conceptos vistos en clase
	- 	Como parte del ejercicio se proveen 5 metodos utilitarios a los cuales hay que definir los tipos de datos que considere
		es el mas conveniente para el tipo de dato a manejar. Cada uno de estos metodos devuelve un array con el dato que se quiere analizar.
		Por ejemplo el metodo pesos devuelve un array con los valores {70,58,3,55,63...}.
		NOTA: Estos metodos se encuentran comentados, descomente solo el metodo del punto que este trabajando para evitar error de compilacion.
  - 	No es necesario crear nuevos metodos, todos los puntos pueden ser programados en el metodo main
  -   Adicionalmente y al final de la clase se ha incluido como ejemplo el metodo  public static String[] getDirecciones(String[] data). Ese metodo se usa para
    extraer las direcciones de cada persona, las cuales son imprimidas utilizando un for desde el main

	1. Pesos:
		Imprimir los pesos
		Calcular la media de los pesos

	2. Estaturas:
		Imprimir estaturas
		Encontrar el menos alto
		Encontrar el mas alto

	3. Generos
		Contar cuantas personas tienen genero Masculino (M), y cuantas con Femenino (F)

	4. Nombres Completos
		Generar una cadena que contenga todos los nombres de las personas separados por comas asi:
		Juan Pérez,María García, Carlos Pérez

	5. Edades:
		Imprimir las edades de cada persona
		Encontrar cual es la persona con menos año
*/


record InformacionPersonal(String nombres, String apellidos, LocalDate fechaNacimiento, String direccion, String municipio, String nivelAcademico, String ocupacion, char genero, double peso, double estatura){}


	public static void main(String[] args) {
		
		//InformacionPersonal[] bd = new InformacionPersonal[10];
		List<InformacionPersonal> bd = new ArrayList<>();

		bd.add( new InformacionPersonal("Juan","Pérez",LocalDate.parse("15/03/1985", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 123","Medellin","Licenciatura en Ingeniería","Ingeniero de Software",'M',70,1.75));
		bd.add( new InformacionPersonal("María","García",LocalDate.parse("28/07/1992", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 123","Medellin","Maestría en Psicología","Psicóloga Clínica",'F',58,1.68));
		bd.add( new InformacionPersonal("Carlos","Pérez Garcia",LocalDate.parse("10/03/2023", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 123","Medellin","","",'M',3,0.80));
		bd.add( new InformacionPersonal("Ana","Martínez",LocalDate.parse("05/09/2009", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 14","Villa","Bachiller","Estudiante",'F',55,1.60));
		bd.add( new InformacionPersonal("Luisa","Hernández",LocalDate.parse("20/06/1989", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Carrera 789","Envigado","Doctorado en Economía","Profesora Universitaria",'F',63,1.70));
		bd.add( new InformacionPersonal("Javier","López",LocalDate.parse("12/04/1975", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle San Juan","Medellin","Licenciatura en Arquitectura","Arquitecto Independiente",'M',75,1.82));
		bd.add( new InformacionPersonal("Laura","Ramírez",LocalDate.parse("18/04/1998", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6","Ciudad Metropolitana","Bachiller","Estudiante",'F',52,1.65));
		bd.add( new InformacionPersonal("Martín","Torres",LocalDate.parse("30/02/1998", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6","Aldea","Bachiller","Estudiante",'M',68,1.78));
		bd.add( new InformacionPersonal("Sofia","Vargas",LocalDate.parse("22/07/1995", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6","Rionegro","Bachiller","Estudiante",'F',60,1.63));
		bd.add( new InformacionPersonal("Daniel","Sánchez",LocalDate.parse("08/12/1999", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6","Rionegro","Bachiller","Estudiante",'M',72,1.79));
	

		//1. Pesos:
		System.out.println("/**************************************/");
		System.out.println("1. Pesos");
		double mediaPesos = 0;
		double personasPesos = bd.size();
		
		for(InformacionPersonal i:bd){
			System.out.println("Peso = " + i.peso);
			mediaPesos += i.peso;
		
		}
		System.out.println("la media de los pesos es " + (mediaPesos / personasPesos));
		System.out.println("/**************************************/");


		//2. Estaturas:
		System.out.println("/**************************************/");
		System.out.println("2. Estaturas");
		double masBajo = bd.get(0).estatura;
		double masAlto = bd.get(0).estatura;
		for(InformacionPersonal i:bd){
			System.out.println("Estatura = " + i.estatura);
			if(i.estatura < masBajo){
				masBajo = i.estatura;
			}
			if(i.estatura > masAlto){
				masAlto = i.estatura;
			}
		}
		System.out.println("La persona mas baja mide: " + masBajo + " y la persona mas alta mide: " + masAlto);
		System.out.println("/**************************************/");


		//3. Generos
		System.out.println("/**************************************/");
		System.out.println("3. Generos");
		int numMasculino = 0;
		int numFemenina = 0;

		for(InformacionPersonal i:bd){
			if(i.genero == 'M' || i.genero == 'm'){
				numMasculino++;
			}else if(i.genero == 'F' || i.genero == 'f'){
				numFemenina++;
			}
		}
		System.out.println("De " + bd.size() + " personas, " + numMasculino + " son hombres y " + numFemenina + " mujeres");
		System.out.println("/**************************************/");


//4. Nombres Completos
		System.out.println("/**************************************/");
		System.out.println("4. Nombres Completos");
		String cadenaNombres = "";

		for(InformacionPersonal i:bd){
			cadenaNombres += i.nombres;
			cadenaNombres += " ";
			cadenaNombres += i.apellidos;
			cadenaNombres += ",";
		}

		System.out.println(cadenaNombres);
		System.out.println("/**************************************/");

	
//5. Edades:
		System.out.println("/**************************************/");
		System.out.println("5. Edades");
		long menorEdad = ChronoUnit.DAYS.between(LocalDate.now(), bd.get(0).fechaNacimiento);
		menorEdad = Math.abs(menorEdad);

		for(InformacionPersonal i:bd){
			long dias = ChronoUnit.DAYS.between(LocalDate.now(), i.fechaNacimiento);
			dias = Math.abs(dias);

			long añosEdad = dias / 365; 
			long diasEdad = dias % 365;
			System.out.println(añosEdad + " años y " + diasEdad + " dias");

			if(dias < menorEdad){
				menorEdad = dias;
			}
	
		}

		long menorEdadAños = menorEdad / 365;
		long menorEdadDias = menorEdad % 365;

		System.out.println("La persona con menor edad tiene " + menorEdadAños + " años y " + menorEdadDias + " dias");
		System.out.println("/**************************************/");
		
	}
}
