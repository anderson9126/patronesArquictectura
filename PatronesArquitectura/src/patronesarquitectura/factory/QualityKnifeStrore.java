/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package patronesarquitectura.factory;

import patronesarquitectura.factory.quKnife.QualityBreadKnife;
import patronesarquitectura.factory.quKnife.QualityChefKnife;
import patronesarquitectura.factory.quKnife.QualityParingKnife;
import patronesarquitectura.factory.quKnife.QualitySteaKnife;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class QualityKnifeStrore extends KnifeStore{
  @Override
    public Knife createKnife(String knifeType) {

        if (knifeType.equals("paring")) {
System.err.println("yo soy un cuchillo tipo QualityParingKnife");
            return new QualityParingKnife();

        } else if (knifeType.equals("steak")) {
System.err.println("yo soy un cuchillo tipo QualitySteaKnife");
            return new QualitySteaKnife();

        } else if (knifeType.equals("bread")) {
System.err.println("yo soy un cuchillo tipo QualityBreadKnife");
            return new QualityBreadKnife();

        } else if (knifeType.equals("chef")) {
System.err.println("yo soy un cuchillo tipo QualityChefKnife");
            return new QualityChefKnife();

        } else {
            return null;
        }

    }
}
