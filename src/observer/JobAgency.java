package observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{
//    содержит коллекцию наблюдателей
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String nameCompany, double salary, boolean isStudent) {
        for (Observer observer : observers) {
            observer.receiveOffer(nameCompany, salary, isStudent);
        }
    }
}
