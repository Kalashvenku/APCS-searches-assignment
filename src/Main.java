public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4};
        System.out.println(indexOf(2, arr));
    }

    //    public static int indexOf(int target, int[] arr) {
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] == target)return i;
//        }
//        return -1;
//    }
//    public static int indexOf(int target, int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//        int mid;
//        while (right - left >= 0){
//            mid = (left + right) / 2;
//            if (target == arr[mid]){
//                return mid;
//            }else if(target > arr[mid]){
//                left = mid + 1;
//            }else{
//                right = mid - 1;
//            }
//        }
//        return -1;
//    }
    public static int indexOf(int target, int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;
        if (target == arr[mid]){return mid;}
        else if(target > arr[mid]){left = mid + 1;}
        else{right = mid - 1;}
        if (right - left < 0){return -1;}
        return indexOf(target, arr, left, right);
    }
    public static int indexOf(int target, int[] arr, int left, int right){
        int mid = (left + right) / 2;
        if (target == arr[mid]){return mid;}
        else if(target > arr[mid]){left = mid + 1;}
        else{right = mid - 1;}
        if (right - left < 0){return -1;}
        return indexOf(target, arr, left, right);
    }
}