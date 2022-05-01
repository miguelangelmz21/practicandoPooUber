class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        /*Car car = new Car();        
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "QWE567";
        car2.driver = "Andrea Herrera";
        car2.passegenger = 3;
        car2.printDataCar();*/

        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        //car.passegenger = 4;
        car.printDataCar();
        
        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
        //car2.passegenger = 3;
        car2.printDataCar();
        
        UberX uberx = new UberX("CVB123", new Account("Andres Wise", "AND456"), "Chevrolet","picanto");
        uberx.setPassenger(4);
        uberx.printDataCar();      
        
        UberBlack uberblack = new UberBlack("ZVB123", new Account("Andy Toy", "AND456"));
        uberblack.setPassenger(6);
        uberblack.printDataCar();        

        UberVan uberVan = new UberVan("FGH345", new Account("Andres Herrera", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}