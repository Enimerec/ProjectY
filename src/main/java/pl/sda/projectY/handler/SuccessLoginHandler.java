/*
 * Copyright 2001,2017 (c) Point Of Sale Solutions (POSS) of Sabre Inc. All
 * rights reserved.
 * 
 * This software and documentation is the confidential and proprietary
 * information of Sabre Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with Sabre Inc.
 */
package pl.sda.projectY.handler;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * @author Tomasz Rutyna (SG0301553)
 * @since Mar 08, 2018
 */
@Component
public class SuccessLoginHandler extends SimpleUrlAuthenticationSuccessHandler
{

    @Override
    protected void handle(HttpServletRequest request, HttpServletResponse response,
                    Authentication authentication) throws IOException, ServletException
    {
        //super.handle(request, response, authentication);

        new DefaultRedirectStrategy().sendRedirect(request, response, "/main");
    }
}
