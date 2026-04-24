public class Reporte {
//2.1
    public void generarEncabezado() {;
    System.out.println("**Reportes**");
    System.out.println("Fecha: 19-04-2026");
    }
//2.2
public String obtenerCuerpo(){
    return"El domingo 19-04-26, El papa de Riber chango Zeballos marca.";
};
//2.3
public void agregarSecciones(String...secciones){
    if (secciones.length==0) {
        System.out.println("Sin secciones adicionales");
        return;
    }
        for (String s : secciones){
            System.out.println("start" + s);
        }
        
    }
}

    


