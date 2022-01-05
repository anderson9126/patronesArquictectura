/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.template;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public abstract class PastaDish {

    public final void makeRecipe() {

        boilWater();
        addPasta();
        cookPasta();
        drainAndPlate();
        addSauce();
        addProtein();
        addGarbish();
    }

protected abstract  void addPasta();
protected abstract  void addSauce();
protected abstract  void addProtein();
protected abstract  void addGarnish();

    private void boilWater() {
        System.out.println("boil Water ");
    }

    private void cookPasta() {
        System.out.println(" cook Pasta");
    }

    private void drainAndPlate() {
        System.out.println(" drain And Plate");
    }


    private void addGarbish() {
        System.out.println(" add Garbish");
    }

}
