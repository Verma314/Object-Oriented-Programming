import static java.lang.System.*;

public class VarargType {
  static void f (Character... args) {
    out.println(args.getClass());
    for (Character i : args)
      out.print(i+ " ");
    out.println();
  }
  static void f (Integer... args) {
    out.println(args.getClass());
    for ( Integer i : args)
      out.print( i+ " ");
    out.println();
  }

  public static void main(String... args ) {
    f('a','b','c');
    f('a');
    f(1,2,3,4,4,5,5,5,5,5,5,5);

  }

}
