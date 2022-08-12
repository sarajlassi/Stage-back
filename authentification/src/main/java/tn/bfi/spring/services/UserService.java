package tn.bfi.spring.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import tn.bfi.spring.dao.*;
import tn.bfi.spring.entities.*;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	
    @Autowired
    private RoleDao roleDao;


    @Autowired
    private PasswordEncoder passwordEncoder;

    public void initRoleAndUser() {

        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role");
        roleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("Guichetier");
        userRole.setRoleDescription("Default role for newly created record");
        roleDao.save(userRole);

        User adminUser = new User();
        adminUser.setEmail("admin@bfigroupe.com");
        adminUser.setPassword(getEncodedPassword("pass123"));
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);
        
        User guichUser = new User();
        guichUser.setEmail("guichetier@bfigroupe.com");
        guichUser.setPassword(getEncodedPassword("pass123"));
        Set<Role> guichRoles = new HashSet<>();
        guichRoles.add(userRole);
        guichUser.setRole(guichRoles);
        userDao.save(guichUser);

    }

   public String getEncodedPassword(String password) {
    	return passwordEncoder.encode(password);
    }
    public User registerNewUser(User user) {
        Role role = roleDao.findById("User").get();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRole(userRoles);
        user.setPassword(user.getPassword());

        return userDao.save(user);
    }
    
}
