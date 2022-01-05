/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.decorator;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AuthenticateWebPageDecorator extends WebPageDecorator {

    public AuthenticateWebPageDecorator(IWebPage page) {
        super(page);
    }

    public void authenticate() {
        System.out.println("authenticate Page");
    }

    public void display() {
        super.display();
        this.authenticate();
    }

}
