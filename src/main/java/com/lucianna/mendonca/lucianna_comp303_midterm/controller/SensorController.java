package com.lucianna.mendonca.lucianna_comp303_midterm.controller;

import com.lucianna.mendonca.lucianna_comp303_midterm.model.Sensor;
import com.lucianna.mendonca.lucianna_comp303_midterm.repository.SensorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class SensorController {

    private SensorRepository sensorRepository;

    public SensorController(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    @GetMapping("/")
    public String showMainPage(){
        return "index";
    }

    @GetMapping("/sensorForm")
    public String goToForm(){
        return "index";
    }

    @PostMapping("/addSensor")
    public String addSensor(Sensor sensor, RedirectAttributes redirectAttributes){
        try{
            // save sensor
            sensorRepository.save(sensor);
            redirectAttributes.addFlashAttribute(sensor);
            return "showResult";
        }
        catch (Exception exception){
            System.out.println(exception);
            return "error";
        }
    }

    @GetMapping("/displaySensorList")
    public String displaySensorList(Model model){
        List<Sensor> sensorList = sensorRepository.findAll();

        int totalSensors = sensorList.size();

        model.addAttribute("sensorList", sensorList);
        model.addAttribute("totalSensors", totalSensors);

        return "showSensorList";
    }
}
