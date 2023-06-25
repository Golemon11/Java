package observer;

import java.util.List;

// этот интерфейс будет имплиментировать агенство
//и компания будет зависеть от этого интерфейса
public interface Publisher {
    void registerObserver(Observer observer); // добавить наблюдателя
    void removeObserver (Observer observer); // удалить наблюдателя

    void sendOffer(String nameCompany, double salary, boolean isStudent);
}
