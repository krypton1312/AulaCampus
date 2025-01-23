const box = document.getElementById("movable");
var x = 50;
var y = 50;

document.addEventListener("keydown", (event) => {
  const step = 110;

  switch (event.key) {
    case "ArrowUp":
      y -= step;
      break;
    case "ArrowDown":
      y += step;
      break;
    case "ArrowLeft":
      x -= step;
      break;
    case "ArrowRight":
      x += step;
      break;
  }
  box.style.top = `${y}px`;
  box.style.left = `${x}px`;
});