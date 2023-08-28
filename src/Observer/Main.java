package Observer;

public class Main {
    public static void main(String[] args) {
        JobSite site = new JobSite();
        site.addVacancy("Fist java position");
        site.addVacancy("Second java position");

        Observer fistSubscriber = new Subscriber("Jhon");
        Observer secondSubscriber = new Subscriber("Joe");

        site.addObserver(fistSubscriber);
        site.addObserver(secondSubscriber);

        site.addVacancy("Third java position");

    }
}