import java.util.*;

class Q1{
    public static void main(String[] args){
        
        int nums[] = {1,2,2,1,3};
	    
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int x: nums){
            mpp.put(x, mpp.getOrDefault(x, 0) + 1);
        }

        List<List<Integer>> result = new ArrayList<>();

        mpp.forEach((key, value) -> {
            result.add(Arrays.asList(key, value));
        });
        System.out.print("[ ");
        for(List<Integer> pair: result){
            int key = pair.get(0);
            int count = pair.get(1);
            System.out.print("["+key+" "+count+"]");
        }
        System.out.print(" ]");
    }    
}
