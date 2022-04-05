package logicadenegocio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
  private String telefono;
  private Date fechaFactura;
  private Date horaFactura;
  private int numeroFactura;
  private Mensaje anuncio;
  private ArrayList<LineaDetalle> lineaDetalle;
  private Empleado cajero;
  private Empleado vendedor;
  private Cliente cliente;

  /**
   * Constructor for objects of class Factura
   */
  public Factura(String pNombre, String pCedulaJuridica, String pDireccion, String pTelefono,
      Empleado pCajero, Empleado pVendedor, Cliente pCliente, int pCantidad, String pDescricion, int pPrecioFinal,
      int pGarantia,
      int pCodigoTecnico, int pMantenimientoOReparacion) {
    lineaDetalle = new ArrayList<LineaDetalle>();
    lineaDetalle.add(new LineaDetalle(pCantidad, pDescricion, pPrecioFinal, pGarantia, pCodigoTecnico,
        pMantenimientoOReparacion));
    nombre = pNombre;
    cedulaJuridica = pCedulaJuridica;
    direccion = pDireccion;
    telefono = pTelefono;
    setFechaFactura();
    setHoraFactura();
    catidadFactura++;
    numeroFactura = catidadFactura;
    cajero = pCajero;
    vendedor = pVendedor;
    cliente = pCliente;
  }

  /**
   * Constructor for objects of class Factura
   */
  public Factura(String pNombre, String pCedulaJuridica, String pDireccion, String pTelefono,
      Empleado pCajero, Empleado pVendedor, Cliente pCliente, int pCantidad, String pDescricion, Double pPrecioFinal,
      int pGarantia,
      String pMarca) {
    lineaDetalle = new ArrayList<LineaDetalle>();
    lineaDetalle.add(new LineaDetalle(pCantidad, pDescricion, pPrecioFinal, pGarantia, pMarca));
    nombre = pNombre;
    cedulaJuridica = pCedulaJuridica;
    direccion = pDireccion;
    telefono = pTelefono;
    setFechaFactura();
    setHoraFactura();
    catidadFactura++;
    numeroFactura = catidadFactura;
    cajero = pCajero;
    vendedor = pVendedor;
    cliente = pCliente;

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

  public void agregarItem(int pCantidad, String pDescricion, Double pPrecioFinal, int pGarantia, String pMarca) {
    lineaDetalle.add(new LineaDetalle(pCantidad, pDescricion, pPrecioFinal, pGarantia, pMarca));
  }

  public void agregarItem(int pCantidad, String pDescricion, int pPrecioFinal, int pGarantia, int pCodigoTecnico,
      int pMantenimientoOReparacion) {
    lineaDetalle.add(
        new LineaDetalle(pCantidad, pDescricion, pPrecioFinal, pGarantia, pCodigoTecnico, pMantenimientoOReparacion));

  }

  public void agregarAnuncio(Mensaje pAnuncio) {
    anuncio = pAnuncio;
  }

  public String getFechar() {
    SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
    return mascara.format(fechaFactura);
  }

  public int getNumFactura() {
    return numeroFactura;
  }

  public String toString() {
    String msj = "";
    msj += "\t\t\t" + nombre + "\n";
    msj += "\t\tCedula Juridica: " + cedulaJuridica + "\n";
    msj += "\t\tDireccion: " + direccion + "\n";
    msj += "\t\tTelefono: " + telefono + "\n";
    msj += "Fecha Factura: " + getFechar();
    msj += " Hora: " + horaFactura + "\n\n";
    msj += "Numero de Factura: " + numeroFactura + "\n";
    msj += "Vendedor: V" + vendedor.getNumeroEmpleado() + "  " + vendedor.getNombre() + "\n";
    msj += "Cajero: C" + cajero.getNumeroEmpleado() + "  " + cajero.getNombre() + "\n";
    msj += "Cliente: " + cliente.toString() + "\n\n";
    msj += "Detalle de la Factura:\n";
    msj += "Cantidad\tDescripcion\tprecio\n";
    for (LineaDetalle linea : lineaDetalle) {
      msj += linea.toString();
    }
    msj += "\t\t\tSubtotal: " + calcularSubTotal() + "\n";
    msj += "\t\t\tImpuesto: " + calcularImpuestoVenta() + "\n";
    msj += "\t\t\tTotal: " + calcularTotal() + "\n\n";
    msj += "Anuncio: " + anuncio.toString();
    return msj;
  }

}
