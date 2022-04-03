package logicadenegocio;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase Mensaje, representa un mensaje
 * 
 * @author Derrick Acosta
 * @version 03/04/2022
 */
public class Mensaje {
  private Date fechaVigelancia;
  private String detalle;

  public Mensaje(String pFechaVigencia, String pDetalle) {
    setFecha(pFechaVigencia);
    detalle = pDetalle;
  }

  public void setFecha(String pFechaVigencia) {
    SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
    try {
      fechaVigelancia = mascara.parse(pFechaVigencia);
    } catch (Exception e) {
      fechaVigelancia = new Date();
    }
  }

  public String getFecha() {
    SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
    return mascara.format(fechaVigelancia);
  }

  public String toString() {
    String msj = "";
    msj += "Fecha vigelancia: " + fechaVigelancia + "\n";
    msj += "Detalle: " + detalle + "\n";
    return msj;
  }
}
