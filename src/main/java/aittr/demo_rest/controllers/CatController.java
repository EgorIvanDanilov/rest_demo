package aittr.demo_rest.controllers;

import aittr.demo_rest.domain.Cat;
import aittr.demo_rest.services.CatService;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/cats")
public class CatController {
  private CatService service;

  public CatController(CatService service) {
    this.service = service;
  }
  public List<Cat> getAll(){
    return service.getAll();
  }
}
