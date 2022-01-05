/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package patronesarquitectura.decorator;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class HeadWebPageDecoratator extends WebPageDecorator {

    public HeadWebPageDecoratator(IWebPage page) {
        super(page);
    }

 public void head() {
        System.out.println("head Page");
    }

    public void display() {
        super.display();
        this.head();
    }
}
