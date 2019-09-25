package se.ecutbildning.halasimakhalifa.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NameService {

    private static List<String> male = new ArrayList<>();
    private static List<String> female = new ArrayList<>();
    private static List<String> lastname = new ArrayList<>();
    SlumpGenerator generator = new SlumpGenerator();
    public List<String> maleName(){
               try (BufferedReader reader = Files.newBufferedReader(Paths.get("PojkNamn.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                male.add(line);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }return male;
    }

    public List<String> femaleName(){

        try(BufferedReader reader = Files.newBufferedReader(Paths.get("FlickNamn.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                female.add(line);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }return female;
    }

    public List<String> lastName(){

        try(BufferedReader reader = Files.newBufferedReader(Paths.get("EfterNamn.txt"))){
            String line ;
            while ((line = reader.readLine()) != null){
                lastname.add(line);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }return lastname;
    }

    public String slumpFlickNamn(){
        int i = generator.getNumber(19391);
        String name = femaleName().get(i);
        return name;
    }

    public String slumpPojkNamn(){
        int i = generator.getNumber(19499);
        String name = maleName().get(i);
        return name;
    }

    public String slumpEfterNamn(){
        int i = generator.getNumber(100);
        String name = lastName().get(i);
        return name;
    }

    public List<String> FlerSlumpFlickNamn(){
        List<String> names = new ArrayList<>();
        for (int i= 0; i< 10; i++){
            names.add(slumpFlickNamn());
        }
        return names;
    }

    public List<String> FlerSlumpPojkNamn(){
        List<String> names = new ArrayList<>();
        for (int i= 0; i< 10; i++){
            names.add(slumpPojkNamn());
        }
        return names;
    }

    public List<String> FlerSlumpEfterNamn(){
        List<String> names = new ArrayList<>();
        for (int i= 0; i< 10; i++){
            names.add(slumpEfterNamn());
        }
        return names;
    }


}
