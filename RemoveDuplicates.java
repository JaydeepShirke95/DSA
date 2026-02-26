public static int RemoveDuplicates(int arr[], int n){
    if (n == 0 || n == 1) {
        return n;
    }
    Arrays.sort(arr);  
    int[] temp = new int[n];
    int i = 0, j = 0;
    temp[j++] = arr[i++];
    for ( ; i < n - 1; i++) {
        if (arr[i] != arr[i-1]) {
            temp[j++] = arr[i];
        }
    }
    for (i = 0; i < j; i++) {
        arr[i] = temp[i];
    }
    return j;
}
