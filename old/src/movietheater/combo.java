package movietheater;

public class combo {
    int id;
    String nameCombo;
    int count;
    int price;

    public combo(){

    }
    public combo(int id, String nameCombo, int count, int price) {
        this.id = id;
        this.nameCombo = nameCombo;
        this.count = count;
        this.price = price;
    }

    public int getid(){
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }

    public int getCount(){
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
