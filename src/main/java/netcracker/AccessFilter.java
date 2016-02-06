package netcracker;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebFilter(filterName = "accessFilter", servletNames = {"InfoServlet"})
public class AccessFilter implements Filter {

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        if (checkUser(request)) {
            filterChain.doFilter(request, response);
        } else response.sendRedirect("error.html");

    }

    public boolean checkUser(HttpServletRequest request){
        HttpSession session = request.getSession();
        CreateUser createUser=new CreateUser();
        if(session.getAttribute("login") != null
                && session.getAttribute("login").toString().equals(createUser.createProperties().get("user"))
                && session.getAttribute("password") != null
                && session.getAttribute("password").toString().equals(createUser.createProperties().get("password"))){
            return true;
        }
        else
        {
            return false;
        }
    }

    public void destroy() {
    }

    public void init(FilterConfig filterConfig) throws ServletException {
    }
}