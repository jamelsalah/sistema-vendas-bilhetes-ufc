const container = document.querySelector('.container');
const seats = document.querySelectorAll('.row .seat:not(.occupied)');
const count = document.getElementById('count');
const total = document.getElementById('total');
const movieSelect = document.getElementById('movie');


populateUI();

let ticketPrice = +movieSelect.value;

// Salvando filme e preço de ingresso correspondente
function setMovieData(movieIndex, moviePrice) {
  localStorage.setItem('selectedMovieIndex', movieIndex);
  localStorage.setItem('selectedMoviePrice', moviePrice);
}

// Valor total
function updateSelectedCount() {
  const selectedSeats = document.querySelectorAll('.row .seat.selected');

  const seatsIndex = [...selectedSeats].map(seat => [...seats].indexOf(seat));

  localStorage.setItem('selectedSeats', JSON.stringify(seatsIndex));

  const selectedSeatsCount = selectedSeats.length;

  count.innerText = selectedSeatsCount;
  total.innerText = selectedSeatsCount * ticketPrice;
}

// Data do localstorage para a UI
function populateUI() {
  const selectedSeats = JSON.parse(localStorage.getItem('selectedSeats'));

  if (selectedSeats !== null && selectedSeats.length > 0) {
    seats.forEach((seat, index) => {
      if (selectedSeats.indexOf(index) > -1) {
        seat.classList.add('selected');
      }
    });
  }

  const selectedMovieIndex = localStorage.getItem('selectedMovieIndex');

  if (selectedMovieIndex !== null) {
    movieSelect.selectedIndex = selectedMovieIndex;
  }
}

// Seleção de filme
movieSelect.addEventListener('change', e => {
  ticketPrice = +e.target.value;
  setMovieData(e.target.selectedIndex, e.target.value);
  updateSelectedCount();
});

// Seleção de poltrona
container.addEventListener('click', e => {
  if (
    e.target.classList.contains('seat') &&
    !e.target.classList.contains('occupied')
  ) {
    e.target.classList.toggle('selected');

    updateSelectedCount();
  }
});

function venderBilhete() {
  const button = document.querySelector('.sell')
  button.addEventListener('click', ocupaPoltrona)

  function ocupaPoltrona() {
    const poltrona = document.querySelector('.selected') 
    poltrona.classList.remove('selected')
    poltrona.classList.toggle('occupied')
  }
}
venderBilhete();

function login() {
  const modal = document.querySelector('.login--modal')
  const block = document.querySelector('.block')
  const login = document.querySelector('.login--input').value
  const pass = document.querySelector('.pass--input').value
  if(login  &&  pass) {
    if(login === "james" && pass === "123") {
      console.log('logado')
      modal.classList.toggle('invisible')
      block.classList.toggle('invisible')
    } else {
      console.log("login ou senha incorretos")
    }
  }
}

function showRegisterModal() {
  const loginModal = document.querySelector('.login--modal')
  const registerModal = document.querySelector('.register--modal')
  const registerButton = document.querySelector('.register--button')
  registerButton.addEventListener('click', register)
  loginModal.classList.remove('visible')
  loginModal.classList.toggle('invisible')
  registerModal.classList.remove('invisible')
  registerModal.classList.toggle('visible')
}

function register() {
  const login = document.querySelector('.login--register').value
  const pass = document.querySelector('.pass--register').value
  const pass2 = document.querySelector('.pass2--register').value
  const loginModal = document.querySelector('.login--modal')
  const registerModal = document.querySelector('.register--modal')
  const block = document.querySelector('.block')
  console.log(login, pass, pass2)

  if(login  &&  pass  &&  pass2) {
    loginModal.style.display = "none"
    registerModal.style.display = "none"
    block.style.display = "none"
  }
}

const loginButton = document.querySelector('.login--button')
const showRegister = document.querySelector('.show--register')
loginButton.addEventListener('click', login)
showRegister.addEventListener('click', showRegisterModal)

// Contagem inicial
updateSelectedCount();
