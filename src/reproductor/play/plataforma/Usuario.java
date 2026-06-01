package reproductor.play.plataforma;

import reproductor.play.contenido.Pelicula;

public class Usuario {
    public String nombre;
    public String email;

    public Usuario(String nombre,String email) {
        this.nombre= nombre;
        this.email= email;
    }

    public void ver(Pelicula pelicula){
        System.out.println(nombre + " esta viendo .... ");
        pelicula.reproducir();
    }
}
