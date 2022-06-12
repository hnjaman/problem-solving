package code2022.bs23;

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
        String text = "dad";
        String reverseText ="";
//        HashSet<String> set = new HashSet<>();
        Map<String, Integer> map = new TreeMap<>();
        map.put("asd", null);

        System.out.println(map);
//        TreeSet<String> set = new TreeSet<>();
//        set.add(null);
//        set.add(null);
//        System.out.println(set);

//        int[] array = {5,10, 4, 6, 7,2};
//        Arrays.sort(array);
//
//        ArrayList<Integer> result = new ArrayList<>();
//
//        for(int i=0; i<array.length; i++){
//            if(array[i] % 2 == 0){
//                result.add(array[i]);
//            }
//        }
//
//        for(int i=0; i<array.length; i++){
//            if(array[i] % 2 != 0){
//                result.add(array[i]);
//            }
//        }
//
//        System.out.println(result);
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