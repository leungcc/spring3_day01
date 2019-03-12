package cn.itcast.spring3.demo5;

//构造器注入
public class Car2 {
    private String name;
    private Double price;

    public Car2() {
        super();
    }

    public Car2(String name, Double price) {
        super();
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", price=" + price + "]";
    }

}
