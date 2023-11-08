async function hola(nombre){
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
            // resolve();
            reject("Hay un error");
        }, 1000);
    });   
}

// await hola('Ariel');  Esto es una mañan sintaxis, no se debe utilizar

async function main(){
    await hola('Ariel');
}

main();

