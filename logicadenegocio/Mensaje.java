package logicadenegocio;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Clase Mensaje, representa un mensaje
 * 
 * @author Andy Porras
 * @version 03/04/2022
 */
public class Mensaje {
  //Atributos de la clase
  private Date fechaVigelancia;
  private String detalle;
  /**
   * Constructor de la clase Mensaje
   * @param pFechaVigencia la fecha de vigencia
   * @param pDetalle el detalle del mensaje
   */
  public Mensaje(String pFechaVigencia, String pDetalle) {
    setFecha(pFechaVigencia);
    detalle = pDetalle;
  }
  /**
   * Metodo accesor para obtener la fecha
   * @param pFechaVigencia el parametro para la fecha de vigencia
   */
  public void setFecha(String pFechaVigencia) {
    SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
    try {
      fechaVigelancia = mascara.parse(pFechaVigencia);
    } catch (Exception e) {
      fechaVigelancia = new Date();
    }
  }
  /**
   * Metodo constructor para obtener la fecha
   * @return mascara.format(fechaVigelancia) obtener la fecha
   */
  public String getFecha() {
    SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
    return mascara.format(fechaVigelancia);
  }
  /**
   * Metodo para representar el objeto
   * @return msj la informacion del objeto
   */
  public String toString() {
    String msj = "";
    msj += "Fecha vigelancia: " + getFecha() + "\n";
    msj += "Detalle: " + detalle + "\n";
    return msj;
  }
}
