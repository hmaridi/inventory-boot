package com.inventory.model;

import javax.persistence.*;

@Entity
public class SupplierContactPerson extends BaseEntity {
	@Id
	@GeneratedValue
	private Long id;
	@Enumerated(EnumType.STRING)
	private ContactType type;
	private String fullName;
	private String email;
	private String phone;
	private String comments;

	public SupplierContactPerson(Long id, ContactType type, String fullName, String email, String phone,
			String comments) {
		super();
		this.id = id;
		this.type = type;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.comments = comments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ContactType getType() {
		return type;
	}

	public void setType(ContactType type) {
		this.type = type;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "SupplierContactPerson [id=" + id + ", type=" + type + ", fullName=" + fullName + ", email=" + email
				+ ", phone=" + phone + ", comments=" + comments + "]";
	}

}
