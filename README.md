# APE: MANEJO DE FICHEROS EN JAVA

<div align="center">

**UNIVERSIDAD TÉCNICA DE AMBATO**

Facultad de Ingeniería en Sistemas, Electrónica e Industrial

Carrera de Software

**Asignatura:** Programación Orientada a Objetos

**Tema:** Manejo de Ficheros en Java

**Ambato – Ecuador**

</div>

---
# APE 5: Manipulación de Archivos y Flujos en Java

Repositorio correspondiente a la Práctica de Aplicación y Experimentación de los Aprendizajes (APE 5) de la asignatura **Algoritmos y Lógica de Programación** (Primer Semestre Paralelo B, Carrera de Software, Universidad Técnica de Ambato).

##  Integrantes del Grupo
* **Francis Bonifaz**
* **Dixon Prado**
* **Sebastian Navas**
* **David Punina**

---

##  Estructura y Contenido del Repositorio

El proyecto se encuentra organizado en tres partes principales de desarrollo sobre el manejo de archivos en Java:

### 🔹 Parte 1: Operaciones Básicas con Archivos (`docs`)
* **Ejercicio 1 (`curso.txt`):** Creación de archivos y validación de existencia usando la clase `File`.
* **Ejercicio 2 (`estudiantes.txt`):** Escritura de mensajes de texto en modo *append* (`true`) para no sobrescribir información previa.
* **Ejercicio 3 (`Eliminación`):** Uso del método `delete()` para la supresión controlada de archivos con manejo de excepciones.

### 🔹 Parte 2: Gestión de Estudiantes, Productos y Ventas (`docs clase2`)
* **Ejercicio 1 (`Estudiantes`):** Captura por consola de datos para 3 estudiantes utilizando un bucle `for` y almacenamiento en `estudiantes.txt` mediante `BufferedWriter`.
* **Ejercicio 2 (`Productos`):** Registro detallado de productos con cálculo del valor total y almacenamiento persistente en `productos.txt`.
* **Ejercicio 3 (`Ventas`):** Sistema interactivo de ventas con ciclo continuo hasta la palabra clave "fin", aplicación de descuento automático del 10% en subtotales mayores o iguales a $100 y cálculo del acumulado final en `ventas.txt`.

### 🔹 Parte 3: Gestión Avanzada de Archivos y Directorios (`docs clase3`)
* **Ejercicio 1 (`Creación y Rutas`):** Creación automática de directorios (`datos/`) y archivos (`prueba.txt`) con extracción de metadatos como nombre y ruta.
* **Ejercicio 2 (`Escritura de Asignaturas`):** Uso de `BufferedWriter` y `FileWriter` para escribir una lista de cinco materias línea por línea en `materias.txt`.
* **Ejercicio 3 (`Adición de Elementos`):** Incorporación de nuevas asignaturas al archivo existente en modo *append* sin perder los registros previos.
* **Ejercicio 4 (`Eliminación Condicional`):** Ciclo de verificación de existencia y borrado seguro de un archivo temporal bajo confirmación explícita del usuario.

---

##  Requisitos Técnicos
* Lenguaje de programación: **Java** (JDK 8 o superior)
* Entorno de desarrollo recomendado: Eclipse, IntelliJ IDEA o NetBeans.
* Los archivos planos y carpetas de texto (`.txt`) se generan y gestionan de forma local en la ejecución de los algoritmos.
