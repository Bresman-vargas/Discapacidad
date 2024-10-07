# Proyecto SIA

Este proyecto es un sistema de gestión para personas con discapacidad, que permite registrar beneficiarios, asignarles servicios y hacer seguimiento de su progreso. También incluye la funcionalidad para exportar e importar reportes de los datos gestionados.

## Clases y atributos

- **Beneficiario**: Contiene información sobre el beneficiario, como ID, nombre, edad, discapacidades y detalles opcionales.
- **Servicio**: Registra los servicios ofrecidos, incluyendo el nombre, responsable, y una descripción detallada.
- **Asignación**: Gestiona la relación entre beneficiarios y servicios, permitiendo el seguimiento del progreso de un beneficiario en un servicio.

## Funcionalidades principales

### Gestión de Beneficiarios
- **Agregar Beneficiario**: Permite crear nuevos beneficiarios.

![image](https://github.com/user-attachments/assets/1469313a-34f0-4746-ae43-0fabbd02da83)

- **Editar Beneficiario**: Modificar la información de un beneficiario existente.
- **Eliminar Beneficiario**: Eliminar beneficiarios por su ID.
- **Listar Beneficiarios**: Ver una lista de todos los beneficiarios con sus detalles.

### Gestión de Servicios
- **Agregar Servicio**: Crear nuevos servicios.

![image](https://github.com/user-attachments/assets/747b1785-0c47-42dc-9897-789756e29ba4)

- **Editar Servicio**: Modificar servicios existentes.
- **Eliminar Servicio**: Eliminar servicios registrados.
- **Listar Servicios**: Mostrar todos los servicios disponibles.

### Asignación de Servicios
- **Asignar Servicio**: Asignar servicios a los beneficiarios.

![image](https://github.com/user-attachments/assets/c67be6df-1207-437b-ac6b-eedebfe8c499)

- **Ver Servicios Asignados**: Mostrar los servicios asignados a cada beneficiario.

### Seguimiento de Progreso

![image](https://github.com/user-attachments/assets/76c29ee0-4d83-4b86-842d-ec4cfadc7e1d)

- **Actualizar Progreso**: Modificar el progreso de un beneficiario en un servicio.
- **Ver Progreso**: Ver el progreso de todos los servicios asignados a los beneficiarios.

### Importación y Exportación de Reportes
- **Exportar Reporte**: Generar un reporte de los datos en formato `.txt`.
- **Importar Reporte**: Agregar datos a través de reportes en formato `.txt`.

## Interfaz de Usuario

La interfaz principal ofrece las siguientes opciones:
- **Registrar Beneficiarios**: Menú para gestionar beneficiarios.
- **Administración de Servicios de Apoyo**: Menú para gestionar los servicios y asignarlos a los beneficiarios.
- **Seguimiento de Impacto**: Menú para monitorear el progreso de los beneficiarios en los servicios asignados.
- **Exportación/Importación de Reportes**: Disponible en todos los menús para exportar o importar datos.


# Requisitos antes de ejecutar el programa

Antes de ejecutar el programa, asegúrate de cumplir con los siguientes requisitos:

![image](https://github.com/user-attachments/assets/4413df22-0abe-4fcc-8742-51df86b477ac)

1. **XAMPP Control Panel** debe estar instalado y ejecutándose correctamente.
2. **XAMPP** debe ser capaz de ejecutar **MySQL** y **Apache** sin errores.
   
![image](https://github.com/user-attachments/assets/1e525fa5-8c39-4583-b404-f47fec08db65)
- Deberia Verse Asi
  
3. Abre **phpMyAdmin** en el navegador a través de `http://localhost/phpmyadmin/` o desde el botón **Admin** de MySQL en XAMPP.
4. Crea una base de datos llamada **"Discapacidad"** en **phpMyAdmin**.

![image](https://github.com/user-attachments/assets/25d80d50-a526-4681-8e44-a8c1ffc43467)

![image](https://github.com/user-attachments/assets/dff20c8e-8c1f-4ed3-a599-b3b2e6a9cb3c)

5. Asegúrate de tener instalada la versión **JDK 22** de Java.
6. Verifica que el **Java Runtime Environment (JRE)** esté instalado y configurado correctamente para que el programa funcione.

![image](https://github.com/user-attachments/assets/e261040f-373b-44b2-bbcb-5c8ed9f4f2a9)

- Si no lo tienes instalado, puedes descargarlo desde [aquí](https://www.oracle.com/in/java/technologies/downloads/#jdk23-windows).
7. Asegúrate de que los servicios de **Apache** y **MySQL** estén activos desde el **XAMPP Control Panel**.

![image](https://github.com/user-attachments/assets/690ef847-f0a4-4059-9603-bd08bb7c381f)

- Si tienes errores puedes Ver este [VIDEO](https://www.youtube.com/watch?si=AoO4ozLxIv8xmp4C&v=QR7-vIMUoqk&feature=youtu.be)
  
8. Inicia el programa.

