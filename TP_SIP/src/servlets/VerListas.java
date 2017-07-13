package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.GrupoDTO;
import app.Controlador;

@WebServlet("/VerListas")
public class VerListas extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String valor = req.getParameter("action");
		String destino = "inicio.jsp";
		Controlador ct = new Controlador();
		
		
		switch(valor ){
		case "VerGrupos":{

			List<GrupoDTO> lgt = ct.getGrupos();
			req.setAttribute("listgrupo", lgt);
			destino = "VerGrupos.jsp";
			break;}
		
		case "VerEstruc":{
			destino = "VerEstructura.jsp";
			break;}		
		}
		
		RequestDispatcher rd = req.getRequestDispatcher(destino);
		rd.forward(req, resp);		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}	
}