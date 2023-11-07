import {MdAddTask} from "react-icons/md"
import {BiTask, BiUserCircle} from "react-icons/bi"

export const PublicRoutes = [  

{
  name: "About",
  path: "/about",
},
{
  name: "Login",
  path: "/login",
},
{
  name: "Registro",
  path: "/register",
}
];



export const PrivateRoutes = [
  
  {
    name: "Tareas",
    path: "/tareas",
    icon: <BiTask className="h-5 w-5"/>,
  },
  {
    name: "Agregar",
    path: "/tareas/crear",
    icon: <MdAddTask className="h-5 w-5"/>,
  },
  {
    name: "Perfil",
    path: "/perfil",
    icon: <BiUserCircle className="h-5 w-5"/>,
  },
];
