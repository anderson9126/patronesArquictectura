/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.factory;

import patronesarquitectura.factory.faKnife.FamilyBreadKnife;
import patronesarquitectura.factory.faKnife.FamilyChefKnife;
import patronesarquitectura.factory.faKnife.FamilyParingKnife;
import patronesarquitectura.factory.faKnife.FamilySteaKnife;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FamilyKnifeStrore extends KnifeStore {

    @Override
    public Knife createKnife(String knifeType) {
        if (knifeType.equals("paring")) {
            System.err.println("yo soy un cuchillo tipo FamilyParingKnife");
            return new FamilyParingKnife();

        } else if (knifeType.equals("steak")) {
            System.err.println("yo soy un cuchillo tipo FamilySteaKnife");
            return new FamilySteaKnife();

        } else if (knifeType.equals("bread")) {
            System.err.println("yo soy un cuchillo tipo FamilyBreadKnife");
            return new FamilyBreadKnife();

        } else if (knifeType.equals("chef")) {
            System.err.println("yo soy un cuchillo tipo FamilyChefKnife");
            return new FamilyChefKnife();

        } else {
            return null;
        }

    }

}
