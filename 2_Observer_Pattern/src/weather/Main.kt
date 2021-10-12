package weather

import weather.model.WeatherDataInfo
import weather.observer.*
import weather.subject.WeatherData
import java.util.*
import java.util.Observer

fun main() {
    val weatherData : Observable = WeatherData()

    val currentConditions: Observer = CurrentConditions(weatherData)
    val statisticsDisplay: Observer = StatisticsDisplay(weatherData)
    val forecastDisplay: Observer = ForecastDisplay(weatherData)
    val heatIndexDisplay: Observer = HeatIndexDisplay(weatherData)
    val thirdPartyDisplay: Observer = ThirdPartyDisplay(weatherData)

    // display
    (weatherData as WeatherData).setMeasurement(
        WeatherDataInfo(
            temp = 80f,
            humidity = 65f,
            pressure = 30.4f
        )
    )
    weatherData.setMeasurement(
        WeatherDataInfo(
            temp = 89f,
            humidity = 25f,
            pressure = 98.4f
        )
    )
    weatherData.setMeasurement(
        WeatherDataInfo(
            temp = 82f,
            humidity = 25f,
            pressure = 31f
        )
    )
}