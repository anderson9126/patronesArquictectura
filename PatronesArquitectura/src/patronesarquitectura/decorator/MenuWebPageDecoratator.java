/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package patronesarquitectura.decorator;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MenuWebPageDecoratator extends WebPageDecorator {

    public MenuWebPageDecoratator(IWebPage page) {
        super(page);
    }

 public void menu() {
        System.out.println("menu Page");
    }

    public void display() {
        super.display();
        this.menu();
    }

}
