package ru.job4j.oop;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle air1 = new Airplane();
        Vehicle air2 = new Airplane();
        Vehicle air3 = new Airplane();
        Vehicle tr1 = new Train();
        Vehicle tr2 = new Train();
        Vehicle tr3 = new Train();
        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle bus3 = new Bus();

        Vehicle[] vehicles = new Vehicle[]{air1, air2, air3, tr1, tr2, tr3, bus1, bus2, bus3};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
