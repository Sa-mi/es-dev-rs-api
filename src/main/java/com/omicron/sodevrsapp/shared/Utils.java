package com.omicron.sodevrsapp.shared;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Utils {

	private final Random RANDOM = new Random();
	private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	public String generateUserId(int length) {
		return generateRandomString(length);
	}
	
	private String generateRandomString(int length) {
		StringBuilder generatedString = new StringBuilder();
		
		for(int i = 0;i<length; i++) {
			generatedString.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
		}
		return new String(generatedString);
	}
}
