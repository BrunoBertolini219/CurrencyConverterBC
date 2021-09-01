package br.com.brunoccbertolini.currencyconverterbc.main

import br.com.brunoccbertolini.currencyconverterbc.data.models.CurrencyResponse
import br.com.brunoccbertolini.currencyconverterbc.util.Resource


interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}