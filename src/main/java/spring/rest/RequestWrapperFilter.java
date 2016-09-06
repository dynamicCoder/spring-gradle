// <editor-fold defaultstate="collapsed" desc="Copyright © 2016 Burning Glass International Inc.">
/*
 *******************************************************************************
 * Proprietary and Confidential
 *
 * All rights reserved. Burning
 * Glass Technologies DISCLAIMS ANY OTHER WARRANTIES, EXPRESS OR IMPLIED,
 * INCLUDING, BUT NOT LIMITED TO, ANY IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * *****************************************************************************
 */
// </editor-fold>
package spring.rest;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class RequestWrapperFilter extends OncePerRequestFilter {

    @Override
    public void doFilterInternal(HttpServletRequest request,
            HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        
        filterChain.doFilter(request, response);
        //response.setContentType("application/SERV");
        response.setHeader("RateLimit-s", "x");

    }
}
