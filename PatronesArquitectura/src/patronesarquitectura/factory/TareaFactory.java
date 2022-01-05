/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesarquitectura.factory;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TareaFactory {

    KnifeStore budget = new BudgetKnifeStrore();
    KnifeStore family = new FamilyKnifeStrore();
    KnifeStore quality = new QualityKnifeStrore();

    Knife k1 = budget.createKnife("chef");


}
