/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.Responsability;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public abstract class NivelAutoriza implements ICliente {

    protected NivelAutoriza successor;

    abstract protected boolean getAllowable(int days);

    abstract protected String getRole();

    public void setSuccessor(NivelAutoriza successor) {
        this.successor = successor;
    }

    @Override
    public void procesaSolicitud(Permiso request) {
  if (this.getAllowable(request.getDias())) {
            System.out.println(this.getRole() + " aprueba "
                    + request.getDias() + " días de descanso");
        }
        if (successor != null) {
            successor.procesaSolicitud(request);
        }
    }
}
