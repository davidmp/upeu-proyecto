package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class VentaDetalleTO {
//IdVentaDetalle	IdVenta	IdProducto	precioUnit	porceUtil	cantidad	precioTotal
public String idVentaDetalle, idVenta, idProducto;
public double precioUnit, porceUtil, cantidad, precioTotal;
}
