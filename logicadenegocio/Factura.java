package logicadenegocio;

import java.util.ArrayList;
import java.util.Date;

import javax.sound.sampled.Line;

/**
 * Esta es la clase de la factura va tener los detalles de la compra
 * 
 * @author Derrick Acosta
 * @version 03/04/2022
 */
public class Factura {
  private int catidadFactura;
  private String nombre;
  private String cedulaJuridica;
  private String direccion;
  private int telefono;
  private Date fechaFactura;
  private Date horaFactura;
  private int numeroFactura;
  private ArrayList<LineaDetalle> lineaDetalle;

  public Factura(String pNombre, String pCedulaJuridica, String pDireccion, int pTelefono, Date pFechaFactura,
      Date pHoraFactura, int pNumeroFactura, Empleado pCajero, Empleado pVendedor) {
    lineaDetalle = new ArrayList<LineaDetalle>();
    nombre = pNombre;
    cedulaJuridica = pCedulaJuridica;
    direccion = pDireccion;
    telefono = pTelefono;
    fechaFactura = pFechaFactura;
    horaFactura = pHoraFactura;
    numeroFactura = pNumeroFactura;
  }
  public double calcularSubTotal(){
    double subTotal=0;
    for(LineaDetalle linea: lineaDetalle){
      subTotal+=linea.getPrecio();
    }
    return subTotal;
  }

}
