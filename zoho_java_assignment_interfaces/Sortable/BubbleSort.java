public class BubbleSort implements Sortable{
    @Override
    public void sort(int[] arr) {    
        int n = arr.length;    
        int temp = 0;    
        for(int i=0; i < n; i++)    
            for(int j=1; j < (n-i); j++)  
                if(arr[j-1] > arr[j]) {    
                    temp = arr[j-1];    
                    arr[j-1] = arr[j];    
                    arr[j] = temp;    
                }          
    }  
    @Override
    public String sortName() {
        return "Bubble sort";
    }  
}
