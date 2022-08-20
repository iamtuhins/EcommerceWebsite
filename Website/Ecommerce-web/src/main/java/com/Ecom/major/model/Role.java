package com.Ecom.major.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
@Table(name= "roles")
public class Role {
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(nullable=false, unique =true)
	@NotEmpty
	private String name;
	@ManyToMany(mappedBy = "roles")
	private List<User>user;
	

}
