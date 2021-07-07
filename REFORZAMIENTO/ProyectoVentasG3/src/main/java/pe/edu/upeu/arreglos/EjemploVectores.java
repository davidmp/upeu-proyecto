package pe.edu.upeu.arreglos;

/**
 * EjemploVectores
 */
public class EjemploVectores {


    public static void conceptosVectores() {
        //varibale vector
        int[] vector;        
        int []vectorx;
        //dando un tamanho al vector
        vector=new int[10];
        //asignando valores al vector
        vector[2]=78;
        vector[0]=20;
        vector[9]=10;
        vector[0]=40;
        System.out.println(vector[0]);
        //asignando valores directo al vector
        int[] vA={20,2,3,4,10,6,7,8,9,10};
        System.out.println("Imprimeinto los valores de la posicion 7 y 0");
        System.out.println(vA[7]);//imprimir el valor 8 del vector vA
        System.out.println(vA[0]);//imprimir el valor 20 del vector vA
        //como saber el tamanho de un vector
        System.out.println("tamanho del vector vA="+(vA.length));
    }

    public static void tablaMultiplicar() {
        int[] vA={1,2,3,4,5,6,7,8,9,10};
        int[] vB={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < vA.length; i++) {
            for (int j = 0; j < vB.length; j++) {
                System.out.println(vA[i]+"*"+vB[j]+"="+(vA[i]*vB[j]));
            }
            System.out.println("");
        }
    }

    public static void invertirVector() {
        int[] a={1,2,3,4,5}; //vector invertido b =  {5,4,3,2,1}.
        int[] b=new int[a.length];
        
        for (int i = 0; i < b.length; i++) {
            b[i]=a[(b.length-1)-i];    
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("b["+i+"]"+b[i]);
        }

    }

    public static void contarElementosVecCerosPosNeg(int[] vector) {
        int cantCeros=0, cantPost=0, cantNeg=0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]<0) {
                cantNeg++;
            }else if(vector[i]==0){
                cantCeros++;
            }else{
                cantPost++;
            }
        }
        System.out.println("Elementos con valor cero son:"+cantCeros);
        System.out.println("Elementos con valores positivos es:"+cantPost);
        System.out.println("Elementos con valores Negaticos es:"+cantNeg);
    }


    public static void main(String[] args) {
        conceptosVectores();
        //tablaMultiplicar();
        System.out.println("Invertir vector:");
        invertirVector();
        System.out.println("");
        int[] vA={1,2,3,4,5,6,7,8,9,10,-5,2,0,-7,3,0};
        contarElementosVecCerosPosNeg(vA);
        
    }
    
}