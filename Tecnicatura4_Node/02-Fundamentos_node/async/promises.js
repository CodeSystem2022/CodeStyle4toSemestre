function hola(nombre){
    return new Promise(function (resolve, reject){
        setTimeout(function() {
            console.log("Hola " + nombre);
            resolve(nombre);
        }, 1000); 
    });       
}

function hablar(nombre){
    return new Promise((resolve, reject) =>{ //usamos la sintaxia ES6
        setTimeout(function() { 
            console.log('bla bla bla bla'); 
            resolve(nombre);
        }, 1000);
    });  
}

function adios(nombre) {
    return new Promise( (resolver, reject) => {
        setTimeout(function() {
            console.log('Adios'+ nombre);
            resolve();
        }, 1000);
    });
   
}

//Llamamos a la función
console.log('Iniciando el proceso...');
hola('Ariel')
    .then(hablar)
    .then(hablar)
    .then(hablar)
    .then(adios)
    .then((nombre) => {
        console.log('Terminando el proceso');
    })

