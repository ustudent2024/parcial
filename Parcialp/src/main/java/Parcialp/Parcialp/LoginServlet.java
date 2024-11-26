package Parcialp.Parcialp;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.sql.*;

public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse} response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (validarUsuario(email, password)) {
            response.sendRedirect(""); 
        } else {
            request.setAttribute("error", "Credenciales inválidas. Intenta nuevamente.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
        }
    }

    private boolean validarUsuario(String email, String password) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tu_base_de_datos", "usuario", "contraseña");
            String query = "SELECT * FROM usuarios WHERE email = ? AND contrasena = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

