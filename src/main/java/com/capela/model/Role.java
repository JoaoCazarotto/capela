package com.capela.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "roles")
public class Role {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToMany(mappedBy = "roles")
	private Collection<Login> logins;
	@NotNull
	@Enumerated(EnumType.STRING)
	private RoleType roleType;
	
	public Role(RoleType roleType) {
		this.roleType = roleType;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Collection<Login> getLogins() {
		return logins;
	}
	public void setLogins(Collection<Login> logins) {
		this.logins = logins;
	}
	public RoleType getRoleType() {
		return roleType;
	}
	public void setRoleType(RoleType roleType) {
		this.roleType = roleType;
	}
	
	
}
