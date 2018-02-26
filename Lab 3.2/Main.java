
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
//import EquipManager;

public class Main {

    public static void main(String[] args) {

        //Collections.sort(.getAccommodationList(), new SalesManager.SortByPriceComparator());
        //System.out.println(salesManager.getAccommodationList());

        Boat boat = new Boat("USA", 200, 5, 4, 2, 6 );
        Helmet helmet = new Helmet("Uvex", 10, SportType.MOUNTAINBIKE, 2);
        Bike bike = new Bike("Haro", 122, SportType.MOUNTAINBIKE, 4, 2);
        Bike bike1 = new Bike ("Bergamount", 128 , SportType.MOUNTAINBIKE, 18 , 2);
        Helmet helmet1 = new Helmet("Abus",  2, SportType.MOUNTAINBIKE, 2);


        List<Equipment> list = new LinkedList<Equipment>();

        list.add(helmet);
        list.add(bike);
        list.add(boat);
        list.add(bike1);
        list.add(helmet1);

        EquipManager equipManager = new EquipManager(list);

        boolean menu = true;

        do {
            System.out.println("Menu");
            System.out.println(" 1 - Print list of equipment;");
            System.out.println(" 2 - Search by type of sport;");
            System.out.println(" 3 - Print list of equipment sorted by weight");
            System.out.println(" 4 - Exit;");

            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            switch (num) {
                case 1: {
                    equipManager.printList();
                    break;
                }
                case 2: {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the type: ");
                    String type = scanner.nextLine();
                    System.out.println(equipManager.findBySportType(type));
                    break;
                }
                case 3: {
                    System.out.println(equipManager.sortByWeight(list));
                    break;
                }
                case 4:
                default: {
                    System.out.println("Exit...");
                    menu = false;
                    break;
                }
            }
        } while (menu);

    }
}
