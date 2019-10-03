package com.cognizant.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mentortable")
public class ActorsEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "actor_id")
	private Integer actorId;

	

	@Column(name = "actor_email")
	private String actorEmail;
	@Column(name = "actor_password")
	private String actorPassword;
	@Column(name = "actor_type")
	private String actorType;
	@Column(name = "actor_status")
	private String actorStatus;

	
	public ActorsEntity() {
		super();
	}

	public ActorsEntity(String actorEmail, String actorPassword, String actorType, String actorStatus) {
		super();
		this.actorEmail = actorEmail;
		this.actorPassword = actorPassword;
		this.actorType = actorType;
		this.actorStatus = actorStatus;
	}

	

	public Integer getId() {
		return actorId;
	}

	public String getActorEmail() {
		return actorEmail;
	}

	public void setActorEmail(String actorEmail) {
		this.actorEmail = actorEmail;
	}

	public String getActorPassword() {
		return actorPassword;
	}

	public void setActorPassword(String actorPassword) {
		this.actorPassword = actorPassword;
	}

	public String getActorType() {
		return actorType;
	}

	public void setActorType(String actorType) {
		this.actorType = actorType;
	}

	public String getActorStatus() {
		return actorStatus;
	}

	public void setActorStatus(String actorStatus) {
		this.actorStatus = actorStatus;
	}

}
