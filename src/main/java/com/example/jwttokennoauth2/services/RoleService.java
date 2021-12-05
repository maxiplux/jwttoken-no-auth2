package com.example.jwttokennoauth2.services;

import com.example.jwttokennoauth2.models.Role;

public interface RoleService {
    Role findByName(String name);
}
