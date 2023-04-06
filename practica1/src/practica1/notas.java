package practica1;
import java.util.Scanner;

/**

La clase "notas" representa un objeto que contiene las notas de un estudiante.

Incluye las notas de las unidades formativas 1, 2 y 3, así como la nota final del curso.
*/
/**
La nota de la unidad formativa 1.
double uf1;
*/
/**
La nota de la unidad formativa 2.
double uf2;
*/
/**
La nota de la unidad formativa 3.
double uf3;
*/
/**
La nota acumulada de la unidad formativa 1.
double acu1;
*/
/**
La nota acumulada de la unidad formativa 2.
double acu2;
*/
/**
La nota acumulada de la unidad formativa 3.
double acu3;
*/
/**
La nota final del curso.
double def;
*/
public class notas {
		//declaramos la variables que nos hacen falta
		double uf1, uf2, uf3;
		double acu1, acu2, acu3, def;
		//utilizames ecaner para poder introducir datos
		Scanner entrada = new Scanner(System.in);

		/**

		El método "IngresaNotas()" permite ingresar las notas de un estudiante para las unidades formativas 1, 2 y 3.

		Este método utiliza el objeto Scanner "entrada" para solicitar al usuario que ingrese las notas.
		*/
public void IngresaNotas() {
	//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
	System.out.println("ingrese las notas del estudiante");
	
	System.out.print("ingrese nota 1: ");
	
	uf1= entrada.nextDouble();

	
	
	System.out.print("ingrese nota 2: ");
	
	uf2= entrada.nextDouble();
	System.out.print("ingrese nota 3: ");
	
	uf3= entrada.nextDouble();
	

}

// metodo para comprobar bien entroduccion de notas

/**

El método "comprobarcion()" permite verificar si las notas ingresadas en las unidades formativas 1, 2 y 3 son correctas.

Si alguna de las notas es mayor que 10, se imprimirá un mensaje indicando que la nota es incorrecta.

De lo contrario, se imprimirá un mensaje indicando que la nota es correcta.
*/
public void comprobarcion(){
	
	if (uf1>10) {
		System.out.println(" nota1 mal introducida");
		
	}else {
		System.out.println(" nota1 correcta");
	}
	
	if (uf2>10) {
		System.out.println(" nota2 mal introducida");
		
	}else {
		System.out.println(" nota2 correcta");
	}
	if (uf3>10) {
		System.out.println(" nota3 mal introducida");
		
	}else {
		System.out.println(" nota3 correcta");
	}
	
		
	
	
}
// metodo para calcular nota
/**

El método "Calculonotas()" permite calcular la nota definitiva de un estudiante en función de las notas ingresadas en las unidades formativas 1, 2 y 3.
Este método utiliza las notas de cada unidad formativa para calcular la nota acumulada de cada una y la nota definitiva del estudiante.
Sin embargo, no muestra la nota definitiva, solo la calcula y la almacena en la variable "def".
*/
public void Calculonotas() {
	acu1= uf1*0.35;
	acu2 = uf2 * 0.35;
	acu3 = uf3 * 0.30;
	
	def = acu1 + acu2+ acu3;
	
	//hasta aqui la tenemos calculada peor no la mostramos
}
/**

El método "Mostrar()" permite mostrar en la consola las notas ingresadas en las unidades formativas 1, 2 y 3, la nota acumulada de cada una y la nota definitiva del estudiante.

Este método utiliza la función "System.out.println()" para imprimir los valores de cada nota y acumulado.
*/
public void Mostrar() {
	//print ln lo que hace es que al terminar el print baja la linea
	System.out.println(" notas introducidas son:");
	System.out.println(" nota1 = " + uf1);
	System.out.println(" nota2 = " + uf2);
	System.out.println(" nota3 = " + uf3);
	
	System.out.println(" acumuado 1 = "+ acu1);
	System.out.println(" acumuado 2 = "+ acu2);
	System.out.println(" acumuado 3 = "+ acu3);
	
	System.out.println(" nota definitiva es = "+ def);
	
}
/**

El método "aprobado()" permite determinar si el estudiante aprobó o no la materia, en función de su nota definitiva.

Si la nota definitiva es menor que 5, el método muestra "suspendido". Si la nota definitiva está entre 5 y 10, el método muestra "aprobado".

En caso de que la nota definitiva esté fuera del rango permitido, el método muestra "error en las notas".
*/
public void aprobado() {
		
		if(def<5 && def>=0) {
			System.out.println("suspendio");
		}else {
			if (def>=5 && def<=10 ) {
			System.out.println("aprobado");
			}else {
				System.out.println(" error en la notas");
			}
		}
	}
	
/**

El método "main()" es el punto de entrada principal del programa, donde se inicializa la clase "notas" y se llaman a los diferentes métodos necesarios para el cálculo y presentación de las notas del estudiante.
Se crea una instancia de la clase "notas" y se llaman a los métodos "IngresaNotas()", "comprobarcion()", "Calculonotas()", "Mostrar()" y "aprobado()", en ese orden.
Este método no retorna ningún valor, sino que se encarga de llamar a los diferentes métodos que realizan las operaciones necesarias.
*/	
public static void main(String[] args) {
	// creamos mecanimos para llamar a cualquier metodo fuero de la clase
	notas fc= new notas();
	
	fc.IngresaNotas();
	
	fc.comprobarcion();
	

	fc.Calculonotas();
	
	fc.Mostrar();
	
	fc.aprobado();
	
}

}
