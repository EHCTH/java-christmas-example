package christmas.dish.domain;

import christmas.dish.Dish;
import christmas.dish.domain.menu.Menu;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class DishTest {
    private static List<Menu> mainDish;
    private static List<Menu> appetizer;
    private static List<Menu> dessert;
    private static List<Menu> beverage;

    @BeforeAll
    static void initMenu() {
        mainDish = Dish.getMainDish().getMenuInfo();
        appetizer = Dish.getAppetizer().getMenuInfo();
        dessert = Dish.getDessert().getMenuInfo();
        beverage = Dish.getBeverage().getMenuInfo();
    }

    @Test
    void mainDishTest() {
        List<Menu> expectedMainDish = List.of(
                new Menu("티본스테이크", "55000"),
                new Menu("바비큐립", "54000"),
                new Menu("해산물파스타", "35000"),
                new Menu("크리스마스파스타", "25000"));
        assertThat(mainDish).isEqualTo(expectedMainDish);
    }

    @Test
    void appetizerTest() {
        List<Menu> expectedAppetizer = List.of(
                new Menu("양송이수프", "6000"),
                new Menu("타파스", "5500"),
                new Menu("시저샐러드", "8000"));
        assertThat(appetizer).isEqualTo(expectedAppetizer);
    }

    @Test
    void dessertDishTest() {
        List<Menu> expectedDessert = List.of(
                new Menu("초코케이크", "15000"),
                new Menu("아이스크림", "5000"));
        assertThat(dessert).isEqualTo(expectedDessert);
    }

    @Test
    void beverageTest() {
        List<Menu> expectedBeverage = List.of(
                new Menu("로콜라", "3000"),
                new Menu("레드와인", "60000"),
                new Menu("샴페인", "25000"));
        assertThat(beverage).isEqualTo(expectedBeverage);
    }

    @Test
    void orderMainMenuTest() {
        List<Menu> expectedMainDish = List.of(
                new Menu("티본스테이크", "55000"),
                new Menu("바비큐립", "54000"),
                new Menu("해산물파스타", "35000"),
                new Menu("크리스마스파스타", "25000"));
        for (Menu menu : expectedMainDish) {
            assertThat(Dish.orderMenu(menu.getName())).isEqualTo(menu);
        }
    }

    @Test
    void orderAppetizerTest() {
        List<Menu> expectedAppetizer = List.of(
                new Menu("양송이수프", "6000"),
                new Menu("타파스", "5500"),
                new Menu("시저샐러드", "8000"));
        for (Menu menu : expectedAppetizer) {
            assertThat(Dish.orderMenu(menu.getName())).isEqualTo(menu);
        }
    }

    @Test
    void orderDessertTest() {
        List<Menu> expectedDessert = List.of(
                new Menu("초코케이크", "15000"),
                new Menu("아이스크림", "5000"));
        for (Menu menu : expectedDessert) {
            assertThat(Dish.orderMenu(menu.getName())).isEqualTo(menu);
        }
    }

    @Test
    void orderBeverageTest() {
        List<Menu> expectedBeverage = List.of(
                new Menu("로콜라", "3000"),
                new Menu("레드와인", "60000"),
                new Menu("샴페인", "25000"));
        for (Menu menu : expectedBeverage) {
            assertThat(Dish.orderMenu(menu.getName())).isEqualTo(menu);
        }
    }
    @Test
    void notFindMenuTest() {
       assertThatThrownBy(() -> Dish.orderMenu("없는메뉴"))
               .isInstanceOf(IllegalArgumentException.class)
               .hasMessage("[ERROR] 찾는 메뉴가 없습니다");
    }
}
