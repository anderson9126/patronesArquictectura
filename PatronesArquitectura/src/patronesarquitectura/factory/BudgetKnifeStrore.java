package patronesarquitectura.factory;

import patronesarquitectura.factory.buKnife.BudgetBreadKnife;
import patronesarquitectura.factory.buKnife.BudgetChefKnife;
import patronesarquitectura.factory.buKnife.BudgetParingKnife;
import patronesarquitectura.factory.buKnife.BudgetSteaKnife;

public class BudgetKnifeStrore extends KnifeStore {

    @Override
    public Knife createKnife(String knifeType) {
        if (knifeType.equals("paring")) {
            System.err.println("yo soy un cuchillo tipo BudgetParingKnife");
            return new BudgetParingKnife();

        } else if (knifeType.equals("steak")) {
            System.out.println("yo soy un cuchillo tipo BudgetSteaKnife");
            return new BudgetSteaKnife();

        } else if (knifeType.equals("bread")) {
            System.out.println("yo soy un cuchillo tipo BudgetBreadKnife");
            return new BudgetBreadKnife();

        } else if (knifeType.equals("chef")) {
            System.out.println("yo soy un cuchillo tipo BudgetChefKnife");
            return new BudgetChefKnife();

        } else {
            return null;
        }

    }
}
