package servlet;

import classes.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RemoverServlet", urlPatterns = {"/RemoverServlet"})
public class RemoverServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("remover.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Variáveis 
        String email = request.getParameter("email");
        
        boolean removido = UsuarioDAO.removerUsuario(email);
        
        if(removido){
            request.getRequestDispatcher("removerSucesso.jsp").forward(request, response);
        }else{
            request.setAttribute("erro", "Usuário não encontrado!");
            request.getRequestDispatcher("remover.jsp").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}