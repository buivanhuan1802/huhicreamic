package com.individual.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "app_role", //
        uniqueConstraints = { //
                @UniqueConstraint(name = "APP_ROLE_UK", columnNames = "Role_Name") })
public class Role implements Serializable{
	     
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Id
	    @GeneratedValue
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
