package com.pack.model;

import javax.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="Employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="empname")
	private String employeeName;
	
	@Column(name ="salary")
	private double Salary;
	

}
