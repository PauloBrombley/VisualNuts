package com.example.visualnuts.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ExerciseTwoServiceTest {

    @Autowired
    private ExerciseTwoService exerciseTwoService;

    @Test
    public void shouldGetNumberOfCountries() throws Exception {
        assertEquals(5, exerciseTwoService.getCountriesCount());
    }
    
    @Test
    public void shouldntGetNumberOfCountries() throws Exception {
        assertNotEquals(6, exerciseTwoService.getCountriesCount());
    }

    @Test
    public void shouldFindCountryWithMostLanguages() throws Exception {
        assertEquals("BE", exerciseTwoService.getCountryWithMostLanguages());
    }
    
    @Test
    public void shouldntFindCountryWithMostLanguages() throws Exception {
        assertNotEquals("US", exerciseTwoService.getCountryWithMostLanguages());
    }

    @Test
    public void shouldCountAllLanguages() throws Exception {
        assertEquals(5, exerciseTwoService.getCountriesCount());
    }
    
    @Test
    public void shouldntCountAllLanguages() throws Exception {
        assertNotEquals(8, exerciseTwoService.getCountriesCount());
    }

    @Test
    public void shouldFindCountryWithMostLanguagesOverall() throws Exception {
        assertEquals("BE", exerciseTwoService.getCountryWithMostLanguages());
    }
    
    @Test
    public void shouldntFindCountryWithMostLanguagesOverall() throws Exception {
        assertNotEquals("ES", exerciseTwoService.getCountryWithMostLanguages());
    }

    @Test
    public void shouldFindMostCommonLanguage() throws Exception {
    	List<String> mostCommonLenguages = new ArrayList<>();
    	mostCommonLenguages.add("nl");
    	mostCommonLenguages.add("de");
        assertEquals(mostCommonLenguages, exerciseTwoService.getMostCommonLanguages());
    }
    
    @Test
    public void shouldntFindMostCommonLanguage() throws Exception {
    	List<String> mostCommonLenguages = new ArrayList<>();
    	mostCommonLenguages.add("fr");
    	mostCommonLenguages.add("es");
        assertNotEquals(mostCommonLenguages, exerciseTwoService.getMostCommonLanguages());
    }
}

