# [kat] Configuración Básica de Java + Spring Boot [2024]


Este proyecto esta enfocado en mostrar con la ayuda de Sprint Initializ como generar un proyecto de Spring Boot con los componentes web y actuator


## Comenzando 🚀
---

Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tú máquina local para propósitos de desarrollo y pruebas.

1.- Clona el repositorio.

| Comando | Descripción |
| --- | --- |
| HTTP | `https://github.com/KarinaAmaro/practica-uno.git` |
| GitHub CLI | `gh repo clone KarinaAmaro/practica-uno` |


2.- Importa el proyecto a algún IDE como un project.

3.- Verifica que todas las dependencias se hayan descargado correctamente.

4.- Verificar que se cumplan los **Pre-requisitos**.

5.- Ejecutar el proyecto como SpringBot project.

### Pre-requisitos 📋

---

| Nombre | Version |Url |
|   :---:   |   :---:   |   :---:   |
|   Java    |   21.   | https://www.oracle.com/mx/java/technologies/downloads/#graalvmjava21 |
|   Spring Boot   |  3.2.5    |  |
|   Gradle   |  3.2.5    |  |
|   Postman   |  3.2.5    | https://learning.postman.com/docs/getting-started/installation/installation-and-updates/ |

### Instalación y ejecución🔧

---
Una vez clonado el proyecto e importado en el IDE, abrir una terminal donde se encuentre el proyecto instalado.

1.- Ejecutar el siguiente comando para bajar y actualizar dependecias en gradle.
**% ./gradlew clean build**

2.- Para ejecutar el levantar el proyecto desde la terminal ejecutar el siguiente comando:
**% java -jar build/libs/com.practica.uno-0.0.1-SNAPSHOT.jar**

3.- Para probar podemos apoyanos mediante postman para validar que el proyecto este funcionando correctamente.


    Verbo POST
    Recurso  http://localhost:8080/inicio
    Request { "string":"Kat"}
    Response { "string": "Hola Kat, bienveido a Spring Boot."}


## Autor✒️

---

* **AMARO TRINIDAD, KARINA** - *Autor* 
 
 