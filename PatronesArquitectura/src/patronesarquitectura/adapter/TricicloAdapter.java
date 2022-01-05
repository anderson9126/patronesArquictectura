/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.adapter;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TricicloAdapter implements IAutomovil {

    private Triciclo triciclo = new Triciclo();

    @Override
    public void frenar() {
        triciclo.bajarPies();
        triciclo.rozarPies();
    }

    @Override
    public void acelerar() {
        triciclo.pedalear();
    }

}
