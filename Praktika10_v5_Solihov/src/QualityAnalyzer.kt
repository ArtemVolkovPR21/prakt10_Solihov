// Анализатор качества
class QualityAnalyzer {
    fun analyze(obj: Company) {
        println("\nАнализ качества объекта:")
        obj.displayInfo()
        println("Качество: ${"%.2f".format(obj.calculateQuality())}\n")
    }
}