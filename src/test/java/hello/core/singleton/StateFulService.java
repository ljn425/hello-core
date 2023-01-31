package hello.core.singleton;

public class StateFulService {
    //private int price;

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        //this.price = price; // price 변수를 공유하는 문제 발생 따라서 지역변수를 활용하자
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
