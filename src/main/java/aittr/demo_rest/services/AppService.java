package aittr.demo_rest.services;

import java.util.List;

public interface AppService<T> {
  T save (T obj);
  T getById(int id);
  List<T> getAll();
  void deleteById(int id);

}
