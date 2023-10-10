import { pool } from "../db.js";

export const listarTareas = (req, res) => res.send("obteniendo tareas");

export const listarTarea = (req, res) => res.send("obteniendo tarea unica");

export const crearTarea = async (req, res, next) => {
  const { titulo, descripcion } = req.body;

  try {
    const result = await pool.query(
      "INSERT INTO tareas (titulo, descripcion) VALUES ($1, $2) RETURNING *",
      [titulo, descripcion]
    );
    res.json(result.rows[0]);
    console.log(result.rows[0]);
  } catch (error) {
    if (error.code === "23505") {
      return res.send("ya existe una tarea con ese titulo");
    }
    console.log(error);
    next(error);
  }
};

export const actualizarTarea = (req, res) =>
  res.send("actualizando tarea unica");

export const eliminarTarea = (req, res) => res.send("eliminando tarea");
