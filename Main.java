public class Main {
    public static void main(String[] args) {
//1
        int min = 0;
        int max = 0;
        int[] Array =new int[20];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = i;
            if (min>Array[i]){
                min=Array[i];}
            if(max<Array[i]){
                max=Array[i];
            }

        }
        System.out.print(min+" "+max);

        //2
        int number = 15;
        if((number%2)==0){
            System.out.println("Number"+number+"even");}
        else{
            if((number%1)==0){
                System.out.println("Number"+number+"odd");
            }
        }
        //3
        int[] numbers ={4,2,5,9,7,3,4,6,8};
        int min1 = numbers[0];
        int max1 = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(min1>=numbers[i]){
                min1=numbers[i];
            }

            if(max1<=numbers[i]){

                max1=numbers[i];}
            System.out.print(min1+" "+max1);
        }
        //4


        //5

    }

}