var cpf = document.querySelector("#cpf");
cpf.addEventListener("keypress", function(e) {
  if (e.key !== "Backspace") {
    var input = e.target;
    var value = input.value.replace(/\D/g, "");
    value = value.replace(/(\d{3})(?=\d)/g, "$1.");
    value = value.replace(/(\d{3})(?=\d)/g, "$1.");
    value = value.replace(/(\d{3})(\d{1,2})$/, "$1-$2");
    input.value = value;
  }
});

var phone = document.querySelector("#phone");
phone.addEventListener("keypress", function(e) {
  if (e.key !== "Backspace") {
    var input = e.target;
    var value = input.value.replace(/\D/g, "");
    value = value.replace(/^(\d{2})(\d)/g, "($1)$2");
    value = value.replace(/(\d{5})(\d)/, "$1-$2");
    input.value = value;
  }
});

var cep = document.querySelector("#cep-number");
cep.addEventListener("keypress", function(e) {
  if (e.key !== "Backspace") {
    var input = e.target;
    var value = input.value.replace(/\D/g, "");
    value = value.replace(/^(\d{5})(\d)/, "$1-$2");
    input.value = value;
  }
});