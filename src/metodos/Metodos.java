
package metodos;
import java.math.*;
import java.util.Scanner;

public class Metodos {
//Un metodo en java es un conjunto de intrucciones que realiza alguna accion dentro de una clase
//La Estructura de un metodo es: 
/*[especificadores] tipoDevuelto nombreMetodo([lista parámetros]) [throws listaExcepciones]
{   instrucciones
   [return valor;]
}
#especificadores (opcional): determinan el tipo de acceso al método, publico, privado, etc.   
#TipoDevuelto: indica el tipo del valor que devuelve el método. En Java es imprescindible que en la declaración de 
un método, se indique el tipo de dato que ha de devolver. El dato se devuelve mediante la instrucción return. 
Si el método no devuelve ningún valor este tipo será void. El tipo devuelto puede ser int,boolean,etc.
#nombreMetodo: es el nombre que se le da al método
#Lista de parámetros (opcional): después del nombre del método y siempre entre paréntesis puede aparecer una lista de parámetros (también llamados argumentos) separados por comas. 
Estos parámetros son los datos de entrada que recibe el método para operar con ellos.
#hrows listaExcepciones (opcional): indica las excepciones que puede generar y manipular el método.
#return: se utiliza para devolver un valor, se usa  solo en los metodos que devueven un valor*/

//Que un metodo sea estatico(Static) significa que es un metodo que pertenece a una clase y no a los objetos de esa clase, por lo tanto estos metodos se usan para operaciones dentro de la clase, como por ej. el metodo main se usa para inicializar el programa
//Lo mismo pasa con las variables declaradas estaticas 
    public static void main(String[] args)
    {
      
      Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero para calcular su logaritmo");
        double m=sc.nextDouble();
        Metodos log=new Metodos();//ceamos un objeto log para poder llamar al metodo logaritmo, ya que dentro de void al ser static no podremos hacer esto
                                                       //Le pasamos el parametro "m" al metodo logaritmo,este lo procesa y lo devuelve inmediatamente
        System.out.println("El logaritmo de:"+m+",es="+log.logaritmo(m));
        
        //Ejemplo de pasar 2 parametros
        System.out.println("Ingrese el largo del rectangulo");
        int largo=sc.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        int alt=sc.nextInt();
        System.out.println("El Area del rectangulo es="+log.Arearectg(largo, alt));
    }
                      //se declara una cte para que reciba los parametros asi de esta forma nos aseguamos que no se modifique ese valor
    double logaritmo(final double  x)
    {
        double n=Math.log10(x);
        return  n; //devuelve el resultado de la sentencia anterior a quien lo llamo
    }
    
    private int Arearectg(int l,int a)
    {
       return l*a;
    }
    
    //Tipo de Accesos a los metodos
    //Publico
 
}
//Algo que hay que especificar es la diferencia entre Parametros y Argumentos (Atributos), los parametos es lo que va dentro del parentesis del metodo y los atributos 
//es lo que se le pasa al metodo por medio de los parametros

/*
Los métodos de las clases se llaman a través de los objetos. En ocasiones interesa
definir métodos que estén controlados por la clase, que no haga falta crear un objeto
para llamarlos, son los métodos static. En las clases de la biblioteca Java, muchos
métodos están definidos como static, es el caso de los métodos de la clase Math que
representan funciones matemáticas: Math.sin ( ), Math.sqrt ( )… ; también métodos de
conversión como Integer.parseInt ( ), String.valueOF ( ).
La llamada a los métodos static se realiza a través de la clase      
NombreClase.metodo ( ), respetando las reglas de visibilidad.
*/