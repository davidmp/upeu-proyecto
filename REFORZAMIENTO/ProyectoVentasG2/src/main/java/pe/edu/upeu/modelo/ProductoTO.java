package pe.edu.upeu.modelo;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductoTO {
   public String idProducto, nombre, unidadMed, idCateg;
   public double precioUnit, porceUtil, stock;   
}
