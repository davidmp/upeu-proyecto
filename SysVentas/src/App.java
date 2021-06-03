import java.util.Scanner;

public class App {

   static Scanner teclado=new Scanner(System.in);

    public static void impuestoVehiculos() {
        //definir variables
        double totalImpPagar=0, impuestoUniV=0, impuestoTotalCateg=0;
        //Proceso/Datos entra/Datos de salida
        for (int categ = 1; categ <= 3; categ++) {
            System.out.println("Ingrese la cantidad de Vehiculos de categoria "+categ+":");
            int cantidadV=teclado.nextInt();
            System.out.println("Ingrese el valor de Vehiculos de categoria "+categ+":");
            double valorV=teclado.nextInt(); 
            if (categ==1) {impuestoUniV=valorV*0.10;}
            if (categ==2) {impuestoUniV=valorV*0.07;}
            if (categ==3) {impuestoUniV=valorV*0.05;}

            impuestoTotalCateg=impuestoUniV*cantidadV;
            totalImpPagar+=impuestoTotalCateg;
            System.out.println("El impuesto a pagar por cada vehiculo de categoria "+categ+" es:"+impuestoUniV);
            System.out.println("El total impuesto de cateroria "+categ+" es:"+impuestoTotalCateg);
            System.out.println("\n\n");
        }
        System.out.println("El total de impuesto x todos los vehiculos es:"+totalImpPagar);
    }


    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
       impuestoVehiculos();
    }
}
