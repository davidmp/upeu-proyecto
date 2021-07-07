package pe.edu.upeu.util;

import java.io.*;

public class LeerTeclado {
    
    BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in)); 


    public int leer(int valor, String msg) {
       System.out.println(msg);
       try {
        valor=Integer.parseInt(br.readLine());
       } catch (Exception e) {
           valor=leer(valor, msg);
       }
        return valor;
    }

    public long leer(long valor, String msg) {
        System.out.println(msg);
       try {
        valor=Long.parseLong(br.readLine());
       } catch (Exception e) {
           valor=leer(valor, msg);
       }
        return valor;
    }

    public double leer(double valor, String msg) {
        System.out.println(msg);
        try {
            valor=Double.parseDouble(br.readLine());
           } catch (Exception e) {
               valor=leer(valor, msg);
           }
            return valor;
    } 
    public char leer(char valor, String msg) {
        System.out.println(msg);
        try {
            valor=br.readLine().charAt(0);//Pedro
           } catch (Exception e) {
               valor=leer(valor, msg);
           }
            return valor;
    }    
    public String leer(String valor, String msg) {
        System.out.println(msg);
        try {
            valor=String.valueOf(br.readLine());//Pedro
           } catch (Exception e) {
               valor=leer(valor, msg);
           }
            return valor;
    }     
    public boolean leer(boolean valor, String msg) {
        System.out.println(msg);
        try {
            valor=Boolean.parseBoolean(br.readLine());//Pedro
           } catch (Exception e) {
               valor=leer(valor, msg);
           }
            return valor;
    }      

}
