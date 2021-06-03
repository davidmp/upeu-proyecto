import java.util.Scanner;

public class Ejercicios{

    public static void imprimirMes(char mes) {        
        switch(mes){
            case 'E': System.out.println("Enero"); break;
            case 'F': System.out.println("Febrero"); break;
            case 3: System.out.println("Marzo"); break;
            case 54: System.out.println("Febrero"); break;
            case 5: System.out.println("Febrero"); break;
            case 6 : case 7: System.out.println("Junio y Julio"); break;
            //case 7: System.out.println("Febrero"); break;
            case 8: System.out.println("Agosto"); break;
            default: System.out.println("Mes no existe");break;

        }

    }


    public  void nivelDocente() {
        Scanner t=new Scanner(System.in);
        System.out.println("Ingrese el nivel del docente");
        String nivel=t.next();
        System.out.println("Ingrese el Salario");
        double salario=t.nextDouble();        
        switch(nivel.toLowerCase()){
            case "adjunto": salario=salario+salario*0.30; System.out.println("Holas"); break;
            case "auxial": { salario=salario+salario*0.45;  }  break;
            case "asistente": { salario=salario+salario*0.50;  }  break;

        }
        System.out.println("El salario del docente es:"+salario+ " y su categoria es:"+nivel);
    }


    public static void main(String[] args) {
        //imprimirMes(1);
        Ejercicios obj=new Ejercicios();
        obj.nivelDocente();

     
    }

}