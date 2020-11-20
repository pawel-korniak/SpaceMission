import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {


    ArrayList loadItems(int phase) throws FileNotFoundException {
        ArrayList itemsList;
        itemsList = new ArrayList();
        String src;
        if(phase == 1){
            src = "phase-1.txt";
        }else {
            src = "phase-2.txt";
        }
        File file1 = new File(src);
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
    ArrayList loadU1(ArrayList<Item> itemsList){
        ArrayList uRocketList = new ArrayList();
        while(itemsList.size()>0){
            U1 uRocket = new U1();

            int i=0;
            while((uRocket.carry < uRocket.carryLimit)&&(i< itemsList.size())) {


                if (uRocket.canCarry(itemsList.get(i))) {
                    uRocket.carry(itemsList.get(i));
                    itemsList.remove(i);
                } else i++;

            }
            uRocketList.add(uRocket);
        }

        return uRocketList;
    }

    ArrayList loadU2(ArrayList<Item> itemsList){
        ArrayList uRocketList = new ArrayList();
        while(itemsList.size()>0){
            U2 uRocket = new U2();

            int i=0;
            while((uRocket.carry < uRocket.carryLimit)&&(i< itemsList.size())) {


                if (uRocket.canCarry(itemsList.get(i))) {
                    uRocket.carry(itemsList.get(i));
                    itemsList.remove(i);
                } else i++;

            }
            uRocketList.add(uRocket);
        }

        return uRocketList;
    }

int runSimulation(ArrayList<Rocket> uRocketList){
        int budget=0;
        for(Rocket uRocket : uRocketList){
            do{
                budget += uRocket.cost;
            } while ((!(uRocket.launch()&&uRocket.land())));
        }
        return budget;
}

}

