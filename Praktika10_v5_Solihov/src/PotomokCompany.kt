// Класс-потомок
class PotomokCompany(
    name: String,
    plantovar: Double,
    facttovar: Double,
    val p: Double
): BaseCompany (name, plantovar, facttovar){
    // Переопределение функции расчета качества Qp
    override fun calculateQuality(): Double {
        val baseQuality = super.calculateQuality()
        return baseQuality * p
    }
    // Переопределение вывода информации
    override fun displayInfo() {
        super.displayInfo()
        println("Дополнительный параметр (P): $p")
        println("Качество (Qp): ${"%.2f".format(calculateQuality())}")
    }
}