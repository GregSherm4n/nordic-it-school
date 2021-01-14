package com.project.parking.controller;

import com.project.parking.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkController {

    private Parking parking = new Parking();

    @GetMapping("/free")
    public String freeList() {
        String result = "";

        if (!parking.getFreePlaces().isEmpty()) {
            result = "Свободные парковочные места:\r\n";
            for (int i = 0; i < parking.getFreePlaces().size(); i++) {
                result += parking.getFreePlaces().get(i) + "\r\n";
            }
            result += "Занимай любое!!";
        } else
            result += "Приносим свои извинения, но мест нет";

        return result;
    }

    @GetMapping("/park")
    public String setReserved() {
        return parking.getFreePlaces().isEmpty() ? "Вы не можете нигде припарковаться" :
                ("Вы припарковались на месте под номером: " + parking.setPlaceReserved());
    }

    @GetMapping("/unpark/{id}")
    public String setFree(@PathVariable(name = "id") Integer place) {
        return parking.setPlaceFree(place) ? "Парковочное место №" + place + " только что освобдилось" :
                "Такого места на парковке нет";
    }


}
