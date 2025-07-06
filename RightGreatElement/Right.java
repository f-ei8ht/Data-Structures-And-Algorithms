package RightGreatElement;

public class Right {
    public static int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int max = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            max = arr[i + 1];
            for(int j = i + 2; j < arr.length; j++) {
                if(max < arr[j]) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
    public static void main (String[] args) {
        int[] array = {57010,40840,69871,14425,70605};
        int[] result = replaceElements(array);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}