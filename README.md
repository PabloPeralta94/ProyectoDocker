# Proyecto de Cifrado y Descifrado

Este proyecto incluye dos endpoints REST para cifrar y descifrar texto mediante un **cifrado César** simple. Los endpoints permiten cifrar un texto desplazando las letras un número de posiciones especificado y, a su vez, descifrar el texto cifrado aplicando el desplazamiento inverso.

## Ejecutar el proyecto

Para ejecutar el proyecto, sigue los siguientes pasos:

1. Clonar o descargar este repositorio.
2. Ejecutar desde la consola posicionados en la carpeta del proyecto(a la misma altura donde se encuentra el dockerfile) el comando:  
   `docker build -t proyecto .`
3. Ejecutar el comando:  
   `docker run -p 9090:8080 --name contenedor proyecto`

## Endpoints para usar el proyecto

### 1. **Endpoint de Cifrado**
- **Método**: `GET`
- **URL**: `/cifrar`
- **Parámetros**:
  - `texto` (String): El texto que deseas cifrar.
  - `desplazamiento` (int): El número de posiciones para el desplazamiento en el alfabeto.

### 2. **Endpoint de Descifrado**
- **Método**: `GET`
- **URL**: `/descifrar`
- **Parámetros**:
  - `texto` (String): El texto que deseas descifrar.
  - `desplazamiento` (int): El mismo número de desplazamiento que se usó para cifrar el texto.

## Tecnologías Usadas

Este proyecto fue desarrollado utilizando **Java** y **Spring Boot**, dos tecnologías que uso a diario como programador backend.

- **Java**: Es uno de los lenguajes de programación más robustos y populares. Lo elegí para este proyecto porque ofrece gran estabilidad y eficiencia, siendo ideal para trabajar en aplicaciones empresariales y backend. Con Java, puedo crear aplicaciones rápidas, seguras y fáciles de mantener, lo cual es fundamental cuando se trabaja con sistemas complejos.

- **Spring Boot**: Es un framework que simplifica mucho el desarrollo de aplicaciones en Java. Spring Boot me permite crear aplicaciones web de manera rápida y eficiente, sin tener que preocuparme por configuraciones complejas. Con Spring Boot, puedo enfocarme en la lógica del negocio. Además, al ser una herramienta tan popular en el desarrollo backend, tiene una amplia comunidad y muchas librerías que facilitan tareas como la gestión de bases de datos, autenticación, y en este caso, la creación de endpoints REST.

Estas tecnologías juntas permiten construir aplicaciones backend robustas, escalables y fáciles de mantener, lo cual es crucial para desarrollar servicios como los endpoints de cifrado y descifrado implementados en este proyecto.

### ¿Por qué Docker?

Usé Docker para asegurarme de que el proyecto pueda ejecutarse en cualquier entorno, sin importar las diferencias entre máquinas o sistemas operativos. Esto es especialmente útil al trabajar en equipo o desplegar la aplicación en un servidor. Docker crea un entorno controlado y consistente, reduciendo la posibilidad de errores debido a diferencias en configuraciones de software o dependencias.

Este enfoque también facilita el despliegue, ya que solo necesitamos ejecutar el contenedor y automáticamente todo estará configurado para funcionar. Además, al tener dos etapas (una para la construcción y otra para la ejecución), el contenedor final es más liviano y eficiente.
