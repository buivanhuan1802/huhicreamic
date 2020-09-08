package com.individual.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
 
@Entity
@Table(name = "app_user")
public class AppUser {
 
    @Id
    @GeneratedValue
    @Column(name = "user_id", nullable = false)
    private Long userId;
 
    @Column(name = "user_name", length = 36, nullable = false)
    private String userName;
 
    @Column(name = "encrypted_password", length = 128, nullable = false)
    private String encrytedPassword;
 
    @Column(name = "enabled", length = 1, nullable = false)
    private boolean enabled;
 
    public Long getUserId() {
        return this.userId;
    }
 
    public void setUserId(Long userId) {
        this.userId = userId;
    }
 
    public String getUserName() {
        return this.userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getEncrytedPassword() {
        return this.encrytedPassword;
    }
 
    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }
 
    public boolean isEnabled() {
        return enabled;
    }
 
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
 
}