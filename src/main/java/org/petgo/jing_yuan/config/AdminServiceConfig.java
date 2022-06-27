// package org.petgo.jing_yuan.config;

// import java.util.stream.Collectors;

// import org.petgo.jing_yuan.model.Admin;

// import org.petgo.jing_yuan.repository.AdminRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;

// public class AdminServiceConfig implements UserDetailsService {

//     @Autowired
//     private AdminRepository adminRepository;

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         Admin admin = adminRepository.findByUsername(username);
//         // check if the user exist
//         if (admin == null) {
//             throw new UsernameNotFoundException("the username cannot be found.");
//         }

//         //import .../userdetails.User
//         return new User(
//                 admin.getUsername(),
//                 admin.getPassword(),
//                 admin.getRoles()
//                         .stream()
//                         .map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList()));
//     }

// }
