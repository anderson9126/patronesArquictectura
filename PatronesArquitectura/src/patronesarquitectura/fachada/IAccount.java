
package patronesarquitectura.fachada;

import java.math.BigDecimal;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface IAccount {

public void deposito(int cuenta);
public void retiro(int cuenta);
public void tranferencia(int valor,IAccount cuenta);
public int getAccountNumber();

}
