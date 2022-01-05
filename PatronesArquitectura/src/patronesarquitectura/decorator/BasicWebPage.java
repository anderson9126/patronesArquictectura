/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.decorator;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class BasicWebPage implements IWebPage {

private String script="s";
private String css="c";
private String htmls="h";

    public BasicWebPage() {
    }

   
    @Override
    public void display() {
        System.out.println("Pinta basic Page");
    }
}
