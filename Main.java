class Main {
  public static void main(String[] args) {
    Person person1 = new Person("山田", "太郎", 27, 1.6, 50.0);
    Person person2 = new Person("山田", "Christopher", "二郎", 65, 1.75, 80.0);
    
    Car car = new Car("ランボルギーニ", "ホワイト");
    Bicycle bicycle = new Bicycle("ブリヂストン", "シルバー");
    
    person1.buy(car);
    person2.buy(bicycle);
    
    System.out.println("【車情報】");
    car.printData();
    System.out.println("-----------------");
    System.out.println("【車の所有者の情報】");
    car.getOwner().printData();
    
    System.out.println("=================");
    System.out.println("【自転車情報】");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.println("【自転車の所有者の情報】");
    bicycle.getOwner().printData();
  }
}