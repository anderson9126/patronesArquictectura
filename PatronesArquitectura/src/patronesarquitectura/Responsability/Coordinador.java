/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.Responsability;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Coordinador extends NivelAutoriza {

    protected boolean getAllowable(int days) {
        return days <= 1;
    }

    protected String getRole() {
        return "Coordinador";
    }
}
