/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package patronesarquitectura.decorator;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class WebPageDecorator implements IWebPage{

protected  IWebPage  page ;

    public WebPageDecorator(IWebPage page) {
        this.page = page;
    }

 @Override
    public void display() {
        this.page.display();
    }
}
