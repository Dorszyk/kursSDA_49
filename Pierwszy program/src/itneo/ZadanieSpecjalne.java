package itneo;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ZadanieSpecjalne {

    public static void main(String[] args) {

        int[] findNumber = new int[]{1, 2, 3, 4, 6, 8, 9, 9};
        System.out.println(findNumber);


    }

    private List<Integer> findNumber(int[] array){
        Set<Integer> arraySet = Arrays.stream(array).boxed().collect(Collectors.toSet());
        int max = arraySet.stream().max(Integer::compare).get();
        List<Integer> foundNumbers = IntStream.range(1, max)
                .boxed()
                .filter(number -> !arraySet.contains(number))
                .collect(Collectors.toList());
        return foundNumbers.isEmpty() ? Collections.singletonList(-1) : foundNumbers;
    }
    private List<Integer> findMissingNumber(int[] array){
        List<Integer> foundNumbers = new ArrayList<>();
        for(int number=0; number < maxInArray(array); number++){
            if(isNotExist(number, array)){
                foundNumbers.add(number);
            }
        }
        return foundNumbers.isEmpty() ? Collections.singletonList(-1) : foundNumbers;
    }

    private int maxInArray(int[] array){
        int max = 1;
        for(int i =0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    private boolean isNotExist(int number, int[] array){
        for(int i=0; i<array.length; i++){
            if(array[i] != number){
                return true;
            }
        }
        return false;
    }


}
