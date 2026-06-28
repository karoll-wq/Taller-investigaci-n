# Ejercicios Investigados en Java

## 📌 Descripción

Este repositorio reúne una serie de ejercicios desarrollados en **Java** con el objetivo de aprender y practicar algunas de las características modernas del lenguaje. En cada programa se compara la forma tradicional de resolver un problema con una versión abreviada, permitiendo apreciar cómo las nuevas funcionalidades hacen que el código sea más limpio, legible y eficiente.

Todos los ejercicios solicitan datos al usuario mediante la clase `Scanner`, facilitando la interacción y la comprensión del funcionamiento de cada método.

---

# 📂 Contenido del proyecto

## 📘 EJEMPLO1.java – Uso de `getOrDefault()`

**Descripción:**

Este programa registra nombres y edades en un `HashMap`. Posteriormente, el usuario ingresa el nombre de una persona para consultar su edad.

**Explicación:**

Tradicionalmente es necesario verificar si la clave existe utilizando `containsKey()`. Con `getOrDefault()` se obtiene directamente el valor asociado a la clave y, si no existe, se devuelve un valor predeterminado sin necesidad de realizar una validación adicional.

**Beneficios:**

- Reduce la cantidad de código.
- Evita estructuras `if`.
- Hace la consulta más sencilla y legible.

---

## 📘 EJEMPLO2.java – Uso de `computeIfAbsent()`

**Descripción:**

El programa solicita un nombre de usuario y lo registra en un `HashMap` únicamente si aún no existe.

**Explicación:**

En la forma tradicional se verifica primero si la clave está registrada mediante `containsKey()` y luego se agrega con `put()`. Con `computeIfAbsent()` ambas operaciones se realizan en una sola instrucción, agregando automáticamente el valor cuando la clave no existe.

**Beneficios:**

- Evita validaciones repetitivas.
- Simplifica la inserción de datos.
- Hace el código más limpio y eficiente.

---

## 📘 EJEMPLO3.java – Uso de `replaceAll()`

**Descripción:**

El usuario ingresa una lista de nombres y el programa convierte todos los elementos a letras mayúsculas.

**Explicación:**

La forma tradicional utiliza un ciclo `for` para recorrer la lista y modificar cada posición. Con `replaceAll()` se aplica una función a todos los elementos de la colección de forma automática mediante una expresión lambda.

**Beneficios:**

- Reduce líneas de código.
- Facilita la modificación de listas.
- Mejora la legibilidad del programa.

---

## 📘 EJEMPLO4.java – Uso de `List.copyOf()`

**Descripción:**

El usuario ingresa una lista de frutas y posteriormente se crea una copia de dicha lista.

**Explicación:**

Tradicionalmente la copia se realiza creando un nuevo `ArrayList`. Con `List.copyOf()` se genera una copia inmutable de la lista original en una sola instrucción, evitando modificaciones accidentales.

**Beneficios:**

- Código más corto.
- Crea listas inmutables.
- Aumenta la seguridad de los datos.

---

## 📘 EJEMPLO5.java – Uso de `toArray(String[]::new)`

**Descripción:**

El programa solicita una lista de ciudades y posteriormente convierte el `ArrayList` en un arreglo de cadenas para mostrar su contenido.

**Explicación:**

Antes era necesario crear manualmente un arreglo con el tamaño de la lista. Con `toArray(String[]::new)` Java genera automáticamente el arreglo utilizando una referencia al constructor.

**Beneficios:**

- Sintaxis más moderna.
- Evita crear arreglos manualmente.
- Hace el código más sencillo y elegante.

---

# 🚀 Tecnologías utilizadas

- Java
- JDK 8 o superior
- Visual Studio Code
- Git y GitHub

---

# ▶️ Cómo ejecutar el proyecto

1. Clonar el repositorio.

```bash
git clone https://github.com/USUARIO/NOMBRE-REPOSITORIO.git
```

2. Abrir el proyecto en Visual Studio Code o cualquier IDE compatible con Java.

3. Compilar el archivo deseado.

```bash
javac EJEMPLO1.java
```

4. Ejecutarlo.

```bash
java EJEMPLO1
```

Repita el procedimiento para cualquiera de los demás ejercicios.

---

# 🎯 Objetivos del proyecto

- Comprender características modernas de Java.
- Comparar la programación tradicional con la programación abreviada.
- Mejorar la legibilidad del código.
- Reducir la cantidad de instrucciones necesarias para realizar una tarea.
- Aplicar buenas prácticas de programación utilizando las colecciones de Java.

---

# 📁 Estructura del proyecto

```
ejercicios investigados/
│── EJEMPLO1.java
│── EJEMPLO2.java
│── EJEMPLO3.java
│── EJEMPLO4.java
│── EJEMPLO5.java
│── README.md
```

---

# 👩‍💻 Autor

**Karoll nikol coronado bermeo**

---

# 📄 Licencia

Este proyecto fue desarrollado con fines académicos como parte del estudio de las características modernas del lenguaje Java.