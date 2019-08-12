package arraySort;

import java.util.stream.Stream;

public class PoneEx {
    public static void main(String[] args) {

        Stream<Phone> phoneStream = Stream.of(new Phone("Samsung1", 123), new Phone("Lumia 950", 45000), new Phone("Samsung Galaxy S 6", 40000));
        phoneStream
                .flatMap(p->Stream.of(
                        String.format("название: %s  цена без скидки: %d", p.getName(), p.getPrice()),
                        String.format("название: %s  цена со скидкой: %d", p.getName(), (int)(p.getPrice()*0.9))
                ))
                .forEach(s->System.out.println(s));
//        phoneStream.flatMap(p-> Stream.of(
//                String.format("phone's name: %s  phone's whole price %d ", p.getName(), p.getPrice()),
//                String.format("phone's name: %s  phone's sale price %d ", p.getName(), p.getPrice()*0.9)))
//                        .forEach(s-> System.out.println(s));
//        phoneStream.map(p->"name: " + p.getName() + " price: " + p.getPrice()).forEach(p-> System.out.println(p));
//        phoneStream.filter(p->p.getPrice() < 42000)
//                    .forEach(p->System.out.println(p.getName()));
    }
}

class Phone {
    private String name;
    private int price;

    Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}