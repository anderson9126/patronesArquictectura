/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.decorator;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AdWebPageDecoratator extends WebPageDecorator {

    public AdWebPageDecoratator(IWebPage page) {
        super(page);
    }

    public void ad() {
        System.out.println("ad Page");
    }

    public void display() {
        super.display();
        this.ad();
    }
}
