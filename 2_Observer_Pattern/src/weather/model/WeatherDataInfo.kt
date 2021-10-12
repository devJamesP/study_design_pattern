package weather.model

import weather.mapper.toHeatIndex

data class WeatherDataInfo(
    val temp: Float = -111111.0f,
    val humidity: Float = -1111111.0f,
    val pressure: Float = -111111.0f,
    val heatIndex: Float = toHeatIndex(temp, humidity).toFloat()
)