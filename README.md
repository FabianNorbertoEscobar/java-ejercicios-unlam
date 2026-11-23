# Ejercicios de Java | UNLaM

Colección de prácticas de programación en Java: desde ejercicios introductorios y modelos orientados a objetos hasta algoritmos, estructuras de datos y pequeñas aplicaciones. Los proyectos exploran problemas y herramientas de forma independiente; no forman una única aplicación.

## Contenido

- [Tecnologías y herramientas](#tecnologías-y-herramientas)
- [Qué se practica](#qué-se-practica)
- [Proyectos destacados](#proyectos-destacados)
- [Cómo empezar](#cómo-empezar)
- [Pruebas](#pruebas)
- [Archivos y consideraciones](#archivos-y-consideraciones)

## Tecnologías y herramientas

| Tecnología | Uso en el repositorio |
| --- | --- |
| **Java** | Lenguaje principal. Muchos proyectos de Eclipse están configurados para Java 8; otros, como Cronómetro, utilizan configuraciones anteriores. |
| **Biblioteca estándar de Java** | Colecciones, entrada y salida de archivos, hilos, sockets y JDBC. |
| **Swing y AWT** | Interfaces gráficas de escritorio, eventos y dibujo. |
| **JUnit 4** | Pruebas unitarias en diversos proyectos. |
| **Eclipse** | La mayoría de los ejercicios incluyen `.project`, `.classpath` y configuración del IDE. |
| **NetBeans y Ant** | Proyectos de conversores con `nbproject` y `build.xml`. |
| **Gradle** | Construcción y pruebas del proyecto independiente [Cronómetro](Cronómetro/cronometro/). |
| **JSP, HTML y CSS** | Ejemplos web en [TutorialJSP](TutorialJSP/). |
| **JDBC, MySQL, Hibernate y SQLite** | Ejemplos de acceso a datos y configuración de persistencia en proyectos específicos. |

No existe una versión de Java ni un gestor de dependencias único para todo el repositorio. Revisá la configuración de cada proyecto antes de ejecutarlo.

## Qué se practica

- **Fundamentos de Java:** tipos, arreglos, cadenas, ciclos, condicionales, métodos y recursividad.
- **Programación orientada a objetos:** clases, encapsulamiento, herencia, polimorfismo, interfaces e inmutabilidad. Hay ejemplos de modelado de vehículos, empleados, figuras y juegos, además del patrón Decorator.
- **Colecciones y estructuras de datos:** listas, conjuntos y mapas de Java, junto con implementaciones de montículos y colas de prioridad.
- **Algoritmos y resolución de problemas:** búsqueda, ordenamiento, programación dinámica, análisis de complejidad y ejercicios de estilo olímpico con archivos de entrada y salida.
- **Grafos:** representación y generación de grafos; recorridos BFS y DFS; caminos mínimos con Dijkstra y Floyd; árboles de expansión con Prim y Kruskal; coloreo y cierre transitivo.
- **Concurrencia y comunicación:** creación de hilos, ejemplos de transferencias bancarias y aplicaciones cliente-servidor con sockets.
- **Interfaces y persistencia:** ventanas y eventos con Swing, páginas JSP, lectura y escritura de archivos y ejemplos de conexión a bases de datos.
- **Pruebas y documentación:** casos con JUnit y, en varios ejercicios, enunciados, lotes de prueba, métricas e informes de análisis.

## Proyectos destacados

| Tema | Proyecto | Qué contiene |
| --- | --- | --- |
| Ordenamiento | [Algoritmos de Ordenamiento](Algoritmos%20de%20Ordenamiento/) | Implementaciones como burbujeo, inserción, selección, quicksort, fusión y heapsort. |
| Búsqueda | [Algoritmos de Búsqueda](Algoritmos%20de%20Búsqueda/) | Ejemplos de búsqueda sobre datos. |
| Grafos | [Grafos](Grafos/) | Estructuras, generadores, recorridos, coloreo y algoritmos de caminos y expansión. |
| Estructuras | [Monticulo](Monticulo/) y [ColaDePrioridad](ColaDePrioridad/) | Montículos de mínimos y máximos, y una cola de prioridad basada en montículo. |
| Programación dinámica | [Mochila](Mochila/) y [Fibonacci-ProgramacionDinamica](Fibonacci-ProgramacionDinamica/) | Resolución del problema de la mochila y variantes de Fibonacci. |
| Problemas con archivos | [AltaEnElCielo](AltaEnElCielo/), [DescubriendoNombresRepetidos](DescubriendoNombresRepetidos/) y [PlanDeElectrificacion](PlanDeElectrificacion/) | Soluciones con archivos de entrada y salida y material de prueba. |
| Objetos y diseño | [Piratas](Piratas/), [Pistoleros](Pistoleros/) y [Decorator DesignPattern](Decorator%20DesignPattern/) | Modelos de dominio y práctica de diseño orientado a objetos. |
| Operaciones y pruebas | [Calculadora](Calculadora/) | Operaciones aritméticas con memoria del último resultado y pruebas unitarias. |
| Escritorio | [AppContador](AppContador/), [Chat](Chat/) y [Pelotas rebotando](Pelotas%20rebotando/) | Ventanas y eventos; el ejemplo de pelotas también utiliza animación e hilos. Chat presenta los mensajes en una interfaz local. |
| Redes | [Sockets](Sockets/) y [MiThread](MiThread/) | Ejemplos de comunicación cliente-servidor mediante sockets. |
| Datos y web | [AppMuestraRegistros](AppMuestraRegistros/), [Hibernate](Hibernate/) y [TutorialJSP](TutorialJSP/) | Consulta de registros por JDBC, configuración de Hibernate y páginas JSP. |
| Medición | [Cronómetro](Cronómetro/cronometro/) | Biblioteca para medir tiempos y generar informes, con pruebas y configuración Gradle propia. |

El listado es una puerta de entrada: hay más ejercicios en las carpetas de la raíz y algunos incluyen su propio README.

## Cómo empezar

### Requisitos

- Un **JDK**, no solo un entorno de ejecución. Java 8 es un punto de partida para muchos proyectos de Eclipse, pero comprobá la configuración específica de cada uno.
- Opcionalmente, **Eclipse** para los proyectos que incluyen sus archivos de configuración o **NetBeans** para los conversores.
- Según el ejercicio, pueden hacer falta JUnit, bibliotecas adicionales, un entorno gráfico, una base de datos o un servidor compatible con JSP.

Cloná el repositorio:

```bash
git clone https://github.com/FabianNorbertoEscobar/java-ejercicios-unlam.git
cd java-ejercicios-unlam
```

### Abrir un proyecto en Eclipse

1. Seleccioná **File → Import → General → Existing Projects into Workspace**.
2. Elegí la raíz del repositorio o la carpeta del ejercicio e importá el proyecto deseado.
3. Revisá el JDK y las bibliotecas configuradas en **Java Build Path**.
4. Ejecutá la clase que contenga `main` con **Run As → Java Application**. No todos los proyectos tienen una aplicación ejecutable: algunos son bibliotecas, modelos o pruebas.

### Ejemplo desde la terminal

Este ejercicio no requiere dependencias externas:

```bash
cd "Hola Mundo"
mkdir -p bin
javac -d bin src/HolaMundo.java
java -cp bin HolaMundo
```

La salida esperada es `Hola Mundo`. Para otros ejercicios, la clase principal puede pertenecer a un paquete y necesitar más archivos o dependencias; consultá su código y su configuración. Las rutas entre comillas permiten trabajar con carpetas que tienen espacios.

Los conversores incluyen proyectos Ant de NetBeans. [Cronómetro](Cronómetro/cronometro/) dispone de Gradle Wrapper y su propia documentación; utiliza una configuración antigua de Gradle y Java, por lo que puede requerir un JDK compatible y acceso a sus dependencias.

## Pruebas

Varios ejercicios contienen pruebas JUnit 4 en `test/` o dentro de `src/`. En Eclipse, importá el proyecto, verificá que JUnit 4 esté en el classpath y ejecutá la clase o carpeta de pruebas con **Run As → JUnit Test**.

Cronómetro tiene una configuración Gradle independiente. Desde su carpeta se pueden solicitar las pruebas unitarias con:

```bash
cd "Cronómetro/cronometro"
./gradlew test
```

También define la tarea `acceptanceTest`. Su configuración establece `test.ignoreFailures = true`: consultá los resultados e informes de las pruebas, ya que el estado de la tarea por sí solo no garantiza que todas hayan pasado. No hay un comando único de pruebas para todos los proyectos.

## Archivos y consideraciones

- **Entradas y salidas:** algunos problemas trabajan con archivos `.in` y `.out`. Revisá el `main` y el enunciado de cada ejercicio para conocer los nombres, formatos y directorio de trabajo esperados; ejecutar una solución puede modificar su archivo de salida.
- **Material complementario:** varias carpetas incluyen enunciados PDF, documentación, planillas de métricas y lotes de prueba. Algunas contienen JAR o archivos compilados; el código fuente y la configuración del proyecto son el punto de partida para entenderlos.
- **Interfaces gráficas:** Swing y AWT necesitan un entorno de escritorio; no todos los ejemplos sirven para ejecutarse en una terminal sin interfaz.
- **Bases de datos:** [AppMuestraRegistros](AppMuestraRegistros/) lee `db_config.txt` y necesita una conexión JDBC adecuada. [Hibernate](Hibernate/) incluye una configuración SQLite con una ruta local de otra máquina; revisá la ruta y las dependencias antes de usarla. No subas credenciales reales al repositorio.
- **Web:** las páginas de [TutorialJSP](TutorialJSP/) requieren un contenedor compatible con JSP; abrir el archivo directamente en el navegador no ejecuta el código del servidor.
- **Alcance:** son prácticas con configuraciones y niveles de avance diversos, no aplicaciones preparadas para producción. Revisá los requisitos y el comportamiento de cada ejemplo antes de reutilizarlo.
