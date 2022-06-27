// package org.petgo.jing_yuan.config;

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;

// import org.petgo.jing_yuan.model.Admin;
// import org.petgo.jing_yuan.model.Role;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.*;
// import org.springframework.security.core.userdetails.UserDetails;

// //customize adminDetails implements UserDetails interface
// public class AdminDetails implements UserDetails {
//     private Admin admin;

//     @Override
//     public Collection<? extends GrantedAuthority> getAuthorities() {
//         List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//         for (Role role : admin.getRoles()) {
//             authorities.add(new SimpleGrantedAuthority(role.getName()));
//         }
//         return authorities;
//     }

//     @Override
//     public String getPassword() {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public String getUsername() {
//         // TODO Auto-generated method stub
//         // return null;
//     }

//     @Override
//     public boolean isAccountNonExpired() {
//         // TODO Auto-generated method stub
//         return false;
//     }

//     @Override
//     public boolean isAccountNonLocked() {
//         // TODO Auto-generated method stub
//         return false;
//     }

//     @Override
//     public boolean isCredentialsNonExpired() {
//         // TODO Auto-generated method stub
//         return false;
//     }

//     @Override
//     public boolean isEnabled() {
//         // TODO Auto-generated method stub
//         return false;
//     }

// }
