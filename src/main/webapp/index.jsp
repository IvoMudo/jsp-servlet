<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html" charset=UTF-8>
<html>
<head>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<form action="cadastro" method="POST">

    <div class="container-md">

        <p class="text-center fs-1">Formulário</p>

        <div class="input-group mb-3">
          <span class="input-group-text" id="inputGroup-sizing-default">Nome</span>
          <input type="text" name="name" class="form-control">
        </div>
        
        <div class="input-group mb-3">
          <span class="input-group-text" id="inputGroup-sizing-default2" >CPF</span>
          <input type="text" name="document" class="form-control" id="cpf" maxlength="14">
        </div>

        <div class="input-group mb-3">
          <span class="input-group-text" id="inputGroup-sizing-default">Telefone</span>
          <input type="text" name="cel-number" class="form-control" id="phone" maxlength="14">
        </div>
        
        <div class="input-group mb-3">
          <input type="text" class="form-control" name="addressCEP" placeholder="Insira o CEP" id="cep-number" maxlength="9">
          <button class="btn btn-primary" type="button" id="button-addon2" onclick="getFromCepAPI()">Procurar Cep</button>
        </div>
        
        <div class="input-group mb-3">
          <input type="text" class="form-control" placeholder="Cidade" name="cidade" id="city">
          <select class="form-select form-select-sm" name="estado" id="state">
            <option selected>UF</option>
            <option value="RO">RO</option>
            <option value="AC">AC</option>
            <option value="AM">AM</option>
            <option value="RR">RR</option>
            <option value="PA">PA</option>
            <option value="AP">AP</option>
            <option value="TO">TO</option>
            <option value="MA">MA</option>
            <option value="PI">PI</option>
            <option value="CE">CE</option>
            <option value="RN">RN</option>
            <option value="PB">PB</option>
            <option value="PE">PE</option>
            <option value="AL">AL</option>
            <option value="SE">SE</option>
            <option value="BA">BA</option>
            <option value="MG">MG</option>
            <option value="ES">ES</option>
            <option value="RJ">RJ</option>
            <option value="SP">SP</option>
            <option value="PR">PR</option>
            <option value="SC">SC</option>
            <option value="RS">RS</option>
            <option value="MS">MS</option>
            <option value="MT">MT</option>
            <option value="GO">GO</option>
            <option value="DF">DF</option>
          </select>
        </div>

        <input type="submit" class="btn btn-primary"  />

     </div>

</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous">
</script>
<script src="js/inputMask.js"></script>
<script src="js/getFromCepAPI.js"></script>
</body>
