/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.adapter;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CarrozaAdapter implements IAutomovil {

    private Carroza carroza = new Carroza();

    @Override
    public void frenar() {
        carroza.halarRiendas();
    }

    @Override
    public void acelerar() {
        carroza.moverRiendas();
        carroza.arrearCaballo();
    }
}
