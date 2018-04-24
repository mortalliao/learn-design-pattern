package win.mortalliao.java.creational_pattern.abstract_factory;

import win.mortalliao.java.creational_pattern.abstract_factory.factory.BlackAnimalFactory;
import win.mortalliao.java.creational_pattern.abstract_factory.factory.IAnimalFactory;
import win.mortalliao.java.creational_pattern.abstract_factory.factory.WhiteAnimalFactory;
import win.mortalliao.java.creational_pattern.abstract_factory.product.ICat;
import win.mortalliao.java.creational_pattern.abstract_factory.product.IDog;

/**
 * @author mortal
 */
public class ClientTest {

    public static void main(String[] args) {
        IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
        ICat blackCat = blackAnimalFactory.createCat();
        blackCat.eat();
        IDog blackDog = blackAnimalFactory.createDog();
        blackDog.eat();

        IAnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
        ICat whiteCat = whiteAnimalFactory.createCat();
        whiteCat.eat();
        IDog whiteDog = whiteAnimalFactory.createDog();
        whiteDog.eat();
    }
}
