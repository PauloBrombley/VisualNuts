package com.example.visualnuts.service;

import java.util.List;

public interface ExerciseTwoService {
	
	int getCountriesCount();
	
	String getCountryWithMostOfficialGermanLanguages();
	
	int getTotalLanguagesCount();
	
	String getCountryWithMostLanguages();
	
	List<String> getMostCommonLanguages();

}
