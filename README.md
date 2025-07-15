# 🛒 Sistema de Ventas - Proyecto Final POO (UTP)

Este es un **Sistema de Ventas** desarrollado como proyecto final del curso de **Programación Orientada a Objetos** en la **Universidad Tecnológica del Perú (UTP)**.  
El sistema permite la gestión de productos, usuarios y ventas, con control de acceso por roles, y persistencia de datos en una base de datos **PostgreSQL** alojada en **Railway**.

---

## 🚀 Funcionalidades Principales

### 🔐 Manejo de Roles

- **Administrador**:
  - Crear, editar y eliminar usuarios.
  - Crear, editar y eliminar productos.
  - Ver todas las ventas realizadas por todos los clientes.

- **Cliente**:
  - Realizar compras seleccionando productos.
  - Ingresar sus datos para completar la venta.
  - Ver su historial de compras personales.

---

## 🧱 Tecnologías Utilizadas

- **Lenguaje**: Java (JDK 17 o superior)
- **IDE**: NetBeans
- **Interfaz Gráfica**: Java Swing
- **Persistencia**: Hibernate (JPA)
- **Base de Datos**: PostgreSQL (Railway)
- **ORM**: Hibernate
- **Gestor de dependencias**: Maven
- **Control de versiones**: Git + GitHub

---

## 📁 Estructura del Proyecto

- `modelo`: Entidades JPA (`Usuario`, `Producto`, `Venta`, etc.)
- `controlador`: Lógica de negocio y conexión entre vista y modelo.
- `vista`: Interfaces gráficas creadas con Java Swing.
- `META-INF/persistence.xml`: Configuración de Hibernate y PostgreSQL.
- `pom.xml`: Archivo de configuración Maven.

---

## 🛠️ Requisitos para Ejecutar

1. Tener **Java 17 o superior** instalado.
2. Tener **NetBeans** (recomendado NetBeans 15 o superior).
3. Tener conexión a internet para acceder a la base de datos en Railway.
4. Clonar el repositorio desde GitHub:
   ```bash
   git clone https://github.com/usuario/repositorio.git
