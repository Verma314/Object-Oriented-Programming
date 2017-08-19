import static java.lang.System.*;

public class NewVarArgs {

  static void printArray (Object... args) {
    for ( Object obj : args)
      out.print(obj+" ");
    out.println();
  }

  public static void main (String[] args) {
    printArray(new Double(12.12), new Float(1.11), new String("hey"));
    printArray( new A(), new A(), new A() );
    printArray( (Object[]) new Integer[]{1,2,3,4} );
  }
  
}
