import Views.View;
import Controllers.*;
public class App {
    
    public static void main(String[] args) throws Exception {
        //Crear la vista
        View vista = new View();

        //Crear los metodos
        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();

        //Crear el controlador
        Controller controller = new Controller(vista, sortingMethods, searchMethods);
    }
}
