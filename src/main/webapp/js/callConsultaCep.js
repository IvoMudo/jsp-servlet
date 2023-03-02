var asyncRequest;
function callConsultaCep(){
    try
    {
        asyncRequest = new XMLHttpRequest();
        asyncRequest.open('GET', '/jsp-servlet/consultaCep', true);
        asyncRequest.send(null);
    }
    catch(exception)
   {
    alert("Request failed");
   }
}