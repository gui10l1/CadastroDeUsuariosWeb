package servlet;

import classes.Usuario;
import classes.UsuarioDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcurarServlet", urlPatterns = {"/ProcurarServlet"})
public class ProcurarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       request.getRequestDispatcher("procurar.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Variáveis
        String email = request.getParameter("email");
        
        Usuario u = UsuarioDAO.procurarUsuario(email);
        
        if(u != null){
            //Usuario cadastrado
            request.setAttribute("usuario", u);
            request.getRequestDispatcher("perfil.jsp").forward(request, response);
        }else{
            request.setAttribute("erro", "Usuário não encontrado!");
            request.getRequestDispatcher("procurar.jsp").forward(request, response);
        }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}