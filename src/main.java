import java.util.ArrayList;

public class main {
    public static void main(String [] args) throws Exception{
        Simulation symulate = new Simulation();
        ArrayList<Item> itemsList = new ArrayList();
        itemsList= symulate.loadItems();

        /*
        for(int i=0;i< itemsList.size();i++){   //checking if list is full of items
            Item item = new Item();
            item = itemsList.get(i);
            System.out.println(item.name+" = "+item.weight);
        }*/
    }
}
