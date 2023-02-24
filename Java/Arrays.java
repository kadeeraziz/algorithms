package Java;
class Arrays{

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }



        // Add a new element to an array.
        int new_element = 11;
        int[] new_numbers = new int[numbers.length + 1];
        for(int i=0; i < numbers.length; i++){
            new_numbers[i] = numbers[i];
        }

        new_numbers[new_numbers.length-1] = new_element;

        for(int i=0; i < new_numbers.length; i++){
            System.out.println(new_numbers[i]);
        }

     
    }
    

}