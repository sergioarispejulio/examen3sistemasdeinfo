

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class seleccionServlet extends HttpServlet {


	@Override
	protected void service(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	Logica verificador = new Logica();
	int anio = Integer.parseInt(request.getParameter("anio"));
	out.println("<html>");
	out.println("<head>");
	out.println("</head>");
	out.println("<body>");	
	if(verificador.verificacionBisiesto(anio))
	{
		out.println("El anio es bisiesto");
	}
	else
	{
		out.println("El anio no es bisiesto");
	}
	out.println("</body>");
	out.println("</html>");

	}
	
}
