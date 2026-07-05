    package Hashing;

    import java.util.HashSet;

    public class ContainsDuplicateLeetCode217 {
        public static void main(String[] args) {
            int [] arr = {1,2,3,3,5};
            boolean ans = isDuplicate(arr);
            System.out.println(ans);
        }
        public static boolean isDuplicate(int [] arr){
            if(arr.length<=1) return false;
            HashSet<Integer> set = new HashSet<>();
            for(int num:arr){
                if(set.contains(num)){
                    return true;
                }
                set.add(num);
            }
            return false;
        }
    }
