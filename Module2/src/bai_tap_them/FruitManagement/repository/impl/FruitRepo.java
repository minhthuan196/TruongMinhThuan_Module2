package bai_tap_them.FruitManagement.repository.impl;

import bai_tap_them.FruitManagement.model.Fruit;
import bai_tap_them.FruitManagement.repository.IFruitRepo;

import java.util.ArrayList;
import java.util.List;

public class FruitRepo implements IFruitRepo {
    private final List<Fruit> fruits = new ArrayList<>();

    {
        fruits.add(new Fruit("xoai", 1, "21/9/2023", 6, "Vietnam", 12.4));
        fruits.add(new Fruit("oi", 2, "21/9/2023", 6, "Vietnam", 11.3));
        fruits.add(new Fruit("tao", 3, "21/9/2023", 6, "Vietnam", 12.1));
    }

    @Override
    public List<Fruit> showFruit() {
        return this.fruits;
    }

    @Override
    public void createFruit(Fruit fruit) {
        this.fruits.add(fruit);
    }

    @Override
    public void removeFruit(String nameFruit) {
        for (Fruit fruit : fruits) {
            if (fruit.getNameFruit().equalsIgnoreCase(nameFruit)) {
                fruits.remove(fruit);
                break;
            }
        }
    }

    @Override
    public Fruit findFruit(String nameFruit) {
        for (Fruit fruit : fruits) {
            if (fruit.getNameFruit().equalsIgnoreCase(nameFruit)) {
                return fruit;
            }
        }
        return null;
    }

    @Override
    public void updateFruit(Fruit fruit) {
        for (Fruit fruit1 : fruits) {
            if (fruit1.getNameFruit().equalsIgnoreCase(fruit.getNameFruit())) {
                fruit1.setTypeFruit(fruit.getTypeFruit());
                fruit1.setExpiry(fruit.getExpiry());
                fruit1.setOrigin(fruit.getOrigin());
                fruit1.setPrice(fruit.getPrice());
                fruit1.setDateOfManufacture(fruit.getDateOfManufacture());
            }
        }
    }

    @Override
    public void arrangeFruit() {
        fruits.sort((o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()) {
                return 1;
            } else if (o1.getPrice() == o2.getPrice()) {
                return 0;
            } else {
                return -1;
            }
        });
    }
}
