# 🏥 Prueba Técnica – Sistema de Gestión de Hospitales

Este proyecto es una solución completa para una prueba técnica solicitada por **AGENCIA GATO**. Incluye la creación de una base de datos relacional, el desarrollo de procedimientos almacenados (Stored Procedures), y  una aplicación web funcional desarrollada con **Spring Boot**, **Hibernate/JPA** y una base de datos SQL (PostgreSQL, MySQL o SQL Server).

## 📋 Contenido

- [📁 Estructura del proyecto](#-estructura-del-proyecto)
- [⚙️ Requisitos técnicos](#️-requisitos-técnicos)
- [🔧 Instalación](#-instalación)
- [🗃️ Base de datos y stored procedures](#️-base-de-datos-y-stored-procedures)
- [🌐 Aplicación web](#-aplicación-web)
- [🧪 Funcionalidades implementadas](#-funcionalidades-implementadas)
- [🚀 Cómo ejecutar](#-cómo-ejecutar)
- [📎 Repositorio de GitHub](#-repositorio-de-github)

---

## 📁 Estructura del Proyecto

/Scripts
├─ creacion_de_tablas.sql
├─ Registro_de_datos.sql
└─ stored_procedures.sql

/backend
└─ spring-boot-app/
├─ config/
├─ controller/
├─ repository/
├─ entity/
├─ service/
└─ HospitalApplication.java


/resources
└─ static/
├─ css/
└─ templates/
├─ login.html
├─ home.html
├─ registrar.html
├─ eliminar.html
└─ listar.html

---

## ⚙️ Requisitos técnicos

- Java JDK LTS (17 o 21)
- Spring Boot (desde Spring Initializr)
- Hibernate / JPA (u otra implementación como MyBatis)
- Spring WEB
- Spring Security
- PostgreSQL / MySQL / SQL Server
- Maven o Gradle
- IDE recomendado: **IntelliJ**, **Spring Tool Suite (STS)** o **Eclipse**

---

## 🔧 Instalación

1. **Clona el repositorio:**
   ```bash
   git clone https://github.com/DamiBermudez/FullStack_Java_jr.git
   cd nombre-proyecto

---

## 🔧 Configura tu base de datos:

-Crea una base de datos en PostgreSQL, MySQL o SQL Server

-Ejecuta los scripts de la carpeta /db en el siguiente orden:

1-crear_tablas.sql

2-insertar_datos.sql

3-stored_procedures.sql

---

## Configura el archivo application.properties o application.yml:

//configuracion de conexion_MYSQL

spring.datasource.url=jdbc:mysql://localhost:3306/hospitaldb?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root1234


//Configuracion de HIbernate

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.properties.hibernate.format_sql=true
logging.level.org.springframework.security=DEBUG

spring.security.user.name=gato
spring.security.user.password=1234

---

🗃️ Base de Datos y Stored Procedures
Tablas creadas:
Gerente

Condicion

Distrito

Sede

Provincia

Hospital (relacionada con las anteriores)

Procedimientos almacenados:

SP_HOSPITAL_REGISTRAR

SP_HOSPITAL_ACTUALIZAR

SP_HOSPITAL_ELIMINAR

SP_HOSPITAL_LISTAR

Los procedimientos utilizan estructuras como CURSOR, LOOP, FOR, e instrucciones IF.

🌐 Aplicación Web
Frontend construido en HTML, CSS y JavaScript puro, sin frameworks externos. Comunicación con el backend vía fetch API.

Módulos implementados:
Página	Funcionalidad
login.html	Inicio de sesión
principal.html	Menú de navegación
registrar.html	Registro y actualización de hospitales
buscar.html	Búsqueda, eliminación y listado de hospitales

🧪 Funcionalidades Implementadas
✅ Registro de hospitales
✅ Búsqueda por múltiples criterios (en proceso)
✅ CRUD completo usando Stored Procedures
✅ Eliminación con cuadro de confirmación
✅ Validaciones de campos obligatorios
✅ Página principal tipo dashboard

🚀 Cómo ejecutar

Ejecutar base de datos y procedimientos

Desde el IDE iniciar el proyecto en la clase principal

📎 Repositorio de GitHub
📂 https://github.com/DamiBermudez/FullStack_Java_jr.git

👨‍💻 Autor
Damián Esteban Bermúdez Quiceno
💼 LinkedIn www.linkedin.com/in/damibermudez
💻 GitHub https://github.com/DamiBermudez
📧 yodamest.bermudez@gmail.com




