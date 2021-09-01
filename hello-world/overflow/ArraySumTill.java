package overflow;

import java.util.*;

import static java.util.Collections.addAll;

public class ArraySumTill {
    public static void main(String[] args) {

       // array
        int arr[] = {2,4,3,1,5};    // array litarel
        int arr3[] = {3,5,7};
        Integer inte=0;

        String pass = new String("password");
        char[] charPwd = new char[] {'p','a','s','s','w','o','r','d'};

        System.out.println("String password: " + pass );
        System.out.println("Character password: " + charPwd );

        if(inte instanceof Object){
            System.out.println("array is instanceof object");
        }

        Integer fullarr[] = new Integer[arr.length+arr3.length];
        for(int i=0;i<arr.length;i++){
            fullarr[i]=arr[i];
        }
        for(int j=0; j<arr3.length; j++){
            fullarr[arr.length+j]=arr3[j];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(fullarr));

        Arrays.sort(fullarr);
        System.out.println(Arrays.toString(fullarr));

        // remove array duplicates using set

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        System.out.println("set "+set);

        // collections
        ArrayList<Integer> arr2 = new ArrayList<> (Arrays.asList(7,5,8,6,9));

        for (int a : arr) {
            arr2.add(a);
        }

        System.out.println(arr2);
        Collections.sort(arr2);
        System.out.println(arr2);

        // queue
        Queue<Integer> q = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to queue
        for (int i=0; i<5; i++)
            q.add(i);

        // Display contents of the queue.
        System.out.println("Elements of queue-"+q);

        // To remove the head of queue.
        int removedele = q.remove();
        System.out.println("removed element-" + removedele);

        System.out.println(q);

        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-" + head);
        int tail=((LinkedList<Integer>) q).peekLast();
        System.out.println(tail);

        // Rest all methods of collection interface,
        // Like size and contains can be used with this
        // implementation.
        int size = q.size();
        System.out.println("Size of queue-" + size);

        // map

        Map<String, Integer> m1 = new HashMap<>();
        m1.put("a", 1);
        m1.put("b", 2);
        Map<String, Integer> m2 = new HashMap<>();
        m2.put("a", 3);
        m2.put("c", 10);

        System.out.println(m1);
        System.out.println(m2);

        //iterate over second map and merge its elements into map 1 using
        //same key and sum of values
        m2.forEach((k, v) -> m1.merge(k, v, Integer::sum));

        System.out.println("===========");
        System.out.println(m1);

    }
}
