

import java.util.Scanner;

/**
 * ExamUnitOne
 */
public class ExamUnitOne {
    static Scanner teclado = new Scanner(System.in);

    public static void questionOne() {
        // variables
        float primera_unidad, segunda_unidad, tercera_unidad;
        double trabajo_final;
        //datos de entrada
        System.out.println("Ingrese la Primera Unidad ");
        primera_unidad = teclado.nextFloat();
        System.out.println("Ingrese la Segunda Unidad");
        segunda_unidad = teclado.nextFloat();
        System.out.println("Ingrese la Tercera Unidad");
        tercera_unidad = teclado.nextFloat();
        System.out.println("Ingrese la nota del trabajo final");
        trabajo_final = teclado.nextDouble();

        //preceso
        trabajo_final = (primera_unidad * 0.20) + (segunda_unidad * 0.15) + (tercera_unidad * 0.15)+ (trabajo_final *0.50);
        //trabajo_final = Math.round(trabajo_final*100)/100.0; // redondear a decimales.

        // salida
        System.out.printf("El promedio es: " + trabajo_final+"\n");        
    }

    public static void questionTwo() {
      //Definir variables y otros
      int puntos;
      double salarioMinimo, bonoDocente=0;
      //Datos de entrada
      System.out.print("Ingrese el salario Minimo:");
      salarioMinimo=teclado.nextDouble();
      System.out.print("Ingrese la puntuacion obtenida:");
      puntos=teclado.nextInt();
      //proceso
      if (puntos>=50 && puntos<=100) {
        bonoDocente=salarioMinimo*0.10;
      } else if(puntos>=101 && puntos<=150) {
        bonoDocente=salarioMinimo*0.40;
      }else if(puntos>=151) {
        bonoDocente=salarioMinimo*0.70;
        }
        //Datos de salida
        System.out.println("El bono del docente es:"+bonoDocente);
    }

    public static void questionThree() {
      //Definir variables y otros
      int edad;
      char genero;
      String mensajeVacuna;
      //Datos
      System.out.println("Ingrese su edad:");
      edad= teclado.nextInt();
      System.out.println("Ingrese su Genero  F=Femenino, M=Masculino:");
      genero= teclado.next().toUpperCase().charAt(0);
        //Proceso
        if (edad>70) {
            mensajeVacuna="Se le aplica el tipo C";
        } else if(edad>=16 && edad<=70 && genero=='F'){
            mensajeVacuna="Se le aplica el tipo B";
        }else if(edad>=16 && edad<=70 && genero=='M'){
            mensajeVacuna="Se le aplica el tipo A";
        }else{
            mensajeVacuna="Se le aplica el tipo A";
        }
        //Datos de salida
        System.out.println(mensajeVacuna);

    }    

    public static void questionFour() {
       //Definir variables y otros
       double numeroUno,numeroDos, resultadoOper=0;
       char operador;
       //Datos de entrada
       System.out.println("Ingrese el primer valor:");
        numeroUno=teclado.nextDouble();
       System.out.println("Ingrese el operador +,-,/,*,^ :");
        operador=teclado.next().charAt(0);
       System.out.println("Ingrese el segundo valor:");
       numeroDos=teclado.nextDouble();
       //Proceso
        switch (operador) {
            case '+': resultadoOper=numeroUno+numeroDos;  break;
            case '-': resultadoOper=numeroUno-numeroDos; break;
            case '/': resultadoOper=numeroUno/numeroDos; break;
            case '*': resultadoOper=numeroUno*numeroDos; break;
            case '^': resultadoOper=Math.pow(numeroUno, numeroDos); break;        
            default: System.out.println("Operador no existe!"); break;
        }
        //Datos de salida
        System.out.println("La operacion que se realizo es "+operador+" y el resultado es:"+resultadoOper);
    }    

    public static void menuMain() {
        String mensaje="\nSeleccion el algoritmo que desea probar:"+
        "\n1=Question One"+
        "\n2=Question two"+
        "\n3=Question three"+
        "\n4=Question four"+
        "\n0=Salir del sistema"
        ;
        System.out.println(mensaje);
        int opciones=teclado.nextInt();         
        do {
            switch (opciones) {
                case 1: questionOne(); break;
                case 2: questionTwo(); break;
                case 3: questionThree(); break;     
                case 4: questionFour(); break;    
                default:System.out.println("Opcion no existe");   break;
            }            
            if (opciones!=0){ 
            System.out.println("\nDesea probar otraves? "+mensaje);
            opciones=teclado.nextInt(); 
            }            
        }while (opciones!=0);
    }


    public static void main(String[] args) {
        menuMain();
    }
}