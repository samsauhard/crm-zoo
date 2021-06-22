package com.example.zoobla.controller;

import com.example.zoobla.entity.Client;
import com.example.zoobla.entity.OtherInfo;
import com.example.zoobla.service.CustomerService;
import com.example.zoobla.service.OtherInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class OtherInfoController {
    @Autowired
    private OtherInfoService service;

    @PostMapping("/addOtherInfo")
    public OtherInfo addOtherInfo(@RequestBody OtherInfo otherInfo){
        return service.saveOtherInfo(otherInfo);
    }

    @PostMapping("/addOtherInfos")
    public List<OtherInfo> addOtherInfos(@RequestBody List<OtherInfo> otherInfos){
        return service.saveOtherInfo(otherInfos);
    }
    @GetMapping("/otherInfos")
    public List<OtherInfo> findAllOtherInfo(){
        return service.getInfos();
    }
    @GetMapping("/otherInfo/{id}")
    public OtherInfo findOtherInfoById(@PathVariable int id){
        return service.getOtherInfoById(id);
    }
  /* @GetMapping("/product/{f_name}")
    public List<Client> findByF_name(@PathVariable String f_name){
        return service.getCustomerByF_name(f_name);
    }*/
    @PutMapping("/updateOtherInfo")
    public OtherInfo updateOtherInfo(@RequestBody OtherInfo otherInfo){
        return service.updateOtherInfo(otherInfo);
    }
    @DeleteMapping("/deleteOtherInfo/{id}")
    public String deleteOtherInfo(@PathVariable int id){
        return service.deleteOtherInfo(id);
    }

}
