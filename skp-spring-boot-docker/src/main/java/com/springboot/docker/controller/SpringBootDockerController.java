/**
 * 
 */
package com.springboot.docker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sanjeev Jha
 *
 */
@RestController
public class SpringBootDockerController {

	@RequestMapping(value = "/quote", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getQuote() {

		StringBuffer quote = new StringBuffer();
		quote.append("Success is often achieved by those who don't know that failure is inevitable.");
		quote.append("\n Learning by Sanjeev Jha.");
		return new ResponseEntity<>(quote.toString(), HttpStatus.OK);
	}
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getTest() {

		StringBuffer test = new StringBuffer();
		test.append("Testing Springboot API.");
		test.append("\n Learning by Sanjeev Jha.");
		return new ResponseEntity<>(test.toString(), HttpStatus.OK);
	}
}
