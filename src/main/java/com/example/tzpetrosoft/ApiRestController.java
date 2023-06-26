package com.example.tzpetrosoft;

import com.example.tzpetrosoft.service.TestXmlToJsonService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiRestController {
    private final TestXmlToJsonService service;

    public ApiRestController(TestXmlToJsonService service) {
        this.service = service;
    }

    @GetMapping(produces = "application/xml")
    public Person jacksonXml() {
        return new Person("Oleg", 25);
    }
//    @GetMapping("/converter")
//    public ResponseEntity<String> convert(@RequestBody String xml) {
//        String converter = service.converter(xml);
//        return new ResponseEntity<>(converter, HttpStatusCode.valueOf(200));
//    }
}
