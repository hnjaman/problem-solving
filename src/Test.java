import java.util.*;
import java.util.stream.Collectors;
public class Test {
    public static void main(String[] args) {

        String string = "com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException: Duplicate entry '-1216283711' for key 'unique_key'";
        if(string.contains("Duplicate entry")){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

////        String S = "ABDAC";
////        int[] X = new int[]{2,-1,-4,3,-3};
////        int[] Y = new int[]{2,-2,4,-3,1};
//        String S = "ABB";
//        int[] X = new int[]{1, -2, -2};
//        int[] Y = new int[]{1, -2, 2};
//
////        String S = "CCD";
////        int[] X = new int[]{1, -1, 2};
////        int[] Y = new int[]{1, -1, -2};
////        S = "CCD", X = [1, -1, 2] and Y = [1, -1, -2]
//
//        Map<Character, ArrayList<Integer>> visit = new HashMap<>();
//
//        char duplicate = 0;
//        for(int i=0; i<S.length(); i++){
//            char ch = S.charAt(i);
//            if(visit.containsKey(ch)){
//                duplicate = ch;
//                ArrayList<Integer> arrayList = visit.get(ch);
//                int f2 = Math.abs(X[i]) + Math.abs(Y[i]);
//                int f1 = Math.abs(arrayList.get(0)) + Math.abs(arrayList.get(1));
//                if(f1 < f2){
//                    continue;
//                } else if(f1 == f2){
//                    visit.remove(ch);
//                } else {
//                    ArrayList<Integer> dArrayList = new ArrayList<>();
//                    dArrayList.add(X[i]);
//                    dArrayList.add(Y[i]);
//                    visit.put(ch, dArrayList);
//                }
//            } else {
//                ArrayList<Integer> arrayList = new ArrayList<>();
//                arrayList.add(X[i]);
//                arrayList.add(Y[i]);
//                visit.put(ch, arrayList);
//            }
//        }
//
//        int size=0;
//        if(visit.containsKey(duplicate)){
//            ArrayList<Integer> arrayList = visit.get(duplicate);
//            int base = Math.abs(arrayList.get(0)) + Math.abs(arrayList.get(1));
//            int sixe = visit.size();
//            visit.remove(duplicate);
//
//            for(Map.Entry<Character, ArrayList<Integer>> characterArrayListEntry : visit.entrySet()){
//                ArrayList<Integer> nArrayList = visit.get(characterArrayListEntry.getKey());
//                int check = Math.abs(nArrayList.get(0)) + Math.abs(nArrayList.get(1));
//                if(check > base){
//                    size--;
//                }
//            }
//            System.out.println(duplicate);
//            System.out.println(size);
//        }
//
//        System.out.println(visit);
//        System.out.println(duplicate);
//        System.out.println(size);


//        for(int i = 0; i<nums.length-1; i++){
//            if(nums[i] == nums[i+1]){
//                flag = i;
//                break;
//            } else if(nums[i] > nums[i+1]){
//                if(!found1){
//                    found1 = true;
//                } else {
//                    flag = i;
//                    break;
//                }
//            } else {
//                if(!found2){
//                    found2 = true;
//                } else {
//                    flag = i;
//                    break;
//                }
//            }
//        }

//
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
//        System.out.println(nums[3]);


//        int sumOfSet = 0, sumOfNums = 0;
//        Set<Integer> set = new HashSet();
//
//        for (int num : nums) {
//            if (!set.contains(num)) {
//                set.add(num);
//                sumOfSet += num;
//            }
//            sumOfNums += num;
//        }
//        System.out.println(2 * sumOfSet - sumOfNums);

//        String s1 = new String("abc");
//        String s2 = new String(s1);
//        String s3 = s2;
//        String s4 = "abc";
//
//        if(s1 == s2)
//            System.out.println("true");
//        else
//            System.out.println("false");
//
//        if(s2 == s3)
//            System.out.println("true");
//        else
//            System.out.println("false");
//
//        if(s3 == s4)
//            System.out.println("true");
//        else
//            System.out.println("false");

//        String[] arr = new String[]{"A","B","C","D","A","E","D","Z"};
//        LinkedList<String> result = new LinkedList<>();
//        for(int i=0; i<arr.length; i++){
//            if(result.size()==5 && !result.contains(arr[i])){
//                result.removeFirst();
//                result.add(arr[i]);
//            } else {
//                if(result.contains(arr[i])){
//                    result.remove(arr[i]);
//                    result.add(arr[i]);
//                } else {
//                    result.add(arr[i]);
//                }
//            }
//        }
//        StringJoiner resultjoin = new StringJoiner("-");
//        for (String r : result) {
//            resultjoin.add(r);
//        }
//        System.out.println(resultjoin.toString());

//        System.out.println("hello");
//        int[] nums = {2,5,1,6,3,4,7,6};
//                    //2,3,5,4,1,7,6,
//        int[] result = new int[nums.length];
//
//        for(int i = 0; i < 4; i++){
//            result[i+i] = nums[i];
//            result[i+i+1] = nums[i+4];
//        }
//        System.out.println(result[0]);
//        System.out.println(result[1]);
//        System.out.println(result[2]);
//        System.out.println(result[3]);
//        System.out.println(result[4]);
//        System.out.println(result[5]);
//        System.out.println(result[6]);
//        System.out.println(result[7]);




//        List names = new ArrayList<>();
//        names.add("baker");
//        names.add(2);
//        names.add("daker");
//        names.add("maker");
//        System.out.print(names.get(0) instanceof Object);
//        System.out.print(names.get(1) instanceof Integer);
//        Collections.sort(names);
//        List<String> names2 = names.stream()
//                .sorted((s1, s2) -> s1.compareTo(s2))
//                .collect(Collectors.toList());
//        names.sort(Comparator.comparing(String::toString));
//        System.out.println(names);
//        System.out.println("apple".compareTo("applee"));
//        Integer a = new Integer(3);
//        Integer b = new Integer(3);
//
//        if (a.equals(b)){
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//
//
//        Stack<String> stack = new Stack<>();
//        Queue<String> queue = new LinkedList<>();
//
//        stack.push("hasan");
//        stack.push("noor");
//        stack.push("jaman");
//        System.out.println(stack);
////        stack.pop();
////        System.out.println(stack);
//        queue.add(stack.pop());
//        System.out.println("stack -"+stack);
//        System.out.println("queue -"+queue);
//        stack.push("sujon");
//        queue.add("sujon");
//        System.out.println("--------------");
//        System.out.println("stack -"+stack);
//        System.out.println("queue -"+queue);
//        stack.push(queue.remove());
//        System.out.println("stack -"+stack);
//        System.out.println("queue -"+queue);
    }

    static Exception print(int i){
        if (i>0) {
            System.out.println("if");
            return new Exception();
        } else {
            throw new RuntimeException();
        }
    }
}
