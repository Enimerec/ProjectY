/*
 * Copyright 2001,2017 (c) Point Of Sale Solutions (POSS) of Sabre Inc. All
 * rights reserved.
 * 
 * This software and documentation is the confidential and proprietary
 * information of Sabre Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with Sabre Inc.
 */
package pl.sda.projectY.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetailsService;
import pl.sda.projectY.entity.User;
import pl.sda.projectY.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Tomasz Rutyna (SG0301553)
 * @since Mar 08, 2018
 */
@Service("customUserDetailsService")
@Transactional
public class CustomUserService implements UserDetailsService
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException
    {
        User user = userRepository.findUserByLogin(login);
        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(),
                        true, true, true, true,
                        getGrantedAuthorities(user.getId()));
    }

    private List<GrantedAuthority> getGrantedAuthorities(Integer id){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(userRepository.findRoleIdById(id)));
        return authorities;
    }

    /*public void addNewUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }*/
}
