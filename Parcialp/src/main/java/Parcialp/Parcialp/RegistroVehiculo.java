package Parcialp.Parcialp;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistroVehiculo {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/parqueadero";
    private static final String DB_USER = "root"; 
    private static final String DB_PASSWORD = "";

    protected void FormInfo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String placa = request.getParameter("placa");
        String horaEntrada = request.getParameter("horaEntrada");
        String horaSalida = request.getParameter("horaSalida"); 
        String ubicacion = request.getParameter("ubicacion");
        String tipoVehiculo = request.getParameter("tipoVehiculo");

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO registro (placa, hora_entrada, hora_salida, ubicacion, tipo_vehiculo) "
                       + "VALUES ()";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, placa);
            stmt.setString(2, horaEntrada);
            stmt.setString(3, horaSalida != null && !horaSalida.isEmpty() ? horaSalida : null); // Manejo de opcionalidad
            stmt.setString(4, ubicacion);
            stmt.setString(5, tipoVehiculo);
            stmt.executeUpdate();

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Registro exitoso</h1>");
            out.println("<p>Placa: " + placa + "</p>");
            out.println("<p>Hora de entrada: " + horaEntrada + "</p>");
            if (horaSalida != null && !horaSalida.isEmpty()) {
                out.println("<p>Hora de salida: " + horaSalida + "</p>");
            }
            out.println("<p>Ubicación: " + ubicacion + "</p>");
            out.println("<p>Tipo de vehículo: " + tipoVehiculo + "</p>");
            out.println("</body></html>");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error en el registro.");
        }
    }
}

