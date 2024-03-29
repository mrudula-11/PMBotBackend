package com.example.myjwt.models;

import java.sql.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "sublob")
public class SubLob {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 20)
	private String subLobName;

	private Boolean isActive;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lobId")
	Lob lob;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ownerId")
	User owner;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "createdBy")
	User createdBy;

	public SubLob() {

	}

	public SubLob(String subLobName) {
		this.subLobName = subLobName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubLobName() {
		return subLobName;
	}

	public void setSubLobName(String subLobName) {
		this.subLobName = subLobName;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Lob getLob() {
		return lob;
	}

	public void setLob(Lob lob) {
		this.lob = lob;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}



	


}