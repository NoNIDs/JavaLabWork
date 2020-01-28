package chebanAD181;

public class Item {
    float cost;
    String name;

    Item(float cost, String name) {
        if (cost < 0) this.cost = 0;
        else this.cost = cost;
        this.name = name;
    }
    Item () {}

    //Метод для снижения цены на определенный процент
    public void DownPercent(float percent) {
        SetCost(GetCost() - (percent * (GetCost() / 100)));
    }
    //Метод для повышения цены на определенный процент
    public void UpPercent(float percent) {
        SetCost((percent * (GetCost() / 100)) + GetCost());
    }
    //гетеры и сетеры
    public float GetCost(){return cost;}
    public String GetName(){return name;}
    public void SetName(String name){ this.name=name; }
    public void SetCost(float cost){
        if (cost < 0) this.cost = 0;
        else this.cost = cost;
    }
}
