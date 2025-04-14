const ball = document.getElementById("ball");
ball.src = "pikchu.svg";
ball.style.top = 0;
ball.style.left = (window.innerWidth / 2) - (ball.offsetWidth / 2) + 'px';

const audio = new Audio();
audio.src = "pika-pikachu-14757.mp3";

const speed = 50;

function move(e) {
    console.log(e);
    if (e.code === 'ArrowDown') {
        ball.style.top = parseInt(ball.style.top) + speed + 'px';
    } else if (e.code === 'ArrowUp') {
        if (parseInt(ball.style.top) <= 0) {
            ball.style.top = window.innerHeight - ball.offsetHeight + 'px';
        } else {
            ball.style.top = parseInt(ball.style.top) - speed + 'px';
        }
    } else if (e.code === 'ArrowLeft') {
        ball.style.left = parseInt(ball.style.left) - speed + 'px';
    } else if (e.code === 'ArrowRight') {
        ball.style.left = parseInt(ball.style.left) + speed + 'px';
    }
}

function main() {
    window.addEventListener("keydown", move);
}

function playAudio() {
    audio.play();
    console.log(this.src);
    if (this.src.includes('ball-poke')) {
        this.src = "pikchu.svg";
    } else {
        this.src = "ball-poke.png";
    }
}

ball.addEventListener("click", playAudio);
ball.addEventListener("mouseover", function () {
    this.style.cursor = "pointer";
    this.title = "Bấm vào tôi đi!";
})
