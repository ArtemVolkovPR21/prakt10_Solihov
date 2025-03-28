fun main() {
    // Создание объектов базового класса
    val enterprise1 = BaseCompany("ООО 'Розница'", 100000.0, 120000.0)
    val enterprise2 = BaseCompany(
        mapOf(
            "name" to "ЗАО 'Продукты'",
            "planned_volume" to 80000.0,
            "actual_volume" to 75000.0
        )
    )
    // Создание объекта класса-потомка
    val advancedEnterprise = PotomokCompany("ООО 'Люкс'", 150000.0, 160000.0, 1.2)
    // Анализатор качества
    val analyzer = QualityAnalyzer()
    // Вывод информации через анализатор
    println("Информация о предприятиях")
    analyzer.analyze(enterprise1)
    analyzer.analyze(enterprise2)
    analyzer.analyze(advancedEnterprise)
}