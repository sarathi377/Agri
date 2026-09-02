package com.smartagri.controller; 
import com.smartagri.model.Models.*; 
import com.smartagri.service.AnalysisService; 
import org.springframework.web.bind.annotation.*; 
@RestController 
  @RequestMapping("/api/analysis") 
  @CrossOrigin 
  public class AnalysisController {
    private final AnalysisService s; 
      public AnalysisController(AnalysisService s){
                                     this.s=s;
                                   } 
       @PostMapping 
       public AnalysisResponse analyze(@RequestBody AnalysisRequest r){
                                     return s.analyze(r);
                                   }
                                  }
