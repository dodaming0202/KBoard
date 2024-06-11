package com.lec.spring.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.AccessDeniedException;

import java.io.IOException;

public class CustomAccessDeninedHandler implements org.springframework.security.web.access.AccessDeniedHandler {

   // 권한이 없는 접근을 할 때 호출
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        System.out.println("### 접근권한 오류 : CustomAccessDeniedHandler :  " + request.getRequestURI() + " ###");

        response.sendRedirect("/user/rejectAuth");

    }
}
