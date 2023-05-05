package com.management.model;
import lombok.*;
import javax.persistence.*;
@Entity
@Table(name = "blood")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data

public class Blood
{

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;

	  @Column(name = "name")
	  private String Name;

	  @Column(name = "bloodgroup")
	  private String BloodGroup;
}


