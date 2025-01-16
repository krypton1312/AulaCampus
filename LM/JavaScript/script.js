var caja = document.getElementById("caja");
var boton = document.getElementById("boton");
var boton1 = document.getElementById("boton1");
var input = document.getElementById("input");
var h1 = document.getElementById("h1");
boton.style.display = 'absolute';

caja.addEventListener("click", function(){
    caja.style.backgroundColor = "rgb(" + Math.floor(Math.random() *255) + "," + Math.floor(Math.random() *255) + "," + Math.floor(Math.random() *255) + ")";
});

function EscribeTexto(){
    h1.innerHTML = input.value;
    caja.style.backgroundColor = "rgb(" + Math.floor(Math.random() *255) + "," + Math.floor(Math.random() *255) + "," + Math.floor(Math.random() *255) + ")";
}

function Mover(){
    boton.style.transform = "translate(" + Math.floor(Math.random() * 500) + "px," + Math.floor(Math.random() * 500) + "px)";
}

function changeColor(){
    caja.style.backgroundColor = "rgb(" + Math.floor(Math.random() *255) + "," + Math.floor(Math.random() *255) + "," + Math.floor(Math.random() *255) + ")";
}