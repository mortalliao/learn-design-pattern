package win.mortalliao.java.creational_pattern.abstract_factory.factory;

import win.mortalliao.java.creational_pattern.abstract_factory.product.ICat;
import win.mortalliao.java.creational_pattern.abstract_factory.product.IDog;
import win.mortalliao.java.creational_pattern.abstract_factory.product.WhiteCat;
import win.mortalliao.java.creational_pattern.abstract_factory.product.WhiteDog;

/**
 * @author mortal
 */
public class WhiteAnimalFactory implements IAnimalFactory {
    @Override
    public ICat createCat() {
        return new WhiteCat();
    }

    @Override
    public IDog createDog() {
        return new WhiteDog();
    }
}