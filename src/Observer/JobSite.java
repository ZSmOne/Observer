package Observer;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observable{
    List<String> vacancies = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();
    public void addVacancy (String vacancy) {
        this.vacancies.add(vacancy);
        notifyObservers();
    }
    public void removeVacancy (String vacancy){
        this.vacancies.remove(vacancy);
        notifyObservers();
    }
    public void addObserver(Observer observer){
        this.subscribers.add(observer);
    }
    public void removeObserver(Observer observer){
        this.subscribers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer: subscribers){
            observer.handleEvent(this.vacancies);
        }
    }
}
