const canvas = document.getElementById("canvas");
const ctx = canvas.getContext("2d");
const brushSizeInput = document.getElementById("brushSize");
const colorPicker = document.getElementById("colorPicker");
const shapePicker = document.getElementById("shapePicker");
const clearButton = document.getElementById("clearCanvas");

let painting = false;
let startX, startY;

function startPosition(e) {
    painting = true;
    startX = e.clientX - canvas.offsetLeft;
    startY = e.clientY - canvas.offsetTop;
    if (shapePicker.value === "free") {
        draw(e);
    }
}
function endPosition(e) {
    if (painting && shapePicker.value !== "free") {
        let endX = e.clientX - canvas.offsetLeft;
        let endY = e.clientY - canvas.offsetTop;
        drawShape(startX, startY, endX, endY);
    }
    painting = false;
    ctx.beginPath();
}
function draw(e) {
    if (!painting || shapePicker.value !== "free") return;
    ctx.lineWidth = brushSizeInput.value;
    ctx.lineCap = "round";
    ctx.strokeStyle = colorPicker.value;

    ctx.lineTo(e.clientX - canvas.offsetLeft, e.clientY - canvas.offsetTop);
    ctx.stroke();
    ctx.beginPath();
    ctx.moveTo(e.clientX - canvas.offsetLeft, e.clientY - canvas.offsetTop);
}
function drawShape(x1, y1, x2, y2) {
    ctx.lineWidth = brushSizeInput.value;
    ctx.strokeStyle = colorPicker.value;
    ctx.fillStyle = colorPicker.value;

    switch (shapePicker.value) {
        case "rectangle":
            ctx.strokeRect(x1, y1, x2 - x1, y2 - y1);
            break;
        case "circle":
            let radius = Math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2);
            ctx.beginPath();
            ctx.arc(x1, y1, radius, 0, Math.PI * 2);
            ctx.stroke();
            break;
        case "line":
            ctx.beginPath();
            ctx.moveTo(x1, y1);
            ctx.lineTo(x2, y2);
            ctx.stroke();
            break;
    }
}

canvas.addEventListener("mousedown", startPosition);
canvas.addEventListener("mouseup", endPosition);
canvas.addEventListener("mousemove", draw);

clearButton.addEventListener("click", () => {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
});