package Java;

class Arrays{

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("Using for-each loop");

        for(int i: numbers){
            System.out.println(i);
        }
    }
    

}