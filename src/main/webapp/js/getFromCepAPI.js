const getFromCepAPI = () => {
    event.preventDefault();
      if (document.querySelector('#cep-number').value === '') {
          alert('Digite um CEP');
          return
      }
      const cep = document.querySelector('#cep-number').value;
      const BASE_URL = `https://brasilapi.com.br/api/cep/v1/${cep}`;
  
      // document.querySelector('#cep-number').value = ''
  
      return getJson(BASE_URL)
  };
  const getJson = async (BASE_URL) => {
      const data = await fetch(BASE_URL);
      const json = await data.json();
      
      document.querySelector('#state').value = json.state;
      document.querySelector('#city').value = json.city;
      return json
  }