package pl.sda.j133.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RequestMapping ("/demo")
@RestController
public class DemoController {
  //getHello to endpoint
  @GetMapping("/hello")
  public String getHello(){
    log.info("Log informacyjny ");
    return "Hello world!!!!";
  }
}

// Endpoint ma:
//Adres Bazowy
//Składowe:
// - localhost
// - 8080

//Docelowy adres bazowy: http://localhost:8080
