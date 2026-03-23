class Main {
    void sortInWave(int arr[]){
        int n = arr.length;
        //https://www.geeksforgeeks.org/dsa/sort-array-wave-form-2/ swap adjacent elements
        for (int i=0; i<n-1; i += 2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String args[]){
        GfG ob = new GfG();
        int arr[] = {1, 2, 3, 4, 5};
        ob.sortInWave(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
