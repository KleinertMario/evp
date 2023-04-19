package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Component
public class Controller {

    Jdbc jdbc = new Jdbc();
    List signale = new ArrayList<Signal>;
     @PostMapping
    public void insertIntoDatabase(boolean signal){
         jdbc.insertIntoDatabase(signal);
     }
     @GetMapping
    public List getSignale(){
          signale = jdbc.getFromDatabase();
          jdbc.deleteStuff();
          return signale;
     }
}
