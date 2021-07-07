package pe.edu.upeu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.modelo.VentaDetalleTO;
import pe.edu.upeu.modelo.VentaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class VentaDao extends AppCrud{
   LeerArchivo lar;
   LeerTeclado lte=new LeerTeclado();
   UtilsX ut=new UtilsX();
   ProductoTO prodTO;
   VentaTO ventTO;
   VentaDetalleTO vdTO;
   SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
   SimpleDateFormat formatoFecha=new SimpleDateFormat("dd-MM-yyyy");    

    public void registroVentaGeneral() {
        VentaTO vTO=crearVenta();
        double precioTotalX=0;
        String continuaV="SI";
        do {
            VentaDetalleTO toVD=carritoVenta(vTO);

            precioTotalX=precioTotalX+toVD.getPrecioTotal();
            
            continuaV=lte.leer("", "Desea comprar algo mas? (SI=S, NO=N):");
        } while (continuaV.charAt(0)=='S');
        vTO.setPrecioTotal(precioTotalX);
        vTO.setNetoTotal(precioTotalX/1.18);
        vTO.setIgv(vTO.getNetoTotal()*0.18);
        lar=new LeerArchivo("Venta.txt");
        editarRegistro(lar, 0, vTO.getIdVenta(), vTO);        
    }

    public VentaTO crearVenta() {
        lar=new LeerArchivo("Venta.txt");
        ventTO=new VentaTO();
        ventTO.setIdVenta(generarId(lar, 0, "V", 1));
        ventTO.setDniCliente(lte.leer("", "Ingrese el DNI del cliente:"));
        ventTO.setFechaVenta(formato.format(new Date()));
        ventTO.setIgv(0.0);
        ventTO.setNetoTotal(0.0);
        ventTO.setPrecioTotal(0.0);
        lar=new LeerArchivo("Venta.txt");
        agregarContenido(lar, ventTO);
        return ventTO;
    }

    public VentaDetalleTO carritoVenta(VentaTO vTO) {
        
        vdTO=new VentaDetalleTO();
        ut.clearConsole();
        System.out.println("*************Agregar Productos a carrito de venta********");
        mostrarProductos();
        vdTO.setIdProducto(lte.leer("", "Ingrese el ID del Producto:"));
        vdTO.setIdVenta(vTO.getIdVenta());
        lar=new LeerArchivo("VentaDetalle.txt");
        vdTO.setIdVentaDetalle(generarId(lar, 0, "DV", 2));
        lar=new LeerArchivo("Producto.txt");
        Object[][] dataP=buscarContenido(lar, 0, vdTO.getIdProducto());
        double porcentUtil=Double.parseDouble(String.valueOf(dataP[0][5]));
        double punit=Double.parseDouble(String.valueOf(dataP[0][4]));
        vdTO.setPorcentUtil(porcentUtil);
        vdTO.setPrecioUnit(punit+punit*porcentUtil);
        vdTO.setCantidad(lte.leer(0.0, "Ingrese una cantidad:"));
        vdTO.setPrecioTotal(vdTO.getCantidad()*vdTO.getPrecioUnit());
        lar=new LeerArchivo("VentaDetalle.txt");
        agregarContenido(lar, vdTO);
        return vdTO;
    }

    public void mostrarProductos() {
        lar=new LeerArchivo("Producto.txt");
        Object[][] dataP=listarContenido(lar);
        for (int i = 0; i < dataP.length; i++) {
            System.out.print(dataP[i][0]+"="+dataP[i][1]+
            "(P.Unit S/.:"+dataP[i][4]+", Stock:"+dataP[i][6]+"); ");
        }
        System.out.println("");
    }

}
