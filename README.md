# Juego de Lucha

## Descripción
Este es un proyecto simple en Java que simula un juego de pelea entre dos personajes. Utiliza conceptos de Programación Orientada a Objetos (POO) como herencia y el patrón de diseño Factory Method. Los personajes pueden ser de tipo "Guerrero" o "Mago", y la pelea se resuelve con turnos aleatorios de ataque hasta que uno de los personajes pierda toda su vida.

## Cómo Funciona
- **Clases Principales**:
  - `Personaje`: Clase abstracta base que define los atributos y métodos comunes (nombre, puntos de vida, atacar, recibir daño, etc.).
  - `Guerrero` y `Mago`: Subclases que heredan de `Personaje`. Actualmente, no tienen diferencias específicas, pero permiten extensión futura.
  - `PersonajeFactory`: Implementa el patrón Factory Method para crear instancias de personajes basados en el tipo ("guerrero" o "mago").
  - `JuegoLucha`: Clase principal que maneja la lógica del juego, incluyendo la creación de personajes, turnos y determinación del ganador.

- **Mecánica del Juego**:
  - Cada personaje comienza con 100 puntos de vida.
  - En cada turno, un personaje ataca al otro causando un daño aleatorio entre 10 y 30 puntos.
  - El juego alterna turnos hasta que uno de los personajes llegue a 0 puntos de vida.
  - El programa maneja errores de entrada (ej. tipo de personaje inválido) y permite reintentar.

## Requisitos
- Java Development Kit (JDK) instalado (versión 8 o superior).
- Un entorno de línea de comandos (como PowerShell en Windows).

## Cómo Ponerlo a Funcionar
1. **Descarga o Clona el Proyecto**:
   - Los archivos necesarios son: `Personaje.java`, `Guerrero.java`, `Mago.java`, `PersonajeFactory.java`, `JuegoLucha.java`.

2. **Compilar el Código**:
   - Abre una terminal (PowerShell) y navega a la carpeta del proyecto:
     ```
     cd C:\Users\ferna\Downloads\JuegoLucha
     ```
   - Compila todos los archivos Java:
     ```
     javac *.java
     ```
     Esto generará los archivos `.class` necesarios.

3. **Ejecutar el Programa**:
   - Ejecuta el juego:
     ```
     java JuegoLucha
     ```
   - Sigue las instrucciones en pantalla:
     - Introduce el tipo de personaje para el Jugador 1 ("guerrero" o "mago").
     - Introduce el nombre del Jugador 1.
     - Repite para el Jugador 2.
   - El juego simulará la pelea y anunciará al ganador.

4. **Ejecución con Entrada Automática (Opcional)**:
   - Crea un archivo `input.txt` con el contenido (una línea por entrada):
     ```
     guerrero
     NombreJugador1
     mago
     NombreJugador2
     ```
   - Ejecuta:
     ```
     Get-Content input.txt | java JuegoLucha
     ```
     Esto evita introducir datos manualmente.

## Ejemplo de Ejecución
```
Introduce el tipo del jugador 1 (guerrero o mago): guerrero
Introduce el nombre del jugador 1: Arthas
Introduce el tipo del jugador 2 (guerrero o mago): mago
Introduce el nombre del jugador 2: Merlin
La pelea comienza entre Arthas y Merlin...
Turno de Arthas. Puntos de vida de Merlin: 100
Arthas ataca a Merlin causando 25 puntos de dano.
Merlin ahora tiene 75 puntos de vida.
...
Arthas ha ganado la pelea.
```

## Notas
- Si introduces un tipo inválido, el programa te pedirá que lo intentes de nuevo.
- El daño es aleatorio, por lo que los resultados pueden variar.
- Este proyecto es educativo y demuestra herencia y patrones de diseño en Java.
