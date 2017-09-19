package BitwiseLogical;

public class BitwiselogicalAND {
	//public is a Java keyword which declares a member's access as public.
	//class can be defined as a template that describes the state that the object of its type support.
	//LogiaclBitwise is class name. Java is case in-sensitive which means identifier Hello and hello would different meaning in Java	
	public static void main(String[] args) {
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		// TODO Auto-generated method stub
		//* first to check  Logical "And" operator
        System. out .println( "Logical AND Operator" );
      //system : system is a class in java language.lang package
      		//out : out is the static member of system class.It's type PrintStream
      		//println: which is used to print the output.
            //Inside the brackets is value which to be printed.
            //to initialize values we have take the variables
        int p =10;
        //declaring a  value to the integer and p holds the value 10(1010)  
		int q =20;
		//declaring a  value to the integer and p holds the value 20(10100)
		int r =30;
		//declaring a  value to the integer and p holds the value 30(11110)
		int s =40;
		//declaring a  value to the integer and p holds the value 40(101000)
		boolean ans = q>p && q<r && r<s;
		//boolean declare the value is true or false only. By default the boolean primitive type is false
        //here q is greater than p, and q is less than r, and r is less than s,here exp1,exp2 and exp3 are true so  the statement it is true
		//true so the statement it is true
		System.out.println("answer of the condition"+ans);
		boolean ans1=q<p && q<r && r<s;
		 // here q is less  than p and q is less than r and r is less than s,
         //expression1 false and exp2 and exp3 are true  so the given statement is false
		System.out.println("answer of the condition"+ans1);
		boolean ans2=q>p && q>r && r>s;
		//here q is greater than p,q is greater than r,r is greater than s
		//exp1 is true and exp2,exp3 are false so that statement is false	
		System.out.println("answer of the condition"+ans2);
		boolean answ3=q<p && q>r && q<s && r<s;
		//here q is less than p,and q is greater than r,q is less than s and r is less than s.
		//The given exp1,exp2 are false,exp3 and exp4 are there is an error at q<p,q>r sothat it is false 
		System.out.println("answer of the condition"+answ3);
		System.out.println("to show bitwise AND operator");//bitwise operator
		System.out.println("answer of the condition"+(p&q));//here value is zero
		System.out.println("answer of the condition"+(q&r));//here value is 20
		System.out.println("answer of the condition"+(q&s));//after calculating value becomes zero
		System.out.println("answer of the condition"+(r&s));//r=11110,s=101000


	}

}
