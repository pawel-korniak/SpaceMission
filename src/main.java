import java.util.ArrayList;

public class main {
    public static void main(String [] args) throws Exception{
        Simulation symulate = new Simulation();
        ArrayList<Item> itemsList = new ArrayList();

        //Collections.sort(itemsList); // sorting in future

        ArrayList<Rocket> uRocketList = new ArrayList();
        itemsList= symulate.loadItems(1);
        for(int i=0;i< itemsList.size();i++){   //checking if list is full of items
            Item item = new Item();
            item = itemsList.get(i);
            System.out.println(item.name+" = "+item.weight);
        }
        uRocketList = symulate.loadU2(itemsList);

        for(int i=0;i< itemsList.size();i++){   //checking if list is full of items
            Item item = new Item();
            item = itemsList.get(i);
            System.out.println(item.name+" ==== "+item.weight);
        }
        for(int i=0;i< uRocketList.size();i++){   //checking load of each rocket
            Rocket uRocket = new Rocket();
            uRocket = uRocketList.get(i);
            System.out.println(uRocket.carry);
        }

        System.out.println(symulate.runSimulation(uRocketList));

    }
}
