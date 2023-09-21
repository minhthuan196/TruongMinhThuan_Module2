package bai_tap_them.FruitManagement.service.impl;

import bai_tap_them.FruitManagement.model.Fruit;
import bai_tap_them.FruitManagement.repository.IFruitRepo;
import bai_tap_them.FruitManagement.repository.impl.FruitRepo;
import bai_tap_them.FruitManagement.service.IFruitService;

import java.util.List;

public class FruitService implements IFruitService {
    private final IFruitRepo fruitRepo = new FruitRepo();

    @Override
    public List<Fruit> showFruit() {
        return fruitRepo.showFruit();
    }

    @Override
    public void createFruit(Fruit fruit) {
        fruitRepo.createFruit(fruit);
    }

    @Override
    public void removeFruit(String nameFruit) {
        fruitRepo.removeFruit(nameFruit);
    }

    @Override
    public Fruit findFruit(String nameFruit) {
        return fruitRepo.findFruit(nameFruit);
    }

    @Override
    public void updateFruit(Fruit fruit) {
        fruitRepo.updateFruit(fruit);
    }

    @Override
    public void arrangeFruit() {
        fruitRepo.arrangeFruit();
    }
}
