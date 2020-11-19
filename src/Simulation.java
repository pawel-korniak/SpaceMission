import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {


    ArrayList loadItems() throws FileNotFoundException {
        ArrayList itemsList;
        itemsList = new ArrayList();
        File file1 = new File("phase-1.txt");
        Scanner scanner = new Scanner(file1);
            while(scanner.hasNextLine()){
            String line= scanner.nextLine();
            String [] arrOfStr = line.split("=",2) ;

            int number = Integer.parseInt(arrOfStr[1]);
            Item item = new Item(arrOfStr[0],number );
            itemsList.add(item);
            }
        return itemsList;
        }



    }

