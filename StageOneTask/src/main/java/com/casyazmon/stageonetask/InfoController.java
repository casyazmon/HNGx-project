package com.casyazmon.stageonetask;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class InfoController {
    @Autowired
    private InfoService infoService;
    @GetMapping
    public ResponseEntity<InfoEntity> getInfo(@RequestParam String slack_name, @RequestParam String track){
        InfoEntity infoEntity =  infoService.getInfo(slack_name, track);
        return  ResponseEntity.ok(infoEntity);
    }
}
