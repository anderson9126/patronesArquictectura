/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.decorator;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FooterWebPageDecoratator extends WebPageDecorator {

    public FooterWebPageDecoratator(IWebPage page) {
        super(page);
    }

    public void footer() {
        System.out.println("footer Page");
    }

    public void display() {
        super.display();
        this.footer();
    }
}
