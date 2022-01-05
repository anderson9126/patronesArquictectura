/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package patronesarquitectura.state;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class OutOfStockState implements State{

  @Override
    public void insertDollar(VendingMachine vendingMachine) {
       
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("no money return");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("payment required");
    }
}
