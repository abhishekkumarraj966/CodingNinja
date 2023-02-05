public class LastIndexOfaNumber {
   /*
     Given an array of length N and an integer x, 
    you need to find and return the last index of integer 
    x present in the array. Return -1 if it is not present in the array.
    Last index means - if x is present multiple times in the array, 
    return the index at which x comes last in the array.
    You should start traversing your array from 0, not from (N - 1).
    Do this recursively. Indexing in the array starts from 0.
    */
    public static int lastIndex(int input[], int x) {
        // base case
      if(input.length == 0){
          return -1;
      }
      int subarr[] = new int[input.length -1];
      for (int i = 1; i < input.length; i++) {
          subarr[i-1] = input[i];
      } 

      int li = lastIndex(subarr, x);
      if(li != -1){
          return li+1;
      }else{
          if (input[0] == x) {
              return 0;
          }else{
              return -1;
          }
      }
}
}
