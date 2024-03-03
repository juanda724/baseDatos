package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class Ejemplo {
    public static void main(String[] args) {
    
    Conexion conexion1 = Conexion.builder().user("Soloquie").contraseña("124560").host("512548855").port( (short) 5).build();
    Usuario usuario1= new Usuario("1025413", "Jose Manuel", conexion1);
    System.out.println(usuario1.getIdentificacion()+" "+usuario1.getConexion().getUser());


    }
}
