package com.example.oauth2Google.entity;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class Oauth2LoginSuccess extends SimpleUrlAuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
//		CustomOauth2User oauth2User = (CustomOauth2User) authentication.getPrincipal();
//		String email = oauth2User.getEmail();
		OidcUser oidcUser = (OidcUser) authentication.getPrincipal();
		System.out.println("Email: " + oidcUser.getEmail());
		RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
		redirectStrategy.sendRedirect(request, response, "https://www.google.com.vn"
//        +authentication.getName()
		);
		super.onAuthenticationSuccess(request, response, authentication);
	}

}
