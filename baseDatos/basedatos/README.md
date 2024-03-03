# basedatos

Juan José y Sebastián tienen como objetivo crear un sistema donde cada usuario pueda conectar a su base de datos de forma eficiente y segura. Para lograrlo, deberán crear un proyecto en Java que implemente el patrón Singleton para asegurar una única instancia de una clase que gestione la conexión.
Para crear una conexión, se requiere información esencial como el nombre de usuario (user), la contraseña (pass) y el host de la base de datos. Además, los usuarios pueden proporcionar datos opcionales para la conexión, tales como codificación de caracteres, tiempo de espera de la conexión, certificados SSL, puerto y nombre de la base de datos.
Dado que existen múltiples maneras de crear una conexión, se debera utilizar el patrón Builder para configurar esta conexión de manera adecuada
# Autores

- Juan David Castañeda Valenzuela
- Cesar Camilo Tulcan Erira

# Herramientas

- [java 17](https://adoptium.net/es)
- [junit 5.10.0](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.10.0)
- [maven](https://maven.apache.org)


# Construcción y pruebas

Para compilar el proyecto puede usar el comando:

```shell
mvn clean compile
```

Para ejecutar las pruebas puede usar el comando: 

```shell
 mvn clean test
```

Para generar el jar puede usar el comando: 

```shell
 mvn clean package
```

y para ejecutar el jar

```shell
 java -jar target/basedatos-1.0.jar
```
