package br.com.brunoccbertolini.currencyconverterbc.data
import br.com.brunoccbertolini.currencyconverterbc.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CurrencyApi {

    @GET("/{moeda}")
    suspend fun getRates(
        @Path("moeda")
        base: String,

    ): Response<CurrencyResponse>

}