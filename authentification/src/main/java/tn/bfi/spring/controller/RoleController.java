package tn.bfi.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.bfi.spring.entities.Role;
import tn.bfi.spring.services.RoleService;

@RestController
public class RoleController {
	
    @Autowired
    private RoleService roleService;
	
    @PostMapping({"/createNewRole"})
    public Role createNewRole(@RequestBody Role role) {
        return roleService.createNewRole(role);
    }
	
}
