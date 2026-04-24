public class Usuario {
    private String nombre;
    private int edad ;
    
//constructor sin parametros
    public Usuario() {
        nombre = "Leandro Paredes";
        edad = 0;
    }
//con parametros
    public Usuario(String nombre) {

        this.nombre = nombre;
        edad = 0;
    }
    // nombre y edad
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //sobrecarga de solo correo
    public void actualizarPerfil(String correo) {
        System.out.println("correo actualizado: " + correo);
    }
    //sobrecarga correo y tel
    public void actualizarPerfil (String correo,long telefono ){
        System.out.println("correo: " + correo + "Tel: " + telefono);
    }
    public String getNombre() {
        return nombre;
    }

}
