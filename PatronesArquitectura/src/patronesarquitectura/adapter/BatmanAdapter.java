/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.adapter;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class BatmanAdapter implements IAutomovil {

    private Batimovil Batimovil = new Batimovil();

    @Override
    public void frenar() {
        Batimovil.batiFrenado();
    }

    @Override
    public void acelerar() {
        Batimovil.batiAcelerado();
    }
}
