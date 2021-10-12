package weather.observer

import weather.model.WeatherDataInfo

interface Observer {
    fun update(weatherDataInfo: WeatherDataInfo)
}