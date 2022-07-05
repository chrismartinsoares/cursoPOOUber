from account import Account
from car import Car

if __name__ == '__main__':
    '''
    print('HOOLA')
    car = Car()
    car.license = "AMS325";
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "QWE489"
    car2.driver = "Marta"
    print(vars(car2))
    '''

    car = Car("AMS234", Account("Andres Herrera", "ANDA986"))
    print(vars(car))
    print(vars(car.driver))
