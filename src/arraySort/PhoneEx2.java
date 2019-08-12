package arraySort;

import java.util.Comparator;
import java.util.stream.Stream;

public class PhoneEx2 {
    public static void main(String[] args) {
        Stream<Phone2> streamPhone = Stream.of(new Phone2("iPhone X", "Apple", 600),
                new Phone2("Pixel 2", "Google", 500),
                new Phone2("iPhone 8", "Apple",450),
                new Phone2("Nokia 9", "HMD Global",150),
                new Phone2("Galaxy S9", "Samsung", 300));
        streamPhone.sorted(new PhoneComparator())
                .forEach(p-> System.out.printf("%s (%s) - %d \n", p.getName(), p.getCompany(), p.getPrise()));

    }
}
 class Phone2 {
    private String name;
    private String company;
    private int prise;

     public Phone2(String name, String company, int prise) {
         this.name = name;
         this.company = company;
         this.prise = prise;
     }

     public int getPrise() {
         return this.prise;
     }

     public String getName() {
         return name;
     }

     public String getCompany() {
         return company;
     }
 }

 class PhoneComparator implements Comparator<Phone2> {

     @Override
     public int compare(Phone2 a, Phone2 b) {
         return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
     }
 }