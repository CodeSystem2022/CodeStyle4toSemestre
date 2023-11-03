import Router from "express-promise-router";
import { actualizarTarea, crearTarea, eliminarTarea, listarTarea, listarTareas } from "../controllers/tareas.controller.js"
import {isAuth} from "../middlewares/auth.middleware.js"
import { validateSchema } from "../middlewares/validate.middleware.js"
import { createTareasSchema, updateTareasSchema } from "../schemas/tareas.schema.js";

const router = Router();

router.get('/tareas',isAuth, listarTareas );

router.get('/tareas/:id',isAuth, listarTarea);

router.post('/tareas',isAuth,validateSchema(createTareasSchema) ,crearTarea);

router.put('/tareas/:id',isAuth,validateSchema(updateTareasSchema),actualizarTarea);

router.delete('/tareas/:id',isAuth, eliminarTarea);

export default router;