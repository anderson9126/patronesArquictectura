/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.state;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class HasOneDollarState implements State {

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("already have one dollar");
        vendingMachine.doReturnMoney();
        vendingMachine.setState(vendingMachine.getIdleState());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("returning money ");
        vendingMachine.doReturnMoney();
        vendingMachine.setState(vendingMachine.getIdleState());

    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("releasing product");
        if (vendingMachine.getCount() > 1) {
            vendingMachine.doReleaseProduct();
            vendingMachine.setState(vendingMachine.getIdleState());
        } else {
            vendingMachine.doReleaseProduct();
            vendingMachine.setState(vendingMachine.getOutOfStockState());
        }

    }
}
