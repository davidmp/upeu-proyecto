package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ProductoDao extends AppCrud {
   
    LeerArchivo lar;
    ProductoTO prodTO;
    CategoriaTO catTO;

    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();    

    public void crearProducto() {
        prodTO=new ProductoTO();
        prodTO.setNombre(lte.leer("", "Ingrese nombre de producto:"));
        mostrarCategoria();
        prodTO.setIdCateg(lte.leer("", "Eliga el Id de categoria:"));
        lar=new LeerArchivo("Producto.txt");
        prodTO.setIdProducto(generarId(lar, 0, "P", 1));
        prodTO.setUnidadMed(lte.leer("", "Ingrrese Unidad de Medida:"));
        prodTO.setPrecioUnit(lte.leer(0.0, "Ingrese el precio Unitario:"));
        prodTO.setPorceUtil(lte.leer(0.0, "Ingrese el porcentaje de utilidad:"));
        prodTO.setStock(lte.leer(0.0, "Ingrese el Stock:"));
        lar=new LeerArchivo("Producto.txt");
        agregarContenido(lar, prodTO);
    }

    public void reportarProducto() {
        lar=new LeerArchivo("Producto.txt");
        Object[][] data=listarContenido(lar);
        String dataX="";
        ut.pintarLine('H',32);
        ut.pintarTextHeadBody('H', 2, "ID,Nombre,U.Med,IdCat,P.Unit,P.Util,Stock"); 
        System.out.println("");
        ut.pintarLine('H',32);       
       for (int i = 0; i < data.length; i++) {
           for (int j = 0; j < data[0].length; j++) {
               if(j==0){
                dataX+=""+data[i][j];
               }else{
                dataX+=","+data[i][j]; 
               }               
           }
           ut.pintarTextHeadBody('B', 2, dataX);  
           dataX="";
       }         
    }

    public void mostrarCategoria() {
        lar=new LeerArchivo("Categoria.txt");
        Object[][] data=listarContenido(lar);
        for (int i = 0; i < data.length; i++) {
           System.out.print(data[i][0]+"="+data[i][1]+", "); 
        }
        System.out.println("");
    }

}
