package com.polito.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter( "/private/*" )
public class MyFilter implements Filter {

    private static final String ATTR_CLIENT   = "client";
    private static final String HOME_LOCATION = "/index.jsp";

    public void init( FilterConfig filterConfig ) throws ServletException {
    }

    public void doFilter( ServletRequest request, ServletResponse response, FilterChain chain ) throws IOException,
            ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        if ( httpRequest.getSession().getAttribute( ATTR_CLIENT ) == null ) {
            httpResponse.sendRedirect( httpRequest.getServletContext().getContextPath() + HOME_LOCATION );
        } else {
            chain.doFilter( request, response );
        }

    }

    public void destroy() {

    }

}
