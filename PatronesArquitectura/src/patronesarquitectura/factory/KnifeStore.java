
package patronesarquitectura.factory;


public abstract class KnifeStore {

    public Knife orderKnife(String knifeType) {
        Knife knife;

        knife = createKnife(knifeType);
        knife.sharpe();
        knife.polish();
        knife.ppackage();

        return knife;
    }

public abstract  Knife createKnife(String knifeType);

}
