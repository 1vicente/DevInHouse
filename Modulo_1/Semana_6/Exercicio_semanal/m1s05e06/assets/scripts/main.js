


const comunicaApi = async () => {
    const retorno = (await fetch('https://api.agify.io/?country_id=BR&name=vicente').then((response) => response.json()))
    console.log(retorno)
}

comunicaApi()