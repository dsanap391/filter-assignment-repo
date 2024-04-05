package com.ds.service;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

@Service
public class CustomAuthenticationFilter extends OncePerRequestFilter {

    private static final String AUTH_HEADER_NAME = "PinggyAuthHeader";
    private static final ThreadLocal<String> AUTH_HEADER_VALUE = new ThreadLocal<>();
	
    @Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws jakarta.servlet.ServletException, IOException {
		String authHeaderValue = request.getHeader(AUTH_HEADER_NAME);

        if (authHeaderValue != null && !authHeaderValue.isEmpty()) {
            AUTH_HEADER_VALUE.set(authHeaderValue);
            filterChain.doFilter(request, response);
        } else {
           response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
           response.setContentType("application/json");
           response.getWriter().write("{\"timestamp\":\"04-04-2024 01:49:59\",\"status\":401,\"error\":\"Unauthorized\",\"path\":\"/\"}");
            
        	// throw new UnauthorizedException("You are not authorized to access this resource.");
        }
	}

	public static String getAuthHeaderValue() {
        return AUTH_HEADER_VALUE.get();
    }
}
