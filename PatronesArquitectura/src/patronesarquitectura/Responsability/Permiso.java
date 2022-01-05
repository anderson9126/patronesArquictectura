/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package patronesarquitectura.Responsability;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Permiso {
private int dias;
private String solicitud;

    public Permiso(int dias, String solicitud) {
        this.dias = dias;
        this.solicitud = solicitud;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }


}
