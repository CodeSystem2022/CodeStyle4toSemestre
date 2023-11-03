import {z} from 'zod';

export const createTareasSchema = z.object({
    titulo: z.string({
       required_error: "El titulo es requerido",
       invalid_type_error: "El titulo debe ser un string", 
    }).min(1,{
        message: "El titulo debe tener al menos 1 caracter"
    }).max(255, {
        message: "El titulo debe tener como maximo 255 caracteres"
    }),
    descripcion: z.string({
        required_error: "La descripcion es requerida",
        invalid_type_error: "La descripcion debe ser un string",
    }).min(0,{
        message: "La descripcion debe tener al menos 1 caracter"
    }).max(255, {
        message: "La descripcion debe tener como maximo 255 caracteres"
    }).optional(),
});

export const updateTareasSchema = z.object({
    titulo: z.string({
       required_error: "El titulo es requerido",
       invalid_type_error: "El titulo debe ser un string", 
    }).min(1,{
        message: "El titulo debe tener al menos 1 caracter"
    }).max(255, {
        message: "El titulo debe tener como maximo 255 caracteres"
    }).optional(),
    descripcion: z.string({
        required_error: "La descripcion es requerida",
        invalid_type_error: "La descripcion debe ser un string",
    }).min(0,{
        message: "La descripcion debe tener al menos 1 caracter"
    }).max(255, {
        message: "La descripcion debe tener como maximo 255 caracteres"
    }).optional(),
});
