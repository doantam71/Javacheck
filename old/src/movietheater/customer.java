package movietheater;

public class customer {
    int id;
    String name;
    String phone;
    int money;

    int slot;
 //   int total = money * slot;

    public customer(){

    }
    public customer(int id, String name, String phone, int money, int slot) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.money = money;
        this.slot = slot;
    }

    public int getid(){
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMoney(){
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public int getSlot(){
        return slot;
    }
    public void setSlot(int slot) {
        this.slot = slot;
    }
}
