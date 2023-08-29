import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import java.util.Arrays;

public class Lab2 {

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

	public static void main(String[] args) {
		String[] data = new String[11];

		data[0] = "Nombres, Apellidos, Fecha de Nacimiento (DIA/MES/AÑO, Direccion, Nivel Academico, Ocupacion, Genero, Peso en kilogramos, Estatura en metros";
		data[1] = "Juan,Pérez,15/03/1985,Calle 123,Medellin,Licenciatura en Ingeniería,Ingeniero de Software,M,70,1.75";
		data[2] = "María,García,28/07/1992,Calle 123,Medellin,Maestría en Psicología,Psicóloga Clínica,F,58,1.68";
		data[3] = "Carlos,Pérez Garcia,10/03/2023,Calle 123,Medellin,,,M,3,0.80";
		data[4] = "Ana,Martínez,05/09/2009,Calle 14,Villa,Bachiller,Estudiante,Femenino,55,1.60";
		data[5] = "Luisa,Hernández,20/06/1989,Carrera 789,Envigado,Doctorado en Economía,Profesora Universitaria,F,63,1.70";
		data[6] = "Javier,López,12/04/1975,Calle San Juan,Medellin,Licenciatura en Arquitectura,Arquitecto Independiente,M,75,1.82";
		data[7] = "Laura,Ramírez,18/04/1998,Avenida 6,Ciudad Metropolitana,Bachiller,Estudiante,F,52,1.65";
		data[8] = "Martín,Torres,30/02/1998,Avenida 6,Aldea,Bachiller,Estudiante,M,68,1.78";
		data[9] = "Sofia,Vargas,22/07/1995,Avenida 6,Rionegro,Bachiller,Estudiante,F,60,1.63";
		data[10] = "Daniel,Sánchez,08/12/1999,Avenida 6,Rionegro,Bachiller,Estudiante,M,72,1.79";



		//El metodo getDirecciones y el siguiente for se incluye como ejemplo de impresión de las direcciones
		String[] direcciones = getDirecciones( data );
		for ( String direccion : direcciones ) {
			System.out.println(direccion);
		}


		//1. Pesos:
		System.out.println("/**************************************/");
		System.out.println("1. Pesos");
		double[] pesosTodos = getPesos(data);
		double mediaPesos = 0;
		double personasPesos = pesosTodos.length;
		
		for(double i:pesosTodos){
			System.out.println("Peso = " + i);
			mediaPesos += i;
		
		}
		System.out.println("la media de los pesos es " + (mediaPesos / personasPesos));
		System.out.println("/**************************************/");



		//2. Estaturas:
		System.out.println("/**************************************/");
		System.out.println("2. Estaturas");
		double[] estaturas = getEstaturas( data );
		double masBajo = estaturas[0];
		double masAlto = estaturas[0];

		for(double i:estaturas){
			System.out.println("Estatura = " + i);
			if(i < masBajo){
				masBajo = i;
			}
			if(i > masAlto){
				masAlto = i;
			}
		}
		System.out.println("La persona mas baja mide: " + masBajo + " y la persona mas alta mide: " + masAlto);
		System.out.println("/**************************************/");



		//3. Generos
		System.out.println("/**************************************/");
		System.out.println("3. Generos");
		char[] generos = getGeneros( data );
		int numMasculino = 0;
		int numFemenina = 0;

		for(char i:generos){
			if(i == 'M' || i == 'm'){
				numMasculino++;
			}else if(i == 'F' || i == 'f'){
				numFemenina++;
			}
		}
		System.out.println("De " + generos.length + " personas, " + numMasculino + " son hombres y " + numFemenina + " mujeres");

		System.out.println("/**************************************/");


		//4. Nombres Completos
		System.out.println("/**************************************/");
		System.out.println("4. Nombres Completos");
		String[] nombresCompletos = getNombresCompletos( data );
		String cadenaNombres = "";

		for(String i:nombresCompletos){
			cadenaNombres += i;
			cadenaNombres += ",";
		}


		System.out.println(cadenaNombres);
		System.out.println("/**************************************/");

	
		// falta ternminar la definicion del metodo
		//5. Edades:
		//System.out.println("/**************************************/");
		//String[] fechasDeNacimiento = getFechasDeNacimientos(data);
		
		//System.out.println("/**************************************/");
		


	}


	public static double[] getPesos(String[] data){

		double[] pesos = new double[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			String peso = String.valueOf(datum[8]);
			double pesoDouble = Double.parseDouble(peso);
			pesos[i-1] = pesoDouble;
		}
		return pesos;
	}

	public static double[] getEstaturas(String[] data){

		double[] estaturas = new double[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			String estatura = String.valueOf(datum[9]);
			double estaturaDouble = Double.parseDouble(estatura);
			estaturas[i-1] = estaturaDouble;
		}
		return estaturas;
	}

	public static char[] getGeneros(String[] data){

		char[] generos = new char[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			char genero = datum[7].charAt( 0 );
			generos[i-1] = genero;
		}
		return generos;
	}

	public static String[] getNombresCompletos(String[] data){

		String[] nombresCompletos = new String[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			String nombreCompleto = datum[0] + " " + datum[1];
			nombresCompletos[i-1] = nombreCompleto;
		}
		return nombresCompletos;
	}


/*
	public static String[] getFechasDeNacimientos(String[] data){

		String[] fechasDeNacimiento = new String[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			String fechaDeNacimiento = datum[2];
			fechasDeNacimiento[i-1] = String.parse( fechaDeNacimiento, DateTimeFormatter.ofPattern("dd/MM/uuuu"));
		}
		String[] fechasDeNacimiento2 = new String[3];
		return fechasDeNacimiento2;
	}
*/
	public static String[] getDirecciones(String[] data){

		String[] direcciones = new String[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			String direccion = datum[3] ;
			direcciones[i-1] = direccion;
		}
		return direcciones;
	}
}
