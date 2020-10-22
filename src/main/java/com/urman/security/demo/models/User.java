package com.urman.security.demo.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_user", uniqueConstraints = {
		@UniqueConstraint(columnNames = "user_name", name = "user_name"),
		@UniqueConstraint(columnNames = "email", name = "email")})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	public User(@Size(max = 10) String userName,
			@NotBlank @Size(max = 20) @Email String email,
			@NotBlank @Size(max = 120) String password) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long id;

	@Column(name = "user_name")
	@Size(max = 20)
	private String userName;

	@NotBlank
	@Size(max = 100)
	@Email
	@Column(name = "email")
	private String email;

	public User(@Size(max = 20) String userName,
			@NotBlank @Size(max = 120) String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	@NotBlank
	@Size(max = 120)
	@Column(name = "password")
	private String password;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "t_user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();
}
