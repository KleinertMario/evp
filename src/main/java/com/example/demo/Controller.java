package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Component
public class Controller {

    @Autowired
    Jdbc jdbc = new Jdbc();
     @PostMapping
    public void insertIntoDatabase(boolean signal){
         jdbc.insertIntoDatabase(signal);
     }
     @GetMapping
    public boolean getSignale(){
          return jdbc.getFromDatabase();
     }
}
