package com.inventory.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Section extends BaseEntity {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private boolean active;
	private String externalID;
	private String responsible;
	private String code;
	private String email;

	public Section(Long id, String name, boolean active, String externalID, String responsible, String code,
			String email) {
		super();
		this.id = id;
		this.name = name;
		this.active = active;
		this.externalID = externalID;
		this.responsible = responsible;
		this.code = code;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getExternalID() {
		return externalID;
	}

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	public String getResponsible() {
		return responsible;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Section [id=" + id + ", name=" + name + ", active=" + active + ", externalID=" + externalID
				+ ", responsible=" + responsible + ", code=" + code + ", email=" + email + "]";
	}

}
