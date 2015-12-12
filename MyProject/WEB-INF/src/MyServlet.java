import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="MyServlet", urlPatterns="/my")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doGet(arg0, arg1);
    }
    
    
    

}
