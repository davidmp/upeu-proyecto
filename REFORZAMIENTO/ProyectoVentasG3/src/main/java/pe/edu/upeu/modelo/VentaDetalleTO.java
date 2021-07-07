package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VentaDetalleTO {
    //idVentaDetalle	idVenta	idProducto	precioUnit	porcentUtil	cantidad	precioTotal
    public String idVentaDetalle, idVenta, idProducto;
    public double precioUnit,porcentUtil,cantidad,precioTotal;
}
