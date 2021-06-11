package com.example.demo;

import java.util.List;

public class TruckService {

    TruckRepo truckRepo = new TruckRepo();

    public String addTruck(int position){
        return truckRepo.addTruck(position);
    }

    public List<Truck> getTruckList() {
        return truckRepo.getTruckList();
    }

    public String changeSpeed(int id, int speed){
        truckRepo.getTruckById(id).setSpeed(speed);
        return "Geschwindigkeit auf "
                + truckRepo.getTruckById(id).getSpeed()
                + " geändert ! Mit Eingaebe: "
                + speed;
    }
    public Truck getTruckById(int id){
        return truckRepo.getTruckById(id);
    }
}
