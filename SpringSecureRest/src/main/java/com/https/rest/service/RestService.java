package com.https.rest.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class RestService {

	public Map<String, String> getSecureData() {
		Map<String, String> response = new HashMap<>();
		response.put("result", "Success");
		return response;
	}

}
