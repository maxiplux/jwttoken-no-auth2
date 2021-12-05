package com.example.jwttokennoauth2.services.impl;

import com.example.jwttokennoauth2.repositories.RoleRepository;
import com.example.jwttokennoauth2.models.Role;
import com.example.jwttokennoauth2.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findByName(String name) {
        Role role = roleRepository.findRoleByName(name);
        return role;
    }
}
