import org.junit.jupiter.api.Test;

public class WebElementExtraTest extends BaseTest {

   @Test
    public void testMenuItemsCount() { // 1
        driver.get("https://demoqa.com/elements");
        // Проверить что на верхнем уровне в левом меню ровно шесть элементов и первый из них Elements
    }

    @Test
    public void testRandomItemVisibility() { // 2
        driver.get("https://the-internet.herokuapp.com/disappearing_elements");
        // Проверить есть ли на странице и отображается ли элемент меню Gallery, вывести это в консоль
        // Если отображает то ассерт что элементов меню 5, если нет, то 4
    }

    @Test
    public void testCheckBoxSemiAppearance() { // 3
        driver.get("https://demoqa.com/checkbox");
        // Раскройте дерево (Home -> Documents) и кликните Office
        // Проверьте, что у оффиса "полная галочка", а у Documents и Home "половинчатая"
    }


    @Test
    public void testSumAndOrderMessageE2E() { // 5
        driver.get("https://www.saucedemo.com/");
        // Войдите в систему как standard_user, отсортируйте товары по цене от маленькой до большой
        // Добавьте в корзину самый дешевый и второй самый дорогой товар, передите в корзину продолжите с заказом
        // Введите данные -> далее; проверьте что общая сумма 41.02 -> Завершите заказ; проверьте что сообщения:
        // "Thank you for your order!" и "Your order has been dispatched, and will arrive just as fast as the pony can get there!"
        // Нажмите "Back Home" и каким хотите способом убедитесь, что вы на главной странице
    }
}
