import java.util.Scanner;
class EstSecuencial{
  static Scanner teclado=new Scanner(System.in);
  static void promdioNota(){
    //Definir variables y otros
    System.out.println("Ejemplo estructura secuencial en Java");
    int e1, e2, e3, e4;
    double promediofinal;
    //Datos de entrada
    System.out.println("Ingrese la nota 01:");
    e1=teclado.nextInt();
    System.out.println("Ingrese la nota 02:");
    e2=teclado.nextInt();
    System.out.println("Ingrese la nota 03:");
    e3=teclado.nextInt();
    System.out.println("Ingrese la nota 04:");
    e4=teclado.nextInt();
    //Proceso
    promediofinal=(e1*0.25+e2*0.25+e3*0.25+e4*0.25);
    //Datos de salida
    System.out.println("La nota final es: "+promediofinal);    
  }




  public static void main(String[] arg){
    promdioNota();
  }
}