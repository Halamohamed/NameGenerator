package se.ecutbildning.halasimakhalifa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.ecutbildning.halasimakhalifa.data.NameService;

import java.util.ArrayList;
import java.util.List;

public class NamnServiceTest {
    NameService nameService;
    List<String> female;
    List<String> male;
    List<String> lastname;

    @Before
    public void setup(){
        nameService = new NameService();

    }
    @Test
    public void testMaleName(){
        male = new ArrayList<>();
        male = nameService.maleName();

        int expected = 19499;
        Assert.assertEquals(expected, male.size());
        //System.out.println(nameService.maleName());

    }

    @Test
    public void testFemaleName(){

        female = new ArrayList<>();
        female = nameService.femaleName();

        int expected = 19391;
        Assert.assertEquals(expected, female.size());

       // System.out.println(nameService.femaleName());

    }

    @Test
    public void testLastName(){
        lastname = new ArrayList<>();
        lastname = nameService.lastName();
        int expected = 200;
        Assert.assertEquals(expected, nameService.lastName().size());
        System.out.println(nameService.lastName().size());
    }

    @Test
    public void testSlumpFlickNamn(){
        String expected = nameService.slumpFlickNamn();
        String actual = nameService.slumpFlickNamn();
        Assert.assertNotNull( actual);
        System.out.println("expected : " + expected + "\nactual : " + actual);
    }
    @Test
    public void testSulumpPojkNamn(){
        String expected = nameService.slumpPojkNamn();
        String actual = nameService.slumpPojkNamn();
       // Assert.assertEquals(expected, nameService.slumpPojkNamn());
        Assert.assertNotNull(actual);
        //System.out.println("expected : " + expected + "\nactual : " + actual);
    }

    @Test
    public void testSlumpEfterNamn(){
        String expected = nameService.slumpEfterNamn();
        String actual = nameService.slumpEfterNamn();
        Assert.assertNotNull(actual);
        System.out.println("expected : " + expected + "\nactual : " + actual);
    }

    @Test
    public void testFlerSlumpFlickNamn(){
        List<String> actual = new ArrayList<>();
        actual = nameService.FlerSlumpFlickNamn();
        Assert.assertNotNull(actual);
        System.out.println(actual);
    }

    @Test
    public void testFlerSlumpPojkNamn(){
        List<String> actual = new ArrayList<>();
        actual = nameService.FlerSlumpPojkNamn();
        Assert.assertNotNull(actual);
        System.out.println(actual);
    }

    @Test
    public void testFlerSlumpEfterNamn(){
        List<String> actual = new ArrayList<>();
        actual = nameService.FlerSlumpEfterNamn();
        Assert.assertNotNull(actual);
        System.out.println(actual);
    }
}
