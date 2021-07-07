package pe.edu.upeu.arreglos;

public class Transformadas {
 
    public void contarCerosPostNegMatriz() {
        int cantNeg=0, cantPost=0, cantCeros=0;
        int[][] matrizT={
            {5,	6,	0},
            {5,	-6,	2},
            {0,	12,	-2},
            {0,	6,	2}
        };
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                if (matrizT[i][j]<0) {
                    cantNeg++;
                }else if(matrizT[i][j]==0){
                    cantCeros++;
                }else{
                    cantPost++;
                }
            }
        }  
        System.out.println("Cantidad ceros:"+cantCeros);      
        System.out.println("Cantidad positivos:"+cantPost);      
        System.out.println("Cantidad Negativos:"+cantNeg);      
    }

    public void transformada1(int dimension, int valorElem) {
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {     
                if (c<dimension-f) {
                    matriz[f][c]=""+(valorElem+(f+c)*(f+c+1)/2 + f); 
                }else{
                    matriz[f][c]="";
                }                
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformada2(int dimension, int valorElem) {
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {     
                if (c<dimension-f) {
                    matriz[f][c]=""+(valorElem+(f+c)*(f+c+1)/2 + c); 
                }else{
                    matriz[f][c]="";
                }                
            }
        }
        imprimirMatriz(matriz);
    }    

    public void imprimirMatriz(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }  

    public static void main(String[] args) {
        Transformadas tObj=new Transformadas();
        tObj.contarCerosPostNegMatriz();
        tObj.transformada1(5, 0);
        tObj.transformada2(5,0);
    }
}
