package be.vdab.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.math.BigDecimal;
import java.util.Map;
import java.util.LinkedHashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.vdab.entiteiten.Pizza;

/**
 * Servlet implementation class PizzaServlet
 */
@WebServlet("/pizzas.htm")
public class PizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW_PIZZAS="WEB-INF/jsp/pizzas.jsp";
	
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Map<Long,Pizza> pizzas = new LinkedHashMap<Long,Pizza>();
		pizzas.put(10L, new Pizza("Margarita",new BigDecimal(8),false));
		pizzas.put(13L, new Pizza("Proseciutto",new BigDecimal(9.50),true));
		pizzas.put(15L, new Pizza("Calzone",new BigDecimal(10),false));
		pizzas.put(18L, new Pizza("Fungi & Olive",new BigDecimal(8.50),false));
		
		request.setAttribute("pizzas", pizzas);
		request.getRequestDispatcher(VIEW_PIZZAS).forward(request,response);
	}

}
