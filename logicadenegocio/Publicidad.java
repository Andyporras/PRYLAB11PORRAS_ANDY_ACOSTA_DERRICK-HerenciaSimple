package logicadenegocio;

import java.util.ArrayList;

/**
 * Clase Publicidad
 * 
 * @author Derrick Acosta
 * @version abril 2022
 */
public class Publicidad {
  // Atributos de la clase
  private ArrayList<Mensaje> mensajes;

  /**
   * Constructor de la clase Publicidad
   */
  public Publicidad() {
    mensajes = new ArrayList<Mensaje>();
  }

  /**
   * Metodo para agregar un mensaje
   * 
   * @param pFechaVigencia parametro de la fecha de vigencia
   * @param pDetalle       el detalle o infformacion del mensaje
   */
  public void agregarMensaje(String pFechaVigencia, String pDetalle) {
    mensajes.add(new Mensaje(pFechaVigencia, pDetalle));
  }

  /**
   * cadena para obtener el mensaje
   * 
   * @return ArrayList<Mensaje> todos los mensajes de la clase
   */
  public ArrayList<Mensaje> getMensajes() {
    return mensajes;
  }

  /**
   * Forma de representar el objeto
   * 
   * @return msj la informacion de objeto
   */
  public String toString() {
    String msj = "";
    for (Mensaje mensaje : mensajes) {
      msj += mensaje.toString();
    }
    return msj;
  }
}
