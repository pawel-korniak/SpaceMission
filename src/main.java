import java.util.ArrayList;

public class main {
    public static void main(String [] args) throws Exception{
        Simulation symulate = new Simulation();
        ArrayList<Item> itemsList = new ArrayList();
        ArrayList<U1> uRocketList = new ArrayList();
        itemsList= symulate.loadItems();
        for(int i=0;i< itemsList.size();i++){   //checking if list is full of items
            Item item = new Item();
            item = itemsList.get(i);
            System.out.println(item.name+" = "+item.weight);
        }
        uRocketList = symulate.loadU1(itemsList);

        for(int i=0;i< itemsList.size();i++){   //checking if list is full of items
            Item item = new Item();
            item = itemsList.get(i);
            System.out.println(item.name+" = "+item.weight);
        }
        for(int i=0;i< uRocketList.size();i++){   //checking if list is full of items
            U1 uRocket = new U1();
            uRocket = uRocketList.get(i);
            System.out.println(uRocket.carry);
        }

    }
}
