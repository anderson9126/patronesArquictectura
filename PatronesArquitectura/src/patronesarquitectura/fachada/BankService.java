/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.fachada;

import java.math.BigDecimal;
import java.util.Hashtable;
import java.util.Map;
import javax.xml.transform.OutputKeys;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class BankService {

    private Hashtable< Integer, IAccount> bankAccount;
    private int numero = 1;

    public BankService() {
        this.bankAccount = new Hashtable<>();
    }

    public int createNewAccount(String type, int initAmount) {
        IAccount newAccounts = null;
        switch (type) {
            case "chequing":
                newAccounts = new Chequing(numero, initAmount);
                break;
            case "saving":
                newAccounts = new Saving(numero, initAmount);
                break;
            case "investment":
                newAccounts = new Investment(numero, initAmount);
                break;
            default:
                System.out.println("invalido el tipo de transaccion");
                break;
        }
        if (newAccounts != null) {
            this.bankAccount.put(newAccounts.getAccountNumber(), newAccounts);
            numero++;
            return newAccounts.getAccountNumber();
        }
        return -1;
    }

    public void getAccounts() {
        for (Map.Entry<Integer, IAccount> entry : bankAccount.entrySet()) {
            Integer cuenta = entry.getKey();
            System.out.println("Cod_Cuenta: " + cuenta);
        }
    }

    public void transferMoney(int to, int from, int amount) {
        IAccount toAccount = this.bankAccount.get(to);
        IAccount fromAccount = this.bankAccount.get(from);
//fromAccount.tranferencia(toAccount,amount);
        fromAccount.tranferencia(amount, toAccount);
        System.out.println("Trnsferi $ " + amount);
    }

    public void depositarDinero(int cuenta, int monto) {
        IAccount toAccount = this.bankAccount.get(cuenta);
        toAccount.deposito(monto);
        System.out.println("Deposito Total: " + monto);
    }

    public void retiroDinero(int cuenta, int monto) {
        IAccount toAccount = this.bankAccount.get(cuenta);
        System.out.println("Retiro  : " + monto);
        toAccount.retiro(cuenta);
    }
}
