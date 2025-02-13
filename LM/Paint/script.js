const canvas = document.getElementById("canvas");
const ctx = canvas.getContext("2d");
const brushSizeInput = document.getElementById("brushSize");
const colorPicker = document.getElementById("colorPicker");
const clearButton = document.getElementById("clearCanvas");

let painting = false;

function startPosition(e) {
    painting = true;
    draw(e);
}
function endPosition() {
    painting = false;
    ctx.beginPath();
}
function draw(e) {
    if (!painting) return;
    ctx.lineWidth = brushSizeInput.value;
    ctx.lineCap = "round";
    ctx.strokeStyle = colorPicker.value;

    ctx.lineTo(e.clientX - canvas.offsetLeft, e.clientY - canvas.offsetTop);
    ctx.stroke();
    ctx.beginPath();
    ctx.moveTo(e.clientX - canvas.offsetLeft, e.clientY - canvas.offsetTop);
}

canvas.addEventListener("mousedown", startPosition);
canvas.addEventListener("mouseup", endPosition);
canvas.addEventListener("mousemove", draw);

clearButton.addEventListener("click", () => {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
});