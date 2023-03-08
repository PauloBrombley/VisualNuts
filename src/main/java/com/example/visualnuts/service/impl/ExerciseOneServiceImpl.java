package com.example.visualnuts.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.visualnuts.service.ExerciseOneService;

@Service
public class ExerciseOneServiceImpl implements ExerciseOneService{

	@Override
	public List<String> processNumbers(int limit) {
		List<String> numbers = new ArrayList<>();
		for (int i = 1; i <= limit; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				numbers.add("Visual Nuts");
			} else if (i % 3 == 0) {
				numbers.add("Visual");
			} else if (i % 5 == 0) {
				numbers.add("Nuts");
			} else {
				numbers.add(String.valueOf(i));
			}
		}
		return numbers;
	}

}
