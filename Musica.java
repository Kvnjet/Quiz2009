package Music;
import java.util.ArrayList;
import java.util.List;

// Clase base para representar música
class Musica {
	
	private String PalabrasUsuario;
	String PalabrasUsuario = "Triste y despecho"

	tipoMusica = new ArrayList<>();
	

    public void agregarTipo(String nuevoTipo) {
        tipoMusica.add(nuevoTipo);
    }

    public List<String> obtenerTipos() {
        return tipoMusica;
    }
}



class Salsa extends Musica {

    public String obtenerTipo() {
        return "Salsa";
    }
}

class Regueton extends Musica {

    public String obtenerTipo() {
        return "Reguetón";
    }
}

class Rock extends Musica {

    public String obtenerTipo() {
        return "Rock";
    }
}

class Merengue extends Musica {

    public String obtenerTipo() {
        return "Merengue";
    }
}

class Pop extends Musica {

    public String obtenerTipo() {
        return "Pop";
    }


    public static void main(String[] args) {
        Musica[] playlist = {
                new Salsa(),
                new Regueton(),
                new Rock(),
                new Merengue(),
                new Pop()
        };
    }
}


