package com.xuefei.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//如果添加了@Component或@Configuration，又添加了@WebFilter（），
//那么会初始化两次Filter，并且会过滤所有路径+自己指定的路径 ，便会出现对没有指定的URL也会进行过滤

@WebFilter(urlPatterns = "/manager/*")
public class SignFilter implements Filter {

    Logger logger = LoggerFactory.getLogger(SignFilter.class);

    private static String[] ignoreURI = {"login", "register"};

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        String ip = req.getRemoteAddr();
        int port = req.getRemotePort();
        logger.info("ip=" + ip + ",port=" + port);

        String URI = req.getRequestURI(); //获取请求URI
        if (check(URI)) {
            //判断用户是否登录
            HttpSession session = req.getSession();
            Object flag = session.getAttribute("login");
            //用户没有登录
            if (flag == null) {
                req.getRequestDispatcher("/sign/loginError").forward(request, response);
                return;
            }
            //用户是否有权限
            //String accountId = req.getHeader("userId");
            //String method = req.getMethod();
        }

        chain.doFilter(request, response);
    }

    private boolean check(String uri) {
        boolean flag = true;
        for (String s : ignoreURI) {
            if (uri.contains(s)) {
                return false;
            }
        }
        return flag;
    }
}
