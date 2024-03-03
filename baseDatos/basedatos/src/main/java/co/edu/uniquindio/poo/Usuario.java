package co.edu.uniquindio.poo;

public class Usuario {  
    private String identificacion;
    private String nombre;
    private Conexion conexion;

    public Usuario(String identificacion, String nombre, Conexion conexion){       
        this.identificacion=identificacion;
        this.nombre=nombre;
        this.conexion=conexion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Conexion getConexion() {
        return conexion;
    }


    
}
