async function getBackendMessage() {

    const options = {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: `{"mensagem":"${document.getElementById("apiData").value}"}`
      };
      
      await fetch('http://localhost:3000/mandaDados', options)
        .then(response => response.json())
        .then(response => {
            document.getElementById("apiResponse").innerHTML = response.message
            console.log(response.message)
        })
        .catch(err => console.error(err));

}