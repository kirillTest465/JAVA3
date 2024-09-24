public class BonusMilesService {
    public int calculate(int ticketPrise) {
        // Проверям что цена билета положительная
        if (ticketPrise <= 0) {
            return 0; // возвращаем 0 если цена некорректна
        }

        // Расчитываем количество миль
        int miles = ticketPrise / 20; // миля за каждые 20 рублей
        return miles;
    }
}

