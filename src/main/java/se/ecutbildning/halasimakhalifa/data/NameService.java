package se.ecutbildning.halasimakhalifa.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NameService {

    public List<String> maleName(){

        List<String> names = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("PojkNamn.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                names.add(line);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }return names;
    }

    public List<String> femaleName(){
        List<String> names = new ArrayList<>();
        try(BufferedReader reader = Files.newBufferedReader(Paths.get("FlickNamn.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                names.add(line);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }return names;
    }

    public List<String> lastName(){

        List<String> names = new ArrayList<>();
        try(BufferedReader reader = Files.newBufferedReader(Paths.get("EfterNamn.txt"))){
            String line ;
            while ((line = reader.readLine()) != null){
                names.add(line);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }return names;
    }


}
