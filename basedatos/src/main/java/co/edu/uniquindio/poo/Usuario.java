package co.edu.uniquindio.poo;

public class Usuario {  
    private String identificacion;
    private String nombre;
    private Conexion conexion;

    public Usuario(String identificacion, String nombre){       
        this.identificacion=identificacion;
        this.nombre=nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Conexion getConexion (String user, String contraseña, String host, String codificacion, Short tiempoEspera,
    Byte reintentos, Boolean SSL, Short port, String baseDatos){
        if(conexion!=null) {
            return conexion;
        }
        conexion = conexion.builder(user,contraseña, host)

    }
    
}
