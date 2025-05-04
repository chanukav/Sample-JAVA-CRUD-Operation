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


@WebServlet("/deleteCustomer")
public class deleteCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public deleteCustomer() {
        super();

    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		customer cus = new customer();
		cus.setEmail(request.getParameter("email"));
		
		customerService service = new customerService();
		service.deleteCustomer(cus);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("adminCustomers");
		
		dispatcher.forward(request, response);
		
		
	}

}
