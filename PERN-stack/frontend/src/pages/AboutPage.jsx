import React from "react";

function AboutPage() {
  return (
    <div>
      <h1 className="text-center font-bold py-4 px-3 text-4xl">Tecnologías Utilizadas</h1>
      <h2 className="text-2xl py-4 px-2">
        Antes de profundizar en el desarrollo, echemos un vistazo a las
        tecnologías clave que usaremos en este proyecto:
      </h2>
      <h3 className="py-4 px-2">
        {" "}
        PostgreSQL: Una potente base de datos relacional que almacenará nuestros
        datos de usuario y tareas.
        Express: Un marco de desarrollo de Node.js
        que proporcionará un servidor para la aplicación y gestionará las
        solicitudes de API.
        React: La biblioteca de JavaScript que utilizaremos
        para construir la interfaz de usuario de nuestra aplicación.
        Node.js: Elentorno de tiempo de ejecución que ejecutará nuestro servidor y la
        lógica del lado del servidor.
        JSON Web Tokens (JWT): Utilizaremos JWT
        para la autenticación de usuarios, permitiendo que los usuarios se
        autentiquen y accedan a sus tareas de manera segura.
      </h3>

      <h2 className="text-2xl py-4 px-2">Configuración del Proyecto</h2>

      <h3 className="py-4 px-2">
        Antes de comenzar, debemos configurar nuestro proyecto. Asegúrate de
        tener PostgreSQL instalado y configurado con una base de datos. Luego,
        sigue estos pasos: Configura el Servidor Express.js: Crea un servidor
        Express para manejar las solicitudes de la API. Implementa las rutas
        para la autenticación de usuarios y las operaciones CRUD de tareas.
        Configura la Base de Datos: Conecta tu servidor a la base de datos
        PostgreSQL. Crea tablas para usuarios y tareas. Define los modelos
        correspondientes en tu servidor. Desarrolla el Frontend React: Construye
        la interfaz de usuario utilizando React. Crea componentes para mostrar
        la lista de tareas, el formulario de inicio de sesión y el formulario de
        registro. Implementa la Autenticación de Usuarios: Utiliza JWT para
        manejar la autenticación de usuarios. Los usuarios pueden registrarse,
        iniciar sesión y cerrar sesión de manera segura. Operaciones CRUD de
        Tareas: Crea las rutas y controladores para realizar operaciones CRUD en
        las tareas. Esto incluye crear una nueva tarea, leer la lista de tareas,
        actualizar una tarea y eliminar una tarea.
      </h3>

      <h2 className="text-2xl py-4 px-2">Ventajas de la Autenticación de Usuarios y CRUD de Tareas</h2>

      <h3 className="py-4 px-2">
        Este proyecto ofrece varias ventajas: Seguridad La autenticación de
        usuarios garantiza que solo los usuarios autorizados puedan acceder a la
        aplicación. Los JWT proporcionan un método seguro para gestionar las
        sesiones de usuario. Gestión de Tareas Eficiente El sistema de CRUD de
        tareas permite a los usuarios crear, leer, actualizar y eliminar tareas
        de manera eficiente. Esto es especialmente útil en aplicaciones de
        productividad y gestión de proyectos. Personalización Los usuarios
        pueden crear sus propias listas de tareas y personalizarlas según sus
        necesidades individuales. Esto brinda flexibilidad y adaptabilidad a la
        aplicación. Aprendizaje Este proyecto es una excelente oportunidad para
        aprender y mejorar tus habilidades en el desarrollo web. Puedes
        profundizar en conceptos como la autenticación de usuarios, la gestión
        de bases de datos y la creación de aplicaciones de una sola página
        (SPA). Conclusión La creación de una aplicación PERN con autenticación
        de usuarios y operaciones CRUD de tareas es un proyecto emocionante que
        combina tecnologías modernas para ofrecer una experiencia rica al
        usuario. Además, proporciona una base sólida para proyectos más grandes
        y complejos en el futuro. ¡Anímate a comenzar este viaje de desarrollo y
        a explorar las infinitas posibilidades que ofrece el stack PERN!
      </h3>
    </div>
  );
}

export default AboutPage;
