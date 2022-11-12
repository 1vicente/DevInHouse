
const comunicaApi = async () => {
    const retorno = await fetch('https://api.coincap.io/v2/assets/bitcoin').then((response) => response.json())
    console.log(`O preço do Bitcoin ${retorno.data.symbol} em dólares hoje é $${retorno.data.priceUsd}`)
}

comunicaApi()