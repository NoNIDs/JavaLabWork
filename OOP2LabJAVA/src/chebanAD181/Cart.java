package chebanAD181;

public class Cart {
    private int arrSize; //размер корзины
    private Item [] arr; //массив хранящий добавленные элементы
    private int top=-1; //переменная для публичных методов

    //конструктор
    public Cart(int arrSize){
        this.arrSize=arrSize;
        arr=new Item[this.arrSize];
    }
    //Метод изменения цены
    public void changePrise(int number, float percent){
        if(number==1){
            for(int i=0;i<arrSize;i++){
                arr[i].UpPercent(percent);
            }
        }else{
            for (int i=0;i<arrSize;i++){
                arr[i].DownPercent(percent);
            }
        }
    }
    //Методы которые используются для реализации стека
    public void addItem(Item element){
        if(!isFool()){
            arr[++top]=element;
        }
    }
    //публичные методы
    public Item delItem(){
        return arr[top--];
    }
    public Item readTop(){
        return arr[top];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFool(){
        return (top==arrSize-1);
    }
    //Метод для подсчета суммы цен всех товаров
    public float Sum(){
        float  sum=0;
        for(int i=0;i<arrSize;i++){
            sum+=arr[i].GetCost();
        }
        return sum;
    }
    //Метод для вывода информации о стеке
    public void getInfo(){
        for (int i=0;i<arrSize;i++){
            System.out.println("Имя товара: "+arr[i].GetName());
            System.out.println("Стоимость товара: "+arr[i].GetCost());
        }
    }
}
