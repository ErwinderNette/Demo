package com.example.demo;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    Truck truck = new Truck(1,2,3,80,true);
    TruckService truckService = new TruckService();

    @RequestMapping(path="/test")
    public @ResponseBody Truck test(){
        return truckService.getTruckById(2);
    }

    @RequestMapping(path="/addTruck/{position}")
    public String addTruck(@PathVariable int position){
        truckService.addTruck(position);
        return "Hat geklappt";
    }

    @RequestMapping(path="/getPlatoon")
    public List<Truck> getPlatoon(){
        return truckService.getTruckList();
    }

    @RequestMapping(path = "/changeSpeed/{id}/{speed}")
    public String changeSpeed(@PathVariable int id, @PathVariable int speed){
        return truckService.changeSpeed(id, speed);
    }


}
