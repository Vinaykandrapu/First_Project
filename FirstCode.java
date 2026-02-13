import java.util.HashMap;

class Main{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,1,3,5,3,2,1,3,5};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.println(map);
    }
}