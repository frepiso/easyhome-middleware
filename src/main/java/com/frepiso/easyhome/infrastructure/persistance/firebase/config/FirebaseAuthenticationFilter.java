package com.frepiso.easyhome.infrastructure.persistance.firebase.config;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseToken;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class FirebaseAuthenticationFilter  extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain
    ) throws ServletException, IOException {

        String token = extractToken(request);

        if (token != null) {
            try {
                FirebaseToken decodedToken = FirebaseAuth.getInstance().verifyIdToken(token);
                // Crear Authentication object y setear en SecurityContext
            } catch (FirebaseAuthException e) {
                throw new RuntimeException("Error en autenticación", e);
            }
        }

        filterChain.doFilter(request, response);
    }

    private String extractToken(HttpServletRequest request) {
        // TODO: Extraer de header Authorization: Bearer <token>
        return "";
    }

}
