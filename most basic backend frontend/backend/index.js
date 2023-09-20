const express = require('express')
const cors = require('cors')
const app = express()
const port = 3000

app.use(express.json())
app.use(cors())

app.get('/teste', (req, res) => {
  res.send('GET funcionando')
})

app.get('/data/:description?/:startDate?/:endDate?', (req, res) => {

    console.log("description",req.params.description)
    console.log("startDate",req.params.startDate)
    console.log("endDate",req.params.endDate)
    
    res.send('Dados recebidos.')
})

app.post('/mandaDados', (req, res) => {
    console.log("req.body: ",req.body)
    res.send({"message":"Obrigado pela sua mensagem: "+req.body?.mensagem})
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})