package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.customer;
import services.customerService;


@WebServlet("/AddCustomer")
public class AddCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddCustomer() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		customer cus=new customer();
		
		cus.setName(request.getParameter("name"));
		
		cus.setAge(Integer.parseInt(request.getParameter("age")));
		
		cus.setEmail(request.getParameter("email"));
		
		cus.setPassword(request.getParameter("password"));
		
		customerService service=new customerService();
		
		service.regCustomer(cus);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);

	}

}
