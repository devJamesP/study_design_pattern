package weather.subject

import weather.model.WeatherDataInfo
import java.util.*

class WeatherData : Observable() {
    private var _weatherDataInfo: WeatherDataInfo? = null
    val weatherDataInfo: WeatherDataInfo get() = _weatherDataInfo ?: WeatherDataInfo()

    private fun measurementsChanged() {
        setChanged()
        notifyObservers()
    }

    fun setMeasurement(weatherDataInfo: WeatherDataInfo) {
        this._weatherDataInfo = weatherDataInfo
        measurementsChanged()
    }
}