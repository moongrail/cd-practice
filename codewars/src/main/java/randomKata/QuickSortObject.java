package randomKata;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Dog implements Comparable<Dog> {
    private final String nickname;

    public Dog(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return nickname;
    }

    @Override
    public int compareTo(Dog other) {
        return this.nickname.compareToIgnoreCase(other.nickname);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dog) {
            return nickname.equals(((Dog) obj).nickname);
        }

        return false;
    }
}

public class QuickSortObject {
    public static void main(String[] args) {
        List<Dog> unsortedDogs = Stream.of(
                        "Дружок", "Пушок", "Тузик", "Ромео",
                        "Белка", "Стрелка", "Бобик", "Афоня",
                        "Волчок", "Белка")
                .map(Dog::new)
                .collect(Collectors.toList());

        List<Dog> searchDogs = List.of(new Dog("Белка"));
        List<String> results = search(unsortedDogs, searchDogs)
                .map(dogs -> dogs.stream()
                        .map(d -> "А вот и собака по кличке " + d + " нашлась")
                        .collect(Collectors.toList()))
                .orElseGet(() -> searchDogs.stream()
                        .map(d -> "Нет собаки по кличке " + d + " :(")
                        .collect(Collectors.toList()));

        results.forEach(System.out::println);
    }

    private static <T extends Comparable<T>> Optional<List<T>> search(List<T> unsortedList, List<T> searchObjects) {
        List<T> sortedList = quickSort(unsortedList);
        List<T> foundDogs = searchObjects.stream()
                .map(obj -> binarySearch(sortedList, obj))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        return foundDogs.isEmpty() ? Optional.empty() : Optional.of(foundDogs);
    }

    private static <T extends Comparable<T>> List<T> quickSort(List<T> list) {
        if (list.size() <= 1) {
            return list;
        }

        T pivot = list.get(list.size() / 2);
        List<T> less = list.stream().filter(e -> e.compareTo(pivot) < 0).collect(Collectors.toList());
        List<T> equal = list.stream().filter(e -> e.compareTo(pivot) == 0).collect(Collectors.toList());
        List<T> greater = list.stream().filter(e -> e.compareTo(pivot) > 0).collect(Collectors.toList());

        List<T> sorted = quickSort(less);
        sorted.addAll(equal);
        sorted.addAll(quickSort(greater));

        return sorted;
    }

    private static <T extends Comparable<T>> Optional<T> binarySearch(List<T> sortedList, T searchObject) {
        int low = 0;
        int high = sortedList.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            T midElement = sortedList.get(mid);

            if (midElement.equals(searchObject)) {
                return Optional.of(midElement);
            } else if (midElement.compareTo(searchObject) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return Optional.empty();
    }
}

