import dao.AutomobileDao;
import entity.Automobile;
import entity.GearType;

import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) {
        AutomobileDao automobileDao = new AutomobileDao();
        Automobile automobile3 = new Automobile("Lanos", 3000, "14/09/1986", "22/04/2020", GearType.MANUAL, "30%");
        automobileDao.saveAutomobile(automobile3);
        Automobile automobile2 = new Automobile("2109", 7000, "12/07/1990", "20/02/2020", GearType.AUTOMATIC, "30%");
        automobileDao.saveAutomobile(automobile2);
        Automobile automobile = new Automobile("Reno", 15000, "13/08/1991", "21/03/2020", GearType.MANUAL, "50%");
        automobileDao.saveAutomobile(automobile);
        Automobile automobile4 = new Automobile("Lanos", 9000, "14/09/1992", "22/04/2020", GearType.MANUAL, "60%");
        automobileDao.saveAutomobile(automobile3);


        // edit auto
        Automobile automobile1 = new Automobile("Pontiac", 50000, "14/09/1969", "22/04/2021", GearType.MANUAL, "100%");
        automobileDao.updateAutomobile(automobile1, 2);

        // get all
        List<Automobile> auto5 = automobileDao.getAutomobile();
        auto5.forEach(a -> System.out.println(a.getTitle() + " " + a.getPrice() + " " + a.getGear_type()));

        // get by id
        Automobile auto = automobileDao.getAutomobileById(1);
        System.out.println(auto.getTitle());

        // get by title
        System.out.println(
                Arrays.toString(AutomobileDao.getAutomobileByTitle("Lanos").toArray()));

        // get by price
        System.out.println(
                Arrays.toString(AutomobileDao.getAutomobileByPrice(2000, 10000).toArray()));

        // delete by id
        automobileDao.deleteAutomobileById(2);

        // delete all
        automobileDao.deleteAllAutomobile();
    }
}