package se.ecutbildning.halasimakhalifa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.ecutbildning.halasimakhalifa.data.NameService;

import java.util.ArrayList;
import java.util.List;

public class NamnServiceTest {
    NameService nameService;

    @Before
    public void setup(){
        nameService = new NameService();
    }
    @Test
    public void testMaleName(){

        List<String> names = new ArrayList<>();
        names = nameService.maleName();

        int expected = 19499;
        Assert.assertEquals(expected, names.size());
        //System.out.println(nameService.maleName());

    }

    @Test
    public void testFemaleName(){
        List<String> names = new ArrayList<>();
        names = nameService.femaleName();

        int expected = 19391;
        Assert.assertEquals(expected, names.size());

       // System.out.println(nameService.femaleName());

    }

    @Test
    public void testLastName(){
        List<String> names = new ArrayList<>();
        names = nameService.lastName();

        int expected = 100;
        Assert.assertEquals(expected, names.size());
    }
}
