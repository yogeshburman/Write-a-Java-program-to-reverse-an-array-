// Write a Java program to reverse an array ?
class Test {
  public static void main(String [] args){
    
    System.out.println("Reverse array");
    
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    int temp;
    
    // reversing array elements
    for(int i=0;i<arr.length/2;i++){
    
    temp=arr[i];
    arr[i]=arr[arr.length-1-i];
    arr[arr.length-1-i]=temp;
    
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
  }
}