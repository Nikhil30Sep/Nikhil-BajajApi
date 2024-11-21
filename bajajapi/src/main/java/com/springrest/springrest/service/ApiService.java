package com.springrest.springrest.service;

import java.io.ByteArrayInputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.model.FileDetails;
import com.springrest.springrest.model.PostRequest;
import com.springrest.springrest.model.PostResponse;

@Service
public class ApiService {

	public PostResponse processRequest(PostRequest request) {
        PostResponse response = new PostResponse();

        // 1. Extract User Details
        response.setUserId("john_doe_17091999"); // Replace with actual logic
        response.setEmail("john@xyz.com");
        response.setRollNumber("ABCD123");

        // 2. Split Data into Numbers and Alphabets
        List<String> numbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        for (String item : request.getData()) {
            if (item.matches("\\d+")) {
                numbers.add(item);
            } else if (item.matches("[a-zA-Z]")) {
                alphabets.add(item);
            }
        }
        response.setNumbers(numbers);
        response.setAlphabets(alphabets);

        // 3. Find the Highest Lowercase Alphabet
        String highest = alphabets.stream()
                .filter(s -> s.matches("[a-z]"))
                .max(String::compareTo)
                .orElse(null);
        response.setHighestLowercaseAlphabet(highest);

        // 4. Check for Prime Numbers
        boolean isPrimeFound = numbers.stream()
                .map(Integer::valueOf)
                .anyMatch(this::isPrime);
        response.setPrimeFound(isPrimeFound);

        // 5. File Handling
        FileDetails fileDetails = handleFile(request.getFileB64());
        response.setFileDetails(fileDetails);

        response.setSuccess(true);
        return response;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private FileDetails handleFile(String fileB64) {
        FileDetails fileDetails = new FileDetails();
        if (fileB64 == null || fileB64.isEmpty()) {
            fileDetails.setFileValid(false);
            return fileDetails;
        }

        try {
            byte[] decodedBytes = Base64.getDecoder().decode(fileB64);
            String mimeType = URLConnection.guessContentTypeFromStream(new ByteArrayInputStream(decodedBytes));
            fileDetails.setFileValid(true);
            fileDetails.setFileMimeType(mimeType);
            fileDetails.setFileSizeKb(decodedBytes.length / 1024.0);
        } catch (Exception e) {
            fileDetails.setFileValid(false);
        }

        return fileDetails;
    }
}
