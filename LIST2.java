import java.util.*;
public class LIST2
{
    public static void main(String[] args) 
    {

        List<List<Integer>> lists = Arrays.asList(Arrays.asList(1, 2, 3),
                                        Arrays.asList(4, 5, 6),
                                        Arrays.asList(6, 7, 8));
 
        lists.forEach(System.out::println);
    }
}