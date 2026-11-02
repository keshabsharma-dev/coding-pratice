// Strictly Greater than next previous element;
// I/P: [7,2,8,9,5]
// O/P: 3
public class StrictlyGreater {
    public int strictGreater(int[] arr){
        int n = arr.length;
        int count = 1;
        for(int i = 0; i<n-1; i++){
            if(arr[i]<arr[i+1]) {
                count++;
            }
        }
        return count;
    }

    static void main() {
        int[] arr = {7,2,8,9,5};
        StrictlyGreater obj  = new StrictlyGreater();
        System.out.println("the count of strictly greater numbers in array: "+obj.strictGreater(arr));
    }
}

// DRY RUN
/*  arr = [7,2,8,9,5]
n<5    i     i+1   condition i<i+1   count=1
0    7     2         false           1
1    2     8         true            2
2    8     9         true            3
3    9     5         false           3


 */