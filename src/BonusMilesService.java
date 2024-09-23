public class BonusMilesService {
    public int calculate(int a) {
        // Проверям что цена билета положительная
        if (a <= 0) {
            return 0; // возвращаем 0 если цена некорректна
        }

        // Расчитываем количество миль
        int miles = a / 20; // миля за каждые 20 рублей
        return miles;
    }
}

