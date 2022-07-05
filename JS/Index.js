var car = new Car("AW234", new Account("Andres Herrera", "AH1234"));
car.passenger = 4;
car.printDataCar();


var Uberx = new UberX("AW234", new Account("Andres Herrera", "AH1234"), "Chevrolet", "Spark");
Uberx.passenger = 4;
Uberx.printDataCar();
console.log(Uberx);