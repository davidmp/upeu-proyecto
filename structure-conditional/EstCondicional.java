import java.util.Scanner;
class EstCondicional{
  static Scanner teclado=new Scanner(System.in);
  static void ejercicio01(){
    //Definir variables y otros
    System.out.println("Ejemplo estructura Condicional en Java");
    int cantidadX=0;
    double montoP=0;
    //Datos de Entrada
    System.out.println("Ingrese la cantidad de lapices:");
    cantidadX=teclado.nextInt();
    //Proceso
    if(cantidadX>=1000){
      montoP=cantidadX*0.80;
    }else{
      montoP=cantidadX*0.90;
    }
    //Datos de salida
    System.out.println("El monto a pagar es:"+montoP);    
  }
  static void ejercicio02(){
    //Definir variables y otros
    System.out.println("Ejemplo estructura Condicional 02 en Java");
    int cantidadX=0;
    double montoP=0;
    //Datos de Entrada
    System.out.println("Ingrese la cantidad de personas:");
    cantidadX=teclado.nextInt();
    //Proceso
    if(cantidadX<=200){
      montoP=cantidadX*95;
    }else if(cantidadX>200 && cantidadX<=300){
      montoP=cantidadX*85;
    }else{
      montoP=cantidadX*75;
    }
    //Datos de salida
    System.out.println("El monto a pagar es:"+montoP);  
  }

  static void ejemploEstCondMultiple(){
    //Definir variables y otros
    System.out.println("Ejemplo estructura Condicional Multiple 01 en Java");
    String areaCarrera="";//Biomedicas=B, Ingenierías=I, Sociales=S
    double notaEP=0, notaRM=0, notaRV=0, notaAB=0, notaFinal=0;
    //Datos de Entrada
    System.out.println("Ingrese el area de la carrera:");
    areaCarrera=teclado.next();
    System.out.println("Ingrese la nota de RM:");
    notaRM=teclado.nextDouble();
    System.out.println("Ingrese la nota de RV:");
    notaRV=teclado.nextDouble();
    System.out.println("Ingrese la nota de AB:");
    notaAB=teclado.nextDouble();
    System.out.println("Ingrese la nota de EP:");
    notaEP=teclado.nextDouble();
    //Proceso
    switch(areaCarrera){
      case "B": notaFinal=(notaRM*0.10+notaRV*0.20+notaAB*0.30+notaEP*0.40);
      areaCarrera="Biomedicas";
      break;
      case "I": notaFinal=(notaRM*0.30+notaRV*0.15+notaAB*0.15+notaEP*0.40);
      areaCarrera="Ingenierías";
       break;
      case "S": notaFinal=(notaRM*0.10+notaRV*0.30+notaAB*0.20+notaEP*0.40);
       areaCarrera="Sociales";
      break;
      default: System.out.println("No Existe la Opción!!..intente nuevamente!"); break;
    }
    //Datos de salida:
    System.out.println("El postulante obtuvo la nota: "+notaFinal+" y es del area de: "+areaCarrera);
  }

  static void menuOptions(){
    int optionAlgotirmic=0;
    System.out.println("Select the algoritmic your test:\n 1=ejercicio01\n2=ejercicio02\n3=ejemploEstCondMultiple");
    optionAlgotirmic=teclado.nextInt();
    switch(optionAlgotirmic){
      case 1: ejercicio01(); break;
      case 2: ejercicio02(); break;
      case 3: ejemploEstCondMultiple(); break;
      default: System.out.println("No existe la opcion, intente nuevamente");
    }    
  }
  
  public static void main(String[] arg){     
    menuOptions();
  } 

  }