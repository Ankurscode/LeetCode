public class FinalValueofVariableAfterPerformingOperations {
    public static int finalValueAfterOperations(String[] operations) {
       int sum=0;
       for (int i = 0; i < operations.length; i++) {
        if("X++".equals(operations[i])|| "X++".equals(operations[i])){
            sum+=1;
        }
        else if("X--".equals(operations[i])||"--X".equals(operations[i]))
        {
            sum-=1;
        }

    }
    return sum;
}

    public static void main(String[] args) {
       String [] operations = {"--X","X++","X++"};
       int result=finalValueAfterOperations(operations);
       System.out.println(result
       );
    }
}
