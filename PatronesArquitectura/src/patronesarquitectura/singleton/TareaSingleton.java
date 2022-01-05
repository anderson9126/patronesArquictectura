/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.singleton;

public class TareaSingleton {

    private static TareaSingleton instancia = null;

    private TareaSingleton() {
    }

    public static TareaSingleton getInstance() {
        if (instancia == null) {
            instancia = new TareaSingleton();
        }

        return instancia;
    }

public void pruebas(String param){
    System.out.println("he resivido el texto "+param+"  . OK");
}

}
