/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.fachada;

import java.math.BigDecimal;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Chequing implements IAccount {

    int inicio = 0;
    int finaliza = 0;
    int id;

    public Chequing(int id, int inicios) {
        this.inicio = inicios;
        finaliza += inicios;
        this.id = id;
    }

    @Override
    public void deposito(int valor) {
        System.out.println("deposito Chequing ");
    }

    @Override
    public void retiro(int valor) {
        System.out.println("retiro Chequing ");
    }

    @Override
    public void tranferencia(int valor, IAccount cuenta) {
        System.out.println("tranferencia Chequing ");
    }

    @Override
    public int getAccountNumber() {
//        System.out.println("getAccountNumber Chequing ");
        return id;
    }
}
