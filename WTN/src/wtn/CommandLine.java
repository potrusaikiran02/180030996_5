package wtn;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length ==0)
        {
        System.out.println("No Values");
        }
    else{
        for(String i : args)
            System.out.print(i+" , ");   
        }
	}

}