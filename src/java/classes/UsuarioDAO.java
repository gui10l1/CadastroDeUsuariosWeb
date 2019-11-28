package classes;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {
    public static boolean inserirUsuario(Usuario u){
        boolean sucesso = false;
        try{
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            
            PreparedStatement stmnt = conn.prepareStatement("INSERT INTO cadastro.usuarios (email, senha) VALUES (?, ?)");
            
            stmnt.setString(1, u.getEmail());
            stmnt.setString(2, u.getSenha());
            
            int linhas = stmnt.executeUpdate();
            
            if(linhas > 0){
                sucesso = true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        
        return sucesso;
    }
    
    public static ArrayList<Usuario> listarUsuario(){
        ArrayList<Usuario> usuarios = new ArrayList();
        
        try{
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            
            PreparedStatement stmnt = conn.prepareStatement("select * from cadastro.usuarios");
            
            ResultSet rs = stmnt.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                
                Usuario u = new Usuario();
                u.setId(id);
                u.setEmail(email);
                u.setSenha(senha);
                
                usuarios.add(u);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        
        return usuarios;
    }
    
    public static Usuario procurarUsuario(String email){
        Usuario usuario = null;
        
        try{
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            
            PreparedStatement stmnt = conn.prepareStatement("select * from cadastro.usuarios where email = ?");
            
            stmnt.setString(1, email);
            
            ResultSet rs = stmnt.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String senha = rs.getString("senha");
                
                usuario = new Usuario();
                usuario.setEmail(email);
                usuario.setId(id);
                usuario.setSenha(senha);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        
        return usuario;
    }
    
    public static boolean removerUsuario(String email){
        boolean sucesso = false;
        
        try{
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            
            PreparedStatement stmnt = conn.prepareStatement("delete from cadastro.usuarios where email = ?");
            
            stmnt.setString(1, email);
            
            int linhas = stmnt.executeUpdate();
            
            if(linhas > 0 ){
                sucesso = true;
                
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        
        return sucesso;
    }
}