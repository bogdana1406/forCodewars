package arraySort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreameEx {
    public static void main(String[] args) {
        int[] arr = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        IntStream intStream = Arrays.stream(arr);
        intStream.filter(i -> i>3).forEach(s-> System.out.println(s));
//        long count = IntStream.of(arr).filter(w -> w >= 0).count();
//        System.out.println(count);

        List<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Paris", "London", "Moscow", "Poltava");
        Stream<String> streamCities = cities.stream();
        streamCities = streamCities.filter(s->s.length() > 6);
        streamCities.forEach(s-> System.out.println(s));
//
//        cities.stream()
//                .filter(s->s.length() < 7)
//                .forEach(s-> System.out.println(s));
        Stream<String> citiesStream = Stream.of("Paris", "London", "Moscow", "Poltava");
    }
}
