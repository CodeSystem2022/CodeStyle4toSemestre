import { useContext } from "react";
import { AuthContext } from "../context/AuthContext";
import { Card } from "../components/ui";

function HomePage() {
  const data = useContext(AuthContext);
  return (
    <Card>
      <h1 className="font-bold justify-center text-2xl py-4">
        {" "}
        Desarrollando una Aplicación PERN con Autenticación de Usuarios y CRUD
        de Tareas
      </h1>

      <h3>
        El stack PERN (PostgreSQL, Express, React y Node.js) se ha convertido en
        una opción popular para el desarrollo de aplicaciones web de alta
        calidad. En este artículo, exploraremos cómo crear una aplicación PERN
        que incluye la autenticación de usuarios y operaciones CRUD (Crear,
        Leer, Actualizar, Eliminar) de tareas. Este proyecto versátil es ideal
        para una amplia gama de aplicaciones, desde listas de tareas personales
        hasta aplicaciones de gestión de proyectos.
      </h3>
    </Card>
  );
}

export default HomePage;
