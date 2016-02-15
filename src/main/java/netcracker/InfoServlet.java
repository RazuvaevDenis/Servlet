package netcracker;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/info")
public class InfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CreateUser createUser=new CreateUser();
        List<User> userList = createUser.users();
        request.setAttribute("users", userList);
        request.getRequestDispatcher("info.jsp").forward(request, response);
    }
}