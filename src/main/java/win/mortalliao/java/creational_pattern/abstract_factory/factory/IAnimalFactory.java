package win.mortalliao.java.creational_pattern.abstract_factory.factory;

import win.mortalliao.java.creational_pattern.abstract_factory.product.ICat;
import win.mortalliao.java.creational_pattern.abstract_factory.product.IDog;

/**
 * @author mortal
 */
public interface IAnimalFactory {
    ICat createCat();

    IDog createDog();
}
