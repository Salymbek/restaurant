package Restauran;

import java.util.List;

public interface MenuAble {
    List<Menu> getAll (List<Menu>means);
    void getFindByName(List<Menu> means, String word);

    void remove(List<Menu>means);
    void create(List<Menu>means);
    void sortByPrice(List<Menu>means, int num);

}
