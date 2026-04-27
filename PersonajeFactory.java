public class PersonajeFactory {
    public static Personaje crearPersonaje(String tipo, String nombre) {
        switch (tipo.toLowerCase()) {
            case "guerrero":
                return new Guerrero(nombre);
            case "mago":
                return new Mago(nombre);
            default:
                throw new IllegalArgumentException("Tipo de personaje no válido: " + tipo);
        }
    }
}