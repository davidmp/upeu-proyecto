package pe.edu.upeu.arreglos;

import pe.edu.upeu.util.LeerTeclado;

public class EjemploMatrices {
    

    public void conceptoMatrices() {
       //definir una matriz con valores/elementos predefinidos
       int[][] matriz={
           {5,	6,	6},
           {5,	6,	2},
           {5,	12,	2},
           {5,	6,	2}
       }; 
       //obtener la dimension en filas
       System.out.println("dimension en Fila:"+matriz.length);
       //obtener la dimension en columnas
       System.out.println("dimension en columna:"+matriz[0].length);
       //definir matriz sin valores
       int[][] matrix;
       //deinir tamanho a una matriz
       matrix=new int[3][3];
       //colocar lavores en una posicion de matriz
       matrix[1][2]=14;
       //imprimiendo valores/elementos de una matriz
       System.out.println("el valor de la posion (1,2) es:"+matrix[1][2]);

    }
    public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }

    public void imprimirMatriz(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t\t");
            }
            System.out.println("");
        }
    }    

    public void matricesTiposDatos() {
        System.out.println("");
        int[][] matriz={
            {5,	6,	6},
            {5,	6,	2}};
            imprimirMatriz(matriz);
        System.out.println("");
        double[][] matrizX={{2.5,6,4.5},{5,6,2.4}};
        imprimirMatriz(matrizX);
        System.out.println("");
        Object[][] matrizO={
            {"P0001","Manzana",	3.5,	50},
            {"P0002","Pera",	4.6,	20},
            {"P0003","Naranja",	2,	2}
            };
            imprimirMatriz(matriz);
    }

    public void sumaMatrices(double[][] mA, double[][] mB) {
        double[][] sumM;
        if (mA.length==mB.length && mA[0].length==mB[0].length) {
            sumM=new double[mA.length][mA[0].length];
            for (int i = 0; i < sumM.length; i++) {
                for (int j = 0; j < sumM.length; j++) {
                    sumM[i][j]=mA[i][j]+mB[i][j];
                }
            }
            imprimirMatriz(sumM);
        }else{
            System.out.println("Las matrices son de distintas dimensiones");
        }

    }

public void mostrarElementoSegunIndices(int iF, int iC) {
    int[][] matriz={
        {5,	6,	6},
        {5,	6,	2},
        {5,	12,	2},
        {5,	6,	2}
    };
    imprimirMatriz(matriz);
    System.out.println("El valor en esos indices M("+iF+","+iC+
    ") corresponde a: "+matriz[iF][iC]);
}    


    public static void main(String[] args) {
        EjemploMatrices emx=new EjemploMatrices();
        emx.conceptoMatrices();

        int[][] matriz={
            {5,	6,	6},
            {5,	6,	2},
            {5,	12,	2},
            {5,	6,	2}
        };
        emx.imprimirMatriz(matriz);
        emx.matricesTiposDatos();
        System.out.println("-----Suma matrices------");
        double[][] mA={
            {4,5},
            {7,3}
        };
        double[][] mB={
            {4,3},
            {4,3}
        };
        emx.sumaMatrices(mA, mB);
        System.out.println("-----Leer elementos segun indice definido------");
        LeerTeclado leer=new LeerTeclado();
        emx.mostrarElementoSegunIndices(leer.leer(0,"Ingrese indice de Fila:"), 
        leer.leer(0,"Ingrese indice de Fila:"));

        int[][] matrizT={
            {5,	6,	0},
            {5,	-6,	2},
            {0,	12,	-2},
            {0,	6,	2}
        };

    }

}
