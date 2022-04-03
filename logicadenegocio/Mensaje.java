package logicadenegocio;
import java.util.Date;
/**
 * Es lo que contiene, detalles
 * 
 * @author Derrick Acosta
 * @version 03/04/2022
 */
public class Mensaje
{
  private Date fechaVigilancia;
  private String detalle;
  public Mensaje(Date pFechaVigencia, String pDetalle){
    fechaVigilancia=pFechaVigencia;
    detalle=pDetalle;
  }
  public String toString(){
    return;
  }
}
