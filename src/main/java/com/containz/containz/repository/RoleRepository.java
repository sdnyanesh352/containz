package com.containz.containz.repository;

import org.springframework.data.repository.CrudRepository;

import com.containz.containz.model.Role;
import com.containz.containz.model.UserRoles;

/**
 * 
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByRole(UserRoles role);

}
