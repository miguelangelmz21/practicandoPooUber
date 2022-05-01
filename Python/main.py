from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    
    # ANTES, sin herencia NI constructor
    #car = Car()
    #car.license = "AMS234"
    #car.driver = "Andres Herrera"
    #print(vars(car))

    #car2 = Car()
    #car2.license = "QWE567"
    #car2.driver = "Matha"
    #print(vars(car2))

    car3 = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car3))
    print(vars(car3.driver))