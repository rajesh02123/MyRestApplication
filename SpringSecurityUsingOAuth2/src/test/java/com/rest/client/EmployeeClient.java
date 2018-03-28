package com.rest.client;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.rest.model.Employee;

public class EmployeeClient {
	
	private static final String PLAIN_CREDENTIALS = "my-trusted-client:secret";
	
	public static HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	return headers;
	}
	
	public static HttpHeaders getHeadersWithClientCredentials() {
		String plain_credentials = EmployeeClient.PLAIN_CREDENTIALS;
		String base64_credentials = new String(Base64.encodeBase64(plain_credentials.getBytes()));
		HttpHeaders headers = getHeaders();
		headers.add("Authorization", "Basic " + base64_credentials);
		return headers;
	
	}
	
	
public static List<Employee> getAllEmployees(){
	RestTemplate client = new RestTemplate();
	
	return null;
}
	
}
