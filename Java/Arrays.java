package Java;
class Arrays{

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int [] new_numbers2 = insertElementAnywhere(numbers, 5, 11);
        for(int i=0; i < new_numbers2.length; i++){
            System.out.println(new_numbers2[i]);
        }

        System.out.println(" --------------------------------- ");
        int [] new_numbers3 = deleteElement(numbers, 5); 
        for(int i=0; i < new_numbers3.length; i++){
            System.out.println(new_numbers3[i]);
        }
     
    }

    public static int [] insertElementAnywhere(int [] originalArray, int position, int element){
        
        // check if position is less than the length of array length
        int originalLength = originalArray.length;
        
        if (position > originalLength-1){
            // return an empty array
            System.out.println("Position is greater than the length of the array");
            return new int[0];
        }


        // create a new array with length + 1
        int [] newArray = new int[originalLength + 1];

        // copy the elements until the position
        for(int i=0; i<position; i++){
            newArray[i] = originalArray[i];
        }

        // insert the element
        newArray[position] = element;

        // copy the remaining elements

        for(int i=position; i<originalLength; i++){
            newArray[i+1] = originalArray[i];
        }

        return newArray;

    }

    // method to delete an element from an array
    public static int [] deleteElement(int [] originalArray, int position){
        // check if position is less than the length of array length
        int originalLength = originalArray.length;
        
        if (position > originalLength-1){
            // return an empty array
            System.out.println("Position is greater than the length of the array");
            return new int[0];
        }

        // create a new array with length - 1
        int [] newArray = new int[originalLength - 1];

        // copy the elements until the position
        for(int i=0; i<position; i++){
            newArray[i] = originalArray[i];
        }

        // copy the remaining elements

        for(int i=position; i<originalLength-1; i++){
            newArray[i] = originalArray[i+1];
        }

        return newArray;
    }
    

}