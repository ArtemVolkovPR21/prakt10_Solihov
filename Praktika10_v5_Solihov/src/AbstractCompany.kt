// Абстрактный класс предприятия
abstract class AbstractCompany (
    open val name: String,
    open val plannedVolume: Double,
    open val actualVolume: Double
) : Company {
    abstract override fun calculateQuality(): Double
    abstract override fun displayInfo()
}