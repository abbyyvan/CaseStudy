// package org.petgo.jing_yuan.service.serverImplement;

// import java.util.Arrays;

// import org.petgo.jing_yuan.dto.AdminDto;
// import org.petgo.jing_yuan.model.Admin;
// import org.petgo.jing_yuan.repository.AdminRepository;
// import org.petgo.jing_yuan.repository.RoleRepository;
// import org.petgo.jing_yuan.service.AdminService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.stereotype.Service;

// @Service
// public class AdminServiceImpl implements AdminService {
// private BCryptPasswordEncoder passwordEncoder;

// @Autowired
// private AdminRepository adminRepository;

// @Autowired
// private RoleRepository roleRepository;

// @Override
// public Admin findByUsername(String username) {
// return adminRepository.findByUsername(username);
// }

// @Override
// public Admin save(AdminDto adminDto) {
// Admin admin = new Admin();
// admin.setFirstName(adminDto.getFirstName());
// admin.setLastName(adminDto.getLastName());
// admin.setUsername(adminDto.getUsername());
// //encode pwd for security consider
// admin.setPassword(passwordEncoder.encode(adminDto.getPassword()));

// // error: cannot find findByName, need to add findByName in
// RoleRepository.java
// admin.setRoles(Arrays.asList(roleRepository.findByName("ADMIN")));
// return admin;
// }

// }
