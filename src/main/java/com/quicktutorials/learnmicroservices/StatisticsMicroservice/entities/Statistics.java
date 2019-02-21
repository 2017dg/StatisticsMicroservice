package com.quicktutorials.learnmicroservices.StatisticsMicroservice.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="latest_statistics")
public class Statistics {
    @javax.persistence.Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
    @NotBlank @NotEmpty @NotNull
    private Integer Id;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Statistics() {
		super();
	}
	public Statistics(Integer id, String description, Date date, String email) {
		super();
		Id = id;
		this.description = description;
		this.date = date;
		this.email = email;
	}
	@Column(name="description")
	@NotBlank @NotEmpty @NotNull
	private String description;
	
	@Column(name="DATE")
	private Date date;
	
	@Column(name="EMAIL")
	@NotBlank @NotEmpty @NotNull
	private String email;
	
	@PrePersist
	private void getTimeOperation() {
		this.date = new Date();
	}
	
	
}
