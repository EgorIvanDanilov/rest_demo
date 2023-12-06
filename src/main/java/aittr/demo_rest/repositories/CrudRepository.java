package aittr.demo_rest.repositories;

import java.util.List;

public interface CrudRepository<T> {
  T save(T obj);
  T getById(int id);
  List<T> getAll();
  void deleteById(int id);


}
