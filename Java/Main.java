class Main{
    public static void main(String[] args) {
        System.out.println("HOOLA");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andrés Herrera";
        car.passaneger = 4;

        //System.out.println("car License: " + car.license);
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "QWE569";
        car2.driver = "Andrea Herrera";
        car2.passaneger = 3;

        System.out.println("car License: " +car.license);
    }
}