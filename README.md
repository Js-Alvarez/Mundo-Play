# Mundo Play 🍿

¡Bienvenido a **Mundo Play**! Una aplicación de consola desarrollada en Java diseñada para la gestión, simulación y organización de una plataforma de reproducción de video (películas). 

Este proyecto fue estructurado aplicando conceptos clave de la Programación Orientada a Objetos (POO), colecciones de datos y flujos modernos con la API Stream de Java.

---

## 🚀 Características del Proyecto

La aplicación cuenta con un menú interactivo en consola que permite realizar las siguientes acciones:

*   **Añadir Contenido:** Registra nuevas películas especificando su título, duración, género y calificación.
*   **Mostrar Todo:** Lista de manera organizada todos los títulos disponibles actualmente en la plataforma.
*   **Buscar por Título:** Localiza una película específica y despliega su ficha técnica detallada.
*   **Buscar por Género:** Filtra de forma inteligente el catálogo y muestra cuántas y cuáles películas coinciden con el género ingresado (insensible a mayúsculas/minúsculas).
*   **Eliminar Contenido:** Remueve películas del catálogo activo mediante su nombre.
*   **Carga Inicial Automática:** El sistema inicia con un catálogo precargado de 10 películas taquilleras (*Shrek, Inception, Titanic, etc.*) para probar las funciones de inmediato.

---

## 🛠️ Tecnologías Utilizadas

*   **Lenguaje:** Java (Versión 17 o superior recomendada)
*   **Paradigma:** Programación Orientada a Objetos (POO)
*   **Herramientas y Características Avanzadas:**
    *   Java Lambda Expressions & Stream API (`.stream()`, `.filter()`, `.toList()`).
    *   Estructuras de control modernas (`Switch Expressions` con sintaxis de flecha `->`).
    *   Análisis de código y buenas prácticas con **SonarQube**.

---

## 📁 Estructura del Código (`src/`)

El proyecto sigue una arquitectura limpia dividida en paquetes:

*   `reproductor.play`: Contiene el punto de entrada principal (`Main.java`) y el bucle de ejecución de la aplicación.
*   `reproductor.play.contenido`: Clases base del dominio como `Pelicula` (atributos, constructores y métodos para modelar la ficha técnica).
*   `reproductor.play.plataforma`: Lógica del negocio y almacenamiento como `Plataforma.java` (gestión del catálogo a través de listas).
*   `reproductor.play.util`: Herramientas auxiliares como `ScannerUtils.java` para optimizar la captura de datos por teclado y evitar desbordamientos en el búfer de la consola.

---

## 💻 Cómo Ejecutar el Proyecto

1.  **Clonar el repositorio:**
```bash
    git clone [https://github.com/Js-Alvarez/Mundo-Play.git](https://github.com/Js-Alvarez/Mundo-Play.git)
    ```
2.  **Abrir el proyecto:** Importa la carpeta raíz en tu IDE favorito (IntelliJ IDEA, Eclipse, VS Code, etc.).
3.  **Compilar y Correr:** Localiza el archivo `Main.java` dentro de `src/reproductor/play/` y ejecútalo.




