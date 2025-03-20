let board = ["", "", "", "", "", "", "", "", ""];
let currentPlayer = "X";
let gameActive = true;

const boardContainer = document.getElementById("board");
const statusText = document.getElementById("status");

function createBoard() {
    boardContainer.innerHTML = "";
    board.forEach((cell, index) => {
        const cellDiv = document.createElement("div");
        cellDiv.classList.add("cell");
        cellDiv.dataset.index = index;
        cellDiv.innerText = cell;
        cellDiv.addEventListener("click", handleClick);
        boardContainer.appendChild(cellDiv);
    });
}

function handleClick(e) {
    const index = e.target.dataset.index;
    if (board[index] !== "" || !gameActive) return;

    board[index] = currentPlayer;
    e.target.innerText = currentPlayer;

    if (checkWinner()) {
        statusText.innerText = `Ha ganado: ${currentPlayer}!`;
        gameActive = false;
    } else if (board.every(cell => cell !== "")) {
        statusText.innerText = "Empate!";
        gameActive = false;
    } else {
        currentPlayer = currentPlayer === "X" ? "O" : "X";
        statusText.innerText = `Le toca a: ${currentPlayer}`;
    }
}

function checkWinner() {
    const winPatterns = [
        [0,1,2], [3,4,5], [6,7,8], 
        [0,3,6], [1,4,7], [2,5,8], 
        [0,4,8], [2,4,6]           
    ];
    return winPatterns.some(pattern => {
        return pattern.every(index => board[index] === currentPlayer);
    });
}

function resetGame() {
    board = ["", "", "", "", "", "", "", "", ""];
    currentPlayer = "X";
    gameActive = true;
    statusText.innerText = `Le toca a: ${currentPlayer}`;
    createBoard();
}

createBoard();
