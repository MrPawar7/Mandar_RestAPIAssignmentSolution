package com.greatlearning.employeeManager.EmployeeManager.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import java.util.List;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class User {

   public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


@Id
   @Column(name = "user_id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name="username")
   private String username;
   @Column(name="password")
   private String password;
   
/*   @ManyToMany(mappedBy = "users",cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
   private Set<Role> roles;

   public void addRole(Role role){
       if(this.roles == null){
           this.roles = new HashSet<>();
       }
       //set the bidirectional mapping
       this.roles.add(role);
       role.getUsers().add(this);
   }
   */
   
/*   public User(String username,String password,Set<Role> roles) {
	   super();
	   this.username=username;
	   this.password=password;
	   this.roles=roles;
   }
*/

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(
        name = "users_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id")
        )
private List<Role> roles = new ArrayList<>();


}
