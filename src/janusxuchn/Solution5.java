package janusxuchn;

import java.util.ArrayList;
import java.util.Collections;

public class Solution5 {
	/**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here
        
        ArrayList<ArrayList<Integer>> list=new  ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<numbers.length-2;i++){
            for(int j=i+1;j<numbers.length-1;j++){
                for(int k=j+1;k<numbers.length;k++){
                    if(numbers[i]+numbers[j]+numbers[k]==0){
                         ArrayList<Integer> arr=new  ArrayList<Integer>(3);
                         arr.add(numbers[i]);
                         arr.add(numbers[j]);
                         arr.add(numbers[k]);
                         list.add(arr);
                         break;
                    }
                }
            }
        }
        
        for(int i=0;i<list.size();i++){
            ArrayList<Integer> arr=list.get(i);
            Collections.sort(arr);
        }
        
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if((list.get(i).get(0).intValue()==list.get(j).get(0).intValue())&&(list.get(i).get(1).intValue()==list.get(j).get(1).intValue())){
                    list.remove(j);
                    j--;
                }
            }
        }
        
        return list;
    }
}
