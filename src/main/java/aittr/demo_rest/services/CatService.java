package aittr.demo_rest.services;

import aittr.demo_rest.domain.Cat;
import aittr.demo_rest.repositories.CatRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CatService implements  AppService<Cat>{
  private CatRepository repository;
  public CatService(CatRepository repository) {
    this.repository = repository;
  }

  @Override
  public Cat save(Cat obj) {
    return null;
  }

  @Override
  public Cat getById(int id) {
    return null;
  }

  @Override
  public List<Cat> getAll() {
    return new ArrayList<>(repository.getAll());
  }

  @Override
  public void deleteById(int id) {

  }
}
