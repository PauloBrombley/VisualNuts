package com.example.visualnuts.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.visualnuts.service.ExerciseOneService;

@Controller
@RestController
public class ExerciseOneController {
	
	private ExerciseOneService exerciseOneService;
	
	public ExerciseOneController(ExerciseOneService exerciseOneService) {		
		this.exerciseOneService = exerciseOneService;
	}

	@GetMapping("/exerciseone")
	@ResponseStatus(HttpStatus.OK)
	public List<String> printNumbers(@RequestParam(defaultValue = "100") int limit) {
		//TODO: verificar se limit precisa verificação de NOT_ACCEPTABLE
		List<String> numbers = exerciseOneService.processNumbers(limit);
		if(numbers == null || numbers.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}
		return numbers;
	}
}
