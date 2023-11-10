// Dejo espacio para la tarea de JuanPa








// Segundo: escribimos el archivo.txt creandolo
function escribir(ruta, contenido, cb){
    fs.writeFile(ruta, contenido, function (err){
        if(err) {
        console.log('No se ha podido escribir, err');
        } else {
            console.log('Se ha escrito correctamente');
        }

    })
}

//Tercero: eliminamos el archivo1.txt
function borrar(ruta, cb){
    fs.unlink(ruta, cb); // elimina de manera asincronia
}
borrar('${__dirname}/ archivo1.txt', console.log);


//leer('${_dirname}/archivo.txt', console.log);