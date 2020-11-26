public class Item implements Comparable{
    String name;
    int weight;



    Item(String name,int weight){
        this.name=name;
        this.weight=weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Item compareItem) {
        int compareWeight=((Item)compareItem).getWeight();
        return compareWeight - this.weight;
    }
}

