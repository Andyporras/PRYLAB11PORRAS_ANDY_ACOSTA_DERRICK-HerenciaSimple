package logicadenegocio;

import java.util.ArrayList;

public class Publicidad {
  private ArrayList<Mensaje> mensajes;

  public Publicidad() {
    mensajes = new ArrayList<Mensaje>();
  }

  public void agregarMensaje(String pFechaVigencia, String pDetalle) {
    mensajes.add(new Mensaje(pFechaVigencia, pDetalle));
  }

  public ArrayList<Mensaje> getMensajes() {
    return mensajes;
  }
  public String toString() {
    String msj = "";
    for (Mensaje mensaje : mensajes) {
      msj += mensaje.toString();
    }
    return msj;
  }
}
