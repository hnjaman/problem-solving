package code2022;

import java.util.*;

public class Test {
    public static String firstUniqueProduct(String[] products) {
        int count = 0;
        for(String product : products){
            for(int i=0; i<products.length; i++){
                if(product.equalsIgnoreCase(products[i]) && count<2){
                    count = count + 1;
                }
            }
            if(count == 1){
                return product;
            }
            count = 0;
        }
        return "null";
    }

    public static String findNumber(List<Integer> arr, int k) {
        Collections.sort(arr);
        Set<Integer> set = new HashSet<>();
        for (Integer a: arr) {
            if(set.contains(a)){
               return "YES";
            }
            set.add(a);
        }
        return "NO";
    }



    public static void main(String[] args) {
        String text = "dab";
//        String reverse = new StringBuilder(text).reverse().toString();
//        System.out.println(text.equalsIgnoreCase(reverse));

//        HashSet<String> set = new HashSet<>();
//        Map<String, Integer> map = new TreeMap<>();
//        map.put("asd", null);
//        for (Map.Entry<String, Integer> m : map.entrySet()){
//            System.out.println(m.getKey()+"-"+m.getValue());
//        }
//        System.out.println(map);
//        TreeSet<String> set = new TreeSet<>();
//        set.add(null);
//        set.add(null);
//        System.out.println(set);

//        string to char array
        char[] chars = text.toCharArray();

//        char array to string
        String s = new String(chars);

//      array to arraylist
        Integer[] array = {5, 10, 4, 6, 7,2};
        List<Integer> list = Arrays.asList(array);
//        System.out.println(list);

//      list to array
        Integer[] array2 = list.toArray(new Integer[list.size()]);

//        list to set
        Set<Integer> set = new HashSet<>(list);

//        set to list
        List<Integer> list2 = new ArrayList<>(set);
    }
}


//import java.util.*;
//        import java.text.SimpleDateFormat;
//
//public class CarRental {
//    public static Boolean canScheduleAll(Collection<RentalTime> rentalTimes) {
//        return false;
//        //throw new UnsupportedOperationException("Waiting to be implemented.");
//    }
//
//    public static void main(String[] args) throws Exception {
//        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");
//
//        ArrayList<RentalTime> rentalTimes = new ArrayList<RentalTime>();
//        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 19:00"), sdf.parse("03/05/2020 20:30")));
//        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 22:10"), sdf.parse("03/05/2020 22:30")));
//        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 20:30"), sdf.parse("03/05/2020 22:00")));
//
//        System.out.println(CarRental.canScheduleAll(rentalTimes));
//    }
//}
//
//class RentalTime {
//    private Date start, end;
//
//    public RentalTime(Date start, Date end) {
//        this.start = start;
//        this.end = end;
//    }
//
//    public Date getStart() {
//        return this.start;
//    }
//
//    public Date getEnd() {
//        return this.end;
//    }
//}