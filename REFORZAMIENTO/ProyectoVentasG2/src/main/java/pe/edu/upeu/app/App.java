package pe.edu.upeu.app;

import java.io.Console;

import pe.edu.upeu.dao.CategoriaDao;
import pe.edu.upeu.dao.ProductoDao;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.dao.VentaDao;
import pe.edu.upeu.gui.MainGUI;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

/**
 * Hello world!
 *
 */
public class App {

    public static void registrarCategoria(CategoriaTO categ) {
        System.out.println("------------Registro de Categoria de Productos---------");
        System.out.println("IDCateg:"+categ.getIdCateg()+"\tNombre:"+categ.getNombre());
    }

    public static void menuMain(){
        String mensaje="Seleccion el algoritmo que desea Ejecutar:"+
        "\n1=Registrar Categoria"+
        "\n12=Reportar Categoria "+
        "\n2=Registrar Productos"+
        "\n21=Reportar Producto"+
        "\n22=Modificar Producto"+
        "\n3=Realizar Venta"+
        "\n4=Registrar Usuario"+
        "\n5=Registrar Venta"+
        "\n0=Salir del programa";
        LeerTeclado lt=new LeerTeclado(); 
        UtilsX ut=new UtilsX();
        CategoriaDao daoC;       
        UsuarioDao daoUso;
        ProductoDao daoPro;
        VentaDao vDao;
        int opcion=0;
        opcion=lt.leer(0, mensaje);
        do{            
            switch(opcion){
                case 1:                
                daoC=new CategoriaDao(); daoC.crearCategoria(); 
                ut.clearConsole(); break;
                case 12: 
                ut.clearConsole();
                daoC=new CategoriaDao(); daoC.reporteCategoria(); break;    
                case 2: ut.clearConsole(); daoPro=new ProductoDao(); daoPro.crearProducto(); break;
                case 21: daoPro=new ProductoDao(); daoPro.reportarProducto(); break;
                case 3: break;
                case 4: daoUso=new UsuarioDao(); daoUso.crearNuevoUsuario(); break;
                case 5: vDao=new VentaDao(); vDao.registroVenta(); break;
                default: System.out.println("La opcion que eligio no exuiste!");
                break;
            }
            if(opcion!=0){
                System.out.println("\nDesea seguir probando: ");
                opcion=lt.leer(0, mensaje);
            }
            
        }while(opcion!=0);        
    }

    public static void validarAcceso() {
        LeerTeclado lt=new LeerTeclado(); 
        Console  constx= System.console();
        String usuario=lt.leer("", "Ingrese su usuario:");
        System.out.println("Ingrese su clave:");
        char[] clave=constx.readPassword();
        UsuarioDao usuDao=new UsuarioDao();
        if(usuDao.login(usuario, clave)){
            menuMain(); 
        }else{
            System.out.println("Intente Nuevamente!!");
            validarAcceso();
        }
    }

    public static void main( String[] args ){
        validarAcceso();       
        //menuMain(); 
        //new MainGUI();
    }
}
