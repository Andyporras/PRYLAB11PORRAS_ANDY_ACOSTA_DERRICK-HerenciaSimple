package logicadenegocio;

import java.text.SimpleDateFormat;
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
  private static int catidadFactura;
  private String nombre;
  private String cedulaJuridica;
  private String direccion;
  private int telefono;
  private Date fechaFactura;
  private Date horaFactura;
  private int numeroFactura;
  private Mensaje anuncio;
  private ArrayList<LineaDetalle> lineaDetalle;

  public Factura(String pNombre, String pCedulaJuridica, String pDireccion, int pTelefono,
      Empleado pCajero, Empleado pVendedor) {
    lineaDetalle = new ArrayList<LineaDetalle>();
    nombre = pNombre;
    cedulaJuridica = pCedulaJuridica;
    direccion = pDireccion;
    telefono = pTelefono;
    setFechaFactura();
    setHoraFactura();
    catidadFactura++;
    numeroFactura = catidadFactura;

  }

  public void setHoraFactura() {
    horaFactura = new Date();
  }

  public String getHoraFactura() {
    SimpleDateFormat mascara = new SimpleDateFormat("HH:mm:ss");
    return mascara.format(horaFactura);
  }

  public void setFechaFactura() {
    fechaFactura = new Date();
  }

  public double calcularSubTotal() {
    double subTotal = 0;
    for (LineaDetalle linea : lineaDetalle) {
      subTotal += linea.getPrecio();
    }
    return subTotal;
  }

  public double calcularImpuestoVenta() {
    double impuestoVenta = 0;
    for (LineaDetalle linea : lineaDetalle) {
      impuestoVenta += linea.getPrecio() * 0.13;
    }
    return impuestoVenta;
  }

  public double calcularTotal() {
    double total = 0;
    total += calcularSubTotal() + calcularImpuestoVenta();
    return total;
  }

  public void agregarAnuncio(Mensaje pAnuncio) {
    anuncio = pAnuncio;
  }

  public String getFechar() {
    SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
    return mascara.format(fechaFactura);
  }

  public String toString() {
    String msj = "";
    msj += "Nombre: " + nombre + "\n";
    msj += "Cedula Juridica: " + cedulaJuridica + "\n";
    msj += "Direccion: " + direccion + "\n";
    msj += "Telefono: " + telefono + "\n";
    msj += "Fecha Factura: " + getFechar() + "\n";
    msj += "Hora Factura: " + horaFactura + "\n";
    msj += "Numero Factura: " + numeroFactura + "\n";
    msj += "SubTotal: " + calcularSubTotal() + "\n";
    msj += "Impuesto Venta: " + calcularImpuestoVenta() + "\n";
    msj += "Total: " + calcularTotal() + "\n";
    return msj;
  }

}
