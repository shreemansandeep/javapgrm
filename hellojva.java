package crunch;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name="hello",urlPatterns={"/hello"}) // added this line

public class HelloWorld extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    out.println("Hello World");
  }
}
