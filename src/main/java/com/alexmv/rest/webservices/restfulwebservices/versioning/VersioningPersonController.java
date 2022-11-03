package com.alexmv.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	/******************* URI VERSIONING *******************/

	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Bob Charlie");
	}

	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}

	/******************* REQUEST PARAMETER VERSIONING *******************/
	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 getFirstRequestParameterVersioning() {
		return new PersonV1("Bob Charlie");
	}

	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getSecondRequestParameterVersioning() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}

	/******************* REQUEST HEADER VERSIONING *******************/
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
	public PersonV1 getFirstRequestHeaderVersioning() {
		return new PersonV1("Bob Charlie");
	}

	@GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
	public PersonV2 getSecondRequestHeaderVersioning() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}

	/******************* MEDIA TYPE VERSIONING *******************/
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
	public PersonV1 getFirstVersionOfPersonAcceptHeader() {
		return new PersonV1("Bob Charlie");
	}

	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
	public PersonV2 getSecondVersionOfPersonAcceptHeader() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}

}
