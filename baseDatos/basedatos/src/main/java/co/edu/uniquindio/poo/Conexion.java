package co.edu.uniquindio.poo;

public class Conexion {
    private String user;
    private String contraseña;
    private String host;
    private String codificacion;
    private Short tiempoEspera;
    private Byte reintentos;
    private Boolean SSL;
    private Short port;
    private String baseDatos;
    private static Conexion conexion;
    public Conexion(String user, String host, String contraseña, String codificacion, Short tiempoEspera,
            Byte reintentos, Boolean SSL, Short port, String baseDatos) {

        assert user!=null;
        assert contraseña!=null;
        assert host!=null;
        this.user = user;
        this.contraseña = contraseña;
        this.host = host;
        this.codificacion = codificacion;
        this.tiempoEspera = tiempoEspera;
        this.reintentos = reintentos;
        SSL = true;
        this.port = port;
        this.baseDatos = baseDatos;
    }

    public static Conexion getInstance(){
        if(conexion == null){
            throw new IllegalArgumentException();
        }
        return conexion;
    }
    
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getCodificacion() {
        return codificacion;
    }
    public void setCodificacion(String codificacion) {
        this.codificacion = codificacion;
    }
    public Short getTiempoEspera() {
        return tiempoEspera;
    }
    public void setTiempoEspera(Short tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }
    public Byte getReintentos() {
        return reintentos;
    }
    public void setReintentos(Byte reintentos) {
        this.reintentos = reintentos;
    }
    public Boolean getSSL() {
        return SSL;
    }
    public void setSSL(Boolean sSL) {
        SSL = sSL;
    }
    public Short getPort() {
        return port;
    }
    public void setPort(Short port) {
        this.port = port;
    }
    public String getBaseDatos() {
        return baseDatos;
    }
    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }

    public static ConexionBuilder builder(){
        return new ConexionBuilder();
    }

    public static class ConexionBuilder{
        private String user;
        private String contraseña;
        private String host;
        private String codificacion;
        private Short tiempoEspera;
        private Byte reintentos;
        private Boolean SSL;
        private Short port;
        private String baseDatos;

        private ConexionBuilder(){}

        public ConexionBuilder user(String user){
            this.user=user;
            return this;
        }

        public ConexionBuilder contraseña(String contraseña){
            this.contraseña=contraseña;
            return this;
        }

        public ConexionBuilder host(String host){
            this.host=host;
            return this;
        }

        public ConexionBuilder codificacion(String codificacion){
            this.codificacion=codificacion;
            return this;
        }

        public ConexionBuilder tiempoEspera(Short tiempoEspera){
            this.tiempoEspera=tiempoEspera;
            return this;
        }

        public ConexionBuilder reintentos(Byte reintentos){
            this.reintentos=reintentos;
            return this;
        }

        public ConexionBuilder SSL(Boolean SSL){
            this.SSL=SSL;
            return this;
        }
        public ConexionBuilder port(Short port){
            this.port=port;
            return this;
        }
        public ConexionBuilder baseDatos(String baseDatos){
            this.baseDatos=baseDatos;
            return this;
        }

        public Conexion build(){
            if(user == null || host == null|| contraseña == null){
                throw new IllegalArgumentException();
            }
            if(conexion == null){
                conexion = new Conexion(user, host, contraseña, codificacion, tiempoEspera, reintentos, SSL,port, baseDatos);}
            return conexion;
        }
    
    }


}
