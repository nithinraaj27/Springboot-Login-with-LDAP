package com.xadmin.ldap.springsecurityldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ldap")
public class ApplicationController {

    @GetMapping("/security")
    public String securityMethod()
    {
        return "Security rest endpoints with ldap";
    }
}
