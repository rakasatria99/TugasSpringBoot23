package id.sinaukoding23.latihan.controller;

import id.sinaukoding23.latihan.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/brands")
public class BrandController {
    @Autowired
    private BrandService service;

    @GetMapping("/find-all")
    public ResponseEntity<?> getAllData(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
}