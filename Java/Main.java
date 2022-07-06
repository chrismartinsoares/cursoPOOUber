class Main{
    public static void main(String[] args) {
        System.out.println("HOOLA");
        //Car car = new Car("AMQ123", new Account("Andrés Herrera", "AND123"));
        //car.passaneger = 4;
        //car.printDataCar();

        UberX uberX = new UberX("AMQ123", new Account("Andrés Herrera", "AND123"), "Chevrolet", "Sonic");
        //uberX.passaneger = 4;
        uberX.setPassenger(2);
        uberX.getPassenger();
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH123", new Account("Andrés Herrera", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
        //System.out.println("car License: " + car.license);
        

        //Car car2 = new Car();
        //car2.license = "QWE569";
        //car2.driver = "Andrea Herrera";
        //car2.passaneger = 3;

        //System.out.println("car License: " +car.license);
    }
}