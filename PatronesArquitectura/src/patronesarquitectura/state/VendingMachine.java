/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.state;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VendingMachine {

    private State idleState;
    private State hasOneDollarState;
    private State outOfStockState;

    private State currentState;
    private int count;

    public VendingMachine(int count) {
        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
        outOfStockState = new OutOfStockState();
        if (count > 0) {
            currentState = idleState;
            this.count = count;
        } else {
            currentState = outOfStockState;
            this.count = 0;
        }
    }

    public State getIdleState() {
        return idleState;
    }

    public void setIdleState(State idleState) {
        this.idleState = idleState;
    }

    public State getHasOneDollarState() {
        return hasOneDollarState;
    }

    public void setHasOneDollarState(State hasOneDollarState) {
        this.hasOneDollarState = hasOneDollarState;
    }

    public State getOutOfStockState() {
        return outOfStockState;
    }

    public void setOutOfStockState(State outOfStockState) {
        this.outOfStockState = outOfStockState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void insertDollar() {
        currentState.insertDollar(this);
    }

    public void ejectMoney() {
        currentState.ejectMoney(this);
    }

    public void dispense() {
        currentState.dispense(this);
        count -= 1;
    }

    public void doReturnMoney() {
        System.out.println("Return Money.....");
    }

  public  void doReleaseProduct() {
        System.out.println(" Release  Product.....");
    }

   public  int getCount() {
        return this.count;
    }

    void setState(State nuevoStado) {
       currentState = nuevoStado;
    }

}
