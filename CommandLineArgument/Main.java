public class Main {

    public static void main(String[] args) {
	    int i, n = args.length;

	    // Print
	    for (i=0;i<n;i++){
	        System.out.println("args[" + i + "] = " + args[i]);
        }

        //Convert and sum
        int[] values = new int[n];
        int sum = 0;

        for (i=0;i<n;i++){
            values[i] = Integer.valueOf(args[i]);
            sum = sum + values[i];
        }

        float average = sum/n;
        System.out.println("The sum of the arguments is : " + String.valueOf(sum));
        System.out.println("The average of the arguments is : " + String.valueOf(average));

    }
}
