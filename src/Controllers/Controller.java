package Controllers;

import Models.Person;
import Views.View;

public class Controller {
    private View view;
    private SortingMethods sortingMethods;
    private SearchMethods seearchMethods;

    private Person[] personas;

    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.seearchMethods = searchMethods;
        System.out.println("Controller created");
    }
}
