// La palabra async no es necesaria en las funciones  porque ya son asíncronas
//Igual proyectan una sincronia visual
async function hola(nombre){
    return new Promise(function (resolve, reject){
        setTimeout(function() {
            console.log("Hola " + nombre);
            resolve(nombre);
        }, 1000); 
    });       
}

async function hablar(nombre){
    return new Promise((resolve, reject) =>{ //usamos la sintaxia ES6
        setTimeout(function() { 
            console.log('bla bla bla bla'); 
            resolve(nombre);
        }, 1000);
    });  
}

async function adios(nombre) {
    return new Promise( (resolver, reject) => {
        setTimeout(function() {
            console.log('Adios'+ nombre);
            // resolve();
            reject("Hay un error");
        }, 1000);
    });   
}

// await hola('Ariel');  Esto es una mañan sintaxis, no se debe utilizar
// await es sólo es válido dentro de una funcion asíncrona
async function main(){
    let nombre = await hola('Ariel');
    await hablar();
    await hablar();
    await hablar();
    await adios(nombre);
    console.log("Termina el proceso...");
}

//console.log("Empezamos en proceso...")
//main();
//console.log("Esta va a ser la segunda instrucción")

// códiogo en inglés
// Es asincrónico y retorna un promesa
function sayHello(name) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Hello " + name);
            resolve(name);
        }, 1000);
    });
}

function talk(name){
    return new Promise((resolve, reject) =>{ //usamos la sintaxia ES6
        setTimeout(() => { 
            console.log('bla bla bla bla'); 
            resolve(name);
        }, 1000);
    });  
}

function sayBay(name) {
    return new Promise( (resolver, reject) => {
        setTimeout(() => {
            console.log('Goodbye'+ name);
            resolve(name);
        }, 1000);
    });   
}

async function conversation(name) {
    console.log("Code in english");
    console.log("Staring async process...");
    await sayHello(name);
    await talk();
    await talk();
    await talk();
    console.log("Process completed");
}

conversation("Ariel");