package aittr.demo_rest.repositories;

import aittr.demo_rest.domain.SimpleCat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

@Repository
public class CatRepository implements CrudRepository<SimpleCat> {

    private File file = new File("cat.txt");
    private String delimiter = ";";
    private int currentId;
    public CatRepository(){
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
           List<String> lines = reader.lines().toList();
           String lastLine = lines.get(lines.size()-1);
           String[] linesArray = lastLine.split(delimiter);
           currentId = Integer.parseInt(linesArray[0]);
           System.out.println();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

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

    public static void main(String[] args) {
        List<SimpleCat> cats = new CatRepository().getAll();
        System.out.println(cats);
    }

    @Override
    public void deleteById(int id) {

    }
}