/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package patronesarquitectura.decorator;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AuthorizedWebPageDecoratator extends WebPageDecorator {

    public AuthorizedWebPageDecoratator(IWebPage page) {
        super(page);
    }

  public void authorized() {
        System.out.println("authorized Page");
    }

    public void display() {
        super.display();
        this.authorized();
    }
}
