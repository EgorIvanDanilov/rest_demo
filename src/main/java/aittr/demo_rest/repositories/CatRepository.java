package aittr.demo_rest.repositories;

import aittr.demo_rest.domain.SimpleCat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public class CatRepository implements CrudRepository<SimpleCat> {

    private File file = new File("cat.txt");
    private String delimiter = ";";

    @Override
    public SimpleCat save(SimpleCat obj) {
        return null;
    }

    @Override
    public SimpleCat getById(int id) {
        return null;
    }

    @Override
    public List<SimpleCat> getAll() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            return reader.lines()
                .map(line -> line.split(delimiter))
                .map(array -> new SimpleCat(
                    Integer.parseInt(array[0]),
                    Integer.parseInt(array[1]),
                    array[2],
                    Double.parseDouble(array[3])
                ))
                .toList();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteById(int id) {

    }
}