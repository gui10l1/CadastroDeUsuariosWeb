package servlet;

import classes.Usuario;
import classes.UsuarioDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastrarServlet", urlPatterns = {"/CadastrarServlet"})
public class CadastrarServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("cadastro.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Variáveis
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        
        Usuario u = new Usuario();
        u.setEmail(email);
        u.setSenha(senha);
        
        boolean inserido = UsuarioDAO.inserirUsuario(u);
        
        //Logica
        if(inserido){
            request.getRequestDispatcher("cadastroSucesso.jsp").forward(request, response);
        }else{
            request.setAttribute("erro", "Algum erro aconteceu. Tente novamente!");
            request.getRequestDispatcher("cadastro.jsp").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}