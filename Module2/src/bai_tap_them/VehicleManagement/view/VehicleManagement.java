package bai_tap_them.VehicleManagement.view;

import bai_tap_them.VehicleManagement.controller.CarController;
import bai_tap_them.VehicleManagement.controller.MotorbikeController;
import bai_tap_them.VehicleManagement.controller.TruckController;
import bai_tap_them.VehicleManagement.model.*;

import java.util.Scanner;

public class VehicleManagement {
    Scanner scanner = new Scanner(System.in);
    private final CarController carController = new CarController();
    private final MotorbikeController motorController = new MotorbikeController();
    private final TruckController truckController = new TruckController();

    public void showVehicle() {
        System.out.println("=============MENU=============");
        System.out.println("1: Create new vehicle");
        System.out.println("2: Show vehicle");
        System.out.println("3: Remove vehicle");
        System.out.println("4: Find vehicle");
        System.out.println("5: Exit");
    }

    public void showObjectVehicle() {
        System.out.println("1: Cars");
        System.out.println("2: Motors");
        System.out.println("3: Trucks");
    }

    public int choose() {
        int choiceOption;
        this.showVehicle();
        do {
            System.out.println("Please choose number MENU");
            choiceOption = Integer.parseInt(scanner.nextLine());
            if (choiceOption <= 0 || choiceOption > 5) {
                System.out.println("Not Menu.Enter again!!");
                this.showVehicle();
            } else {
                break;
            }
        } while (true);
        return choiceOption;
    }

    public int chooseObjectVehicle() {
        int choiceObject;
        this.showObjectVehicle();
        do {
            System.out.println("Please choose vehicle: ");
            choiceObject = Integer.parseInt(scanner.nextLine());
            if (choiceObject <= 0 || choiceObject > 3) {
                System.out.println("Not Menu.Enter again!!");
                this.showObjectVehicle();
            } else {
                break;
            }
        } while (true);
        return choiceObject;
    }

    public Manufacturer manufacturerMotobike() {
        Manufacturer sirius = new Manufacturer(1, "Sirius", "Viet Nam");
        Manufacturer wave = new Manufacturer(2, "wave110", "Lao");
        Manufacturer ab = new Manufacturer(3, "Airblack", "Campuchia");
        Manufacturer sh = new Manufacturer(4, "Sh", "Thai Lan");
        int choice;
        do {
            System.out.println("Enter manufacturer:");
            System.out.println("1.sirius");
            System.out.println("2.wave");
            System.out.println("3.ab");
            System.out.println("4.sh");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice <= 0 || choice > 4) {
                System.out.println("Not Menu.Enter again!!!");
            } else {
                break;
            }
        } while (true);
        if (choice == 1) {
            return sirius;
        } else if (choice == 2) {
            return wave;
        } else if (choice == 3) {
            return ab;
        } else {
            return sh;
        }
    }

    public Manufacturer manufacturerCar() {
        Manufacturer mazda = new Manufacturer(1, "Mazda", "Viet Nam");
        Manufacturer huyndai = new Manufacturer(2, "Hyundai", "Anh");
        Manufacturer honda = new Manufacturer(3, "Honda", "Duc");
        Manufacturer chevrolet = new Manufacturer(4, "Chevrolet", "My");
        int choice;
        do {
            System.out.println("Enter Manufacturer: ");
            System.out.println("1.Mazda");
            System.out.println("2.Hyundai");
            System.out.println("3.Honda");
            System.out.println("4.Chevrolet");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice <= 0 || choice > 4) {
                System.out.println("Not Menu.Enter again!!");
            } else {
                break;
            }
        } while (true);
        if (choice == 1) {
            return mazda;
        } else if (choice == 2) {
            return huyndai;
        } else if (choice == 3) {
            return honda;
        } else {
            return chevrolet;
        }
    }

    public Manufacturer manufacturerTrunk() {
        Manufacturer faw = new Manufacturer(1, "Faw", "Viet Nam");
        Manufacturer jac = new Manufacturer(2, "Jac", "Anh");
        Manufacturer dongfeng = new Manufacturer(3, "Dongfeng", "Duc");
        Manufacturer nissan = new Manufacturer(4, "Nissan", "My");
        int choice;
        do {
            System.out.println("Enter Manufacturer: ");
            System.out.println("1.Faw");
            System.out.println("2.Jac");
            System.out.println("3.Dongfeng");
            System.out.println("4.Nissan");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice <= 0 || choice > 4) {
                System.out.println("Not Menu.Enter again!!");
            } else {
                break;
            }
        } while (true);
        if (choice == 1) {
            return faw;
        } else if (choice == 2) {
            return jac;
        } else if (choice == 3) {
            return dongfeng;
        } else {
            return nissan;
        }
    }

    public Cars inputCar() {
        Cars cars = new Cars();
        System.out.println("Enter the car license plates: ");
        cars.setLicensePlates(scanner.nextLine());
        Manufacturer manufacturer = manufacturerCar();
        cars.setManufacturer(manufacturer);
        System.out.println("Enter the year of manufacture: ");
        cars.setYearOfManufacture(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter the owner name: ");
        cars.setOwner(scanner.nextLine());
        System.out.println("Enter the number of seats");
        cars.setNumberOfSeats(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter the car type: ");
        cars.setCarType(scanner.nextLine());
        return cars;
    }

    public Motorbikes inputMotorbike() {
        Motorbikes motorbikes = new Motorbikes();
        System.out.println("Enter the motor license plates: ");
        motorbikes.setLicensePlates(scanner.nextLine());
        Manufacturer manufacturer = manufacturerMotobike();
        motorbikes.setManufacturer(manufacturer);
        System.out.println("Enter the year of manufacture: ");
        motorbikes.setYearOfManufacture(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter the owner name: ");
        motorbikes.setOwner(scanner.nextLine());
        System.out.println("Enter the motorbike wattage: ");
        motorbikes.setWattage(Integer.parseInt(scanner.nextLine()));
        return motorbikes;
    }

    public Trucks inputTruck() {
        Trucks trucks = new Trucks();
        System.out.println("Enter the truck license plates: ");
        trucks.setLicensePlates(scanner.nextLine());
        Manufacturer manufacturer = manufacturerTrunk();
        trucks.setManufacturer(manufacturer);
        System.out.println("Enter the year of manufacture: ");
        trucks.setYearOfManufacture(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter the owner name: ");
        trucks.setOwner(scanner.nextLine());
        System.out.println("Enter the truck payload ");
        trucks.setPayload(Integer.parseInt(scanner.nextLine()));
        return trucks;
    }

    public String inputLicensePlates() {
        System.out.println("Please enter the license plates vehicle: ");
        return scanner.nextLine();
    }

    public void managementVehicle() {
        int option = this.choose();
        int chooseObjectVehicle;
        switch (option) {
            case 1:
                chooseObjectVehicle = this.chooseObjectVehicle();
                if (chooseObjectVehicle == 1) {
                    this.carController.createCar(inputCar());
                } else if (chooseObjectVehicle == 2) {
                    this.motorController.createMotorbike(inputMotorbike());
                } else {
                    this.truckController.createTruck(inputTruck());
                }
                break;
            case 2:
                chooseObjectVehicle = this.chooseObjectVehicle();
                if (chooseObjectVehicle == 1) {
                    System.out.println(this.carController.showCar());
                } else if (chooseObjectVehicle == 2) {
                    System.out.println(this.motorController.showMotorbike());
                } else {
                    System.out.println(this.truckController.showTruck());
                }
                break;
            case 3:
                chooseObjectVehicle = this.chooseObjectVehicle();
                if (chooseObjectVehicle == 1) {
                    this.carController.removeCar(inputLicensePlates());
                } else if (chooseObjectVehicle == 2) {
                    this.motorController.removeMotorbike(inputLicensePlates());
                } else {
                    this.truckController.removeTruck(inputLicensePlates());
                }
                break;
            case 4:
                String LicensePlates = inputLicensePlates();
                Vehicle car = this.carController.findCar(LicensePlates);
                Vehicle motorbike = this.motorController.findMotorbike(LicensePlates);
                Vehicle trunk = this.truckController.findTrunk(LicensePlates);
                if (car == null && motorbike == null && trunk == null) {
                    System.out.println("No vehicle was found!!!");
                } else {
                    if (car == null) {
                        System.out.println("No car was found!!!");
                    } else {
                        System.out.println(car);
                    }
                    if (motorbike == null) {
                        System.out.println("No motorbike was found!!!");
                    } else {
                        System.out.println(motorbike);
                    }
                    if (trunk == null) {
                        System.out.println("No trunk was found!!!");
                    } else {
                        System.out.println(trunk);
                    }
                }
                break;
            case 5:
                System.exit(5);
                break;
        }
        this.managementVehicle();
    }

}
