package christmas.dish.domain;

import java.util.Objects;

public class Menu {
    private final String name;
    private final long price;
    public Menu(String name, long price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Menu) {
            Menu menu = (Menu) obj;
            return name.equals(menu) && price == menu.price;
        }
        return false;
    }
}
