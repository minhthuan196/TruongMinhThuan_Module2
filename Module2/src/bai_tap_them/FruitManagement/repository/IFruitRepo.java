package bai_tap_them.FruitManagement.repository;

import bai_tap_them.FruitManagement.model.Fruit;

import java.util.List;

public interface IFruitRepo {

    List<Fruit> showFruit();

    void createFruit(Fruit fruit);

    void removeFruit(String nameFruit);

    Fruit findFruit(String nameFruit);

    void updateFruit(Fruit fruit);

    void arrangeFruit();
}
