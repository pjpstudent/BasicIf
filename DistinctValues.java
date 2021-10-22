public class DistinctValues{
    public static void main(String[] args){
    
        int numero1 = Integer.parseInt(args[0]);
        int numero2 = Integer.parseInt(args[1]);
        int numero3 = Integer.parseInt(args[2]);
        
        if(numero1 == numero2 && numero1 == numero3){
        	System.out.println("1");
	}
        else if(numero1 == numero2 || numero2 == numero3 || numero1 == numero3){
            System.out.println("2");
            }
        else{
            System.out.println("3");
    	}
    }
}
