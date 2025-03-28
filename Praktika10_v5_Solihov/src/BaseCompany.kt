// Базовый класс предприятия
open class BaseCompany (
    override val name: String,
    override val plannedVolume: Double,
    override val actualVolume: Double
) : AbstractCompany(name, plannedVolume, actualVolume) {
    // Вторичный конструктор (создание объекта из Map)
    constructor(data: Map<String, Any>) : this(
        data["name"] as String,
        data["planned_volume"] as Double,
        data["actual_volume"] as Double
    )
    // Функция для расчета качества Q
    override fun calculateQuality(): Double {
        return if (plannedVolume == 0.0) 0.0 else actualVolume / plannedVolume
    }
    // Вывод информации об объекте
    override fun displayInfo() {
        println("Предприятие: $name")
        println("Плановый объем товарооборота: $plannedVolume")
        println("Фактический объем товарооборота: $actualVolume")
        println("Качество (Q): ${"%.2f".format(calculateQuality())}")
    }
}