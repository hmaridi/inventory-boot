package com.inventory.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductGroup extends BaseEntity {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private boolean active;
	private String code;

	public ProductGroup(Long id, String name, boolean active, String code) {
		super();
		this.id = id;
		this.name = name;
		this.active = active;
		this.code = code;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "ProductGroup [id=" + id + ", name=" + name + ", active=" + active + ", code=" + code + "]";
	}

}
