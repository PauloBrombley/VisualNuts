package com.example.visualnuts.service;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExerciseOneServiceTest {
	
	@Autowired
	ExerciseOneService exerciseOneService;
	
	List<String> numbers = Arrays.asList("1", "2", "Visual", "4", "Nuts", "Visual", "7", "8", "Visual", "Nuts",
			"11", "Visual", "13", "14", "Visual Nuts");
	
	@Test
    public void shouldReturnProcessListLimitedBy15() {
		List<String> processNumber = exerciseOneService.processNumbers(15);
		
		assertEquals(15, processNumber.size());
		
		
	}

}
