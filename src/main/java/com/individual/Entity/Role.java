package com.individual.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "app_role")
public class Role {
	     
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "role_id", nullable = false)
	    private Long roleId;
	 
	    @Column(name = "role_name", length = 30, nullable = false)
	    private String roleName;
	 
	    public Long getRoleId() {
	        return roleId;
	    }
	 
	    public void setRoleId(Long roleId) {
	        this.roleId = roleId;
	    }
	 
	    public String getRoleName() {
	        return roleName;
	    }
	 
	    public void setRoleName(String roleName) {
	        this.roleName = roleName;
	    }
	     
}
