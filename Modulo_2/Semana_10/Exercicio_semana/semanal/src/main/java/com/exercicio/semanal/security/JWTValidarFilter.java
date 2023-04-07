package com.exercicio.semanal.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

public class JWTValidarFilter extends BasicAuthenticationFilter {
    public JWTValidarFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }
}
