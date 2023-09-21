package bai_tap_them.FruitManagement.controller;

import bai_tap_them.FruitManagement.model.Fruit;
import bai_tap_them.FruitManagement.service.IFruitService;
import bai_tap_them.FruitManagement.service.impl.FruitService;

import java.util.List;

public class FruitController {
    private final IFruitService fruitService = new FruitService();

    public List<Fruit> showFruit() {
        return fruitService.showFruit();
    }


    public void creatFruit(Fruit fruit) {
        fruitService.createFruit(fruit);
    }


    public void removeFruit(String nameFruit) {
        fruitService.removeFruit(nameFruit);
    }


    public Fruit findFruit(String nameFruit) {
        return fruitService.findFruit(nameFruit);
    }


    public void updateFruit(Fruit fruit) {
        fruitService.updateFruit(fruit);
    }

    public void arrangeFruit() {
        fruitService.arrangeFruit();
    }
}
