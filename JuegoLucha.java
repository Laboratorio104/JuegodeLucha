import java.util.Scanner;

class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;
    // Constructor para inicializar los personajes
    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
    this.jugador1 = jugador1;
    this.jugador2 = jugador2;
    }
    // Metodo para iniciar la pelea
    public void iniciarPelea() {
    System.out.println("La pelea comienza entre " +
    jugador1.getNombre() + " y " + jugador2.getNombre
    () + "...");
    while (jugador1.estaVivo() && jugador2.estaVivo()) {
    turno(jugador1, jugador2);
    if (jugador2.estaVivo()) {
    turno(jugador2, jugador1);
    }
    }
    // Mostrar el resultado de la pelea
    if (jugador1.estaVivo()) {
    System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
    } else {
    System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
    }
    }
    // Metodo que representa un turno de ataque
    private void turno(Personaje atacante, Personaje
    defensor) {
    System.out.println("Turno de " + atacante.getNombre
    () + ". Puntos de vida de " + defensor.getNombre
    () + ": " + defensor.getPuntosDeVida());
    atacante.atacar(defensor);
    System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
    }
    // Metodo principal que ejecuta el juego
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Personaje p1 = null;
    do {
        System.out.print("Introduce el tipo del jugador 1 (guerrero o mago): ");
        String tipo1 = scanner.nextLine();
        System.out.print("Introduce el nombre del jugador 1: ");
        String nombre1 = scanner.nextLine();
        try {
            p1 = PersonajeFactory.crearPersonaje(tipo1, nombre1);
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de personaje no válido. Intenta de nuevo.");
        }
    } while (p1 == null);

    Personaje p2 = null;
    do {
        System.out.print("Introduce el tipo del jugador 2 (guerrero o mago): ");
        String tipo2 = scanner.nextLine();
        System.out.print("Introduce el nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();
        try {
            p2 = PersonajeFactory.crearPersonaje(tipo2, nombre2);
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de personaje no válido. Intenta de nuevo.");
        }
    } while (p2 == null);

    JuegoLucha juego = new JuegoLucha(p1, p2);
    juego.iniciarPelea();
    }
    }