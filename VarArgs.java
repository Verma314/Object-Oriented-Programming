import static java.lang.System.*;
class A {}

class VarArgs {
  static void printArray ( Object [] args ) {
    for ( Object obj : args)
     out.println(obj+" ");
    out.println();
    }
  public static void main (String [] args ) {
    printArray( new Object[] {new Integer(12), new Float(12.12), new Double(12.13)
    } );
    printArray( new Object[] {"one","two","three"} );
    printArray( new Object[] {new A(), new A(), new A()});
  }

}
