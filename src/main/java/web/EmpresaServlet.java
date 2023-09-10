package web;

import Dao.EmpresaDao;
import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Empresa;

@WebServlet(name = "registro", value = "/registro")
public class EmpresaServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;
    private EmpresaDao empresaDao;

    public void init() {
        empresaDao = new EmpresaDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String nit = request.getParameter("firstName");
        String  nombre = request.getParameter("nombre");
        String direccion = request.getParameter("direccion");
        String confirmar_d = request.getParameter("confirmar_dir");
        String telefono = request.getParameter("numero");
        String clave = request.getParameter("acontraseña");
        String confirmar_c = request.getParameter("confirmar_c");
        String servicio = request.getParameter("servicio");

        Empresa empresa = new Empresa();
        empresa.setNit(nit);
        empresa.setNombre(nombre);
        empresa.setDireccion(direccion);
        empresa.setTelefono(telefono);
        empresa.setClave(clave);
        empresa.setServicio(servicio);

        try {
            empresaDao.registrarEmpresa(empresa);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("detalles.jsp");
    }

}
