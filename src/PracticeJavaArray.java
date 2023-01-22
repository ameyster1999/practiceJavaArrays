import java.util.Arrays;

public class PracticeJavaArray {
    public static Integer findSecondSmallestWithSort(int[]arr){
        if(arr.length<=1){
            return null;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
        if (arr[i]!=arr[i+1]){
            return arr[i+1];
        }

        }
        return 0;

    }
public static Integer findSecondSmallest(int[]arr){
    int smallest= Integer.MAX_VALUE;
    int secondSmallest=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<smallest){
            secondSmallest = smallest;
            smallest =arr[i];
        }
        else if (arr[i] < secondSmallest) {
            secondSmallest = arr[i];
        }

    }
    return secondSmallest;

}
    public static void main(String[] args) {

        System.out.println(findSecondSmallest(new int[]{1, 18, 15, 16}));
        System.out.println(findSecondSmallestWithSort(new int[]{1, 18, 15, 16}));
    }
}
//{1,5,4}
//travese 1,5,4
//smallest=100
//secondsmallest=100
//In first travest
//1<100?smallest =1
//In second Traversal
//5<1 ?false next check 5<100 true second smallest =5
//In Third traversal
//4<1?false next 4<5 true secondSmallest=4
//end of array
//secondSmallest is 4;

