# API de Usuarios - Spring Boot

API REST desarrollada con Spring Boot para la gestión de usuarios.
Este proyecto forma parte de mi portafolio como desarrolladora backend.

---

## 🚀 Funcionalidades

* Crear usuario
* Listar usuarios
* Obtener usuario por ID
* Actualizar usuario
* Eliminar usuario

---

## 🛠️ Tecnologías utilizadas

* Java
* Spring Boot
* Spring Data JPA
* H2 Database

---

## 📌 Endpoints

### 📥 Crear usuario

POST /usuarios

```json
{
  "nombre": "Daniela",
  "email": "daniela@email.com"
}
```

---

### 📋 Listar usuarios

GET /usuarios

---

### 🔍 Obtener usuario por ID

GET /usuarios/{id}

---

### ✏️ Actualizar usuario

PUT /usuarios/{id}

```json
{
  "nombre": "Daniela Gomez",
  "email": "daniela@gmail.com"
}
```

---

### 🗑️ Eliminar usuario

DELETE /usuarios/{id}

---

## ▶️ Cómo ejecutar el proyecto

1. Clonar el repositorio
2. Abrir el proyecto en tu IDE (IntelliJ / VSCode)
3. Ejecutar la aplicación
4. Probar los endpoints con Postman

---

## 💡 Notas

* La base de datos es H2 (puede ser en memoria o persistente)
* No se incluyen datos por defecto
* Se puede inicializar con datos usando `data.sql`

---

## 👩‍💻 Autor

Daniela Gomez
