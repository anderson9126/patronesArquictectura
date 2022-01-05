/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package patronesarquitectura.state;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface State {
    public void  insertDollar(VendingMachine vendingMachine);
    public void  ejectMoney(VendingMachine vendingMachine);
    public void  dispense(VendingMachine vendingMachine);
}
