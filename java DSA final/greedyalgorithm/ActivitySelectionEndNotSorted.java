package greedyalgorithm;
import java.util.*;

public class ActivitySelectionEndNotSorted {
    public static void main(String []a){
        int start[] ={1,3,0,5,8,5};
        int end[]= {2,4,6,7,9,9};
        //sorting 
        int activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];   
        }
    
        // // lamda function -> shortform
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));
       
        int maxAct=0;
    ArrayList<Integer> ans  = new ArrayList<>();
    maxAct=1;
    ans.add(0);
    int lastEnd=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
    
            }
        }
    System.out.println("max Activites= "+ maxAct);
    
    for(int i=0;i<ans.size();i++){
        System.out.println("A"+ans.get(i)+" ");
    }
    System.out.println(
        
    );
       } 

}
