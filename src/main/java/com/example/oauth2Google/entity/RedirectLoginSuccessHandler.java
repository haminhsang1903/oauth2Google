//package com.example.oauth2Google.entity;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.DefaultRedirectStrategy;
//import org.springframework.security.web.RedirectStrategy;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//
//public class RedirectLoginSuccessHandler implements AuthenticationSuccessHandler {
//
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, 
//            HttpServletResponse httpServletResponse, 
//            Authentication authentication) throws IOException, ServletException {
//
//        RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
//        redirectStrategy.sendRedirect(httpServletRequest, httpServletResponse, 
//            "https://www.google.com.vn"
////        +authentication.getName()
//        );
//    }
//
//}
