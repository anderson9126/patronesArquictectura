/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.adapter;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PicaPiedraAdapter implements IAutomovil {

    private TroncoMovil troncoMovil = new TroncoMovil();

    @Override
    public void frenar() {
        troncoMovil.bajarPies();
        troncoMovil.rozarPies();
    }

    @Override
    public void acelerar() {
        troncoMovil.bajarPies();
        troncoMovil.correr();
    }

}
