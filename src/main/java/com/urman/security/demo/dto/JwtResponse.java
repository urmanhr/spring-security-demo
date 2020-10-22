package com.urman.security.demo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponse {

	private String token;
	private String type;
	private Long id;
	private String userName;
	private String email;
	private List<String> roles;
}
