var canvas = document.getElementById('canvas');
var ctx = canvas.getContext('2d');

ctx.strokeStyle = "red";
ctx.lineWidth = 5;
var radio1 = document.getElementById('range');

/*ctx.lineJoin = "round";
ctx.lineCap = "round";
ctx.beginPath();
ctx.moveTo(20,400);
ctx.lineTo(400,100);

ctx.moveTo(400,100);
ctx.lineTo(400,400);

ctx.moveTo(400,400);
ctx.lineTo(20,400);
ctx.stroke();
ctx.closePath();

ctx.strokeRect(100,450,200,100);
ctx.fillStyle = "green";
ctx.fillRect(350,450,200,100); */

canvas.addEventListener('click', function(e){
    var radio = radio1.value;
    ctx.beginPath();
    ctx.arc(e.offsetX, e.offsetY, radio, 0, 2*Math.PI);
    ctx.closePath();
    ctx.fill();
})

function limpiar(){
    ctx.clearRect(0, 0, canvas.width, canvas.height);
}