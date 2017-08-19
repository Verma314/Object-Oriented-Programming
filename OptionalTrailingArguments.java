import static java.lang.System.*;

public class OptionalTrailingArguments {

  static void f( int required, String... trailing) {
    out.println("required: " + required);
    for ( String s : trailing)
      out.print(s+" ");
    out.println();
  }

  public static void main (String [] args ) {
    f(1,"one");
    f(2,"two","three");
    f(3,"y","z","xx");
    f(4,"dlfkas","adja","Sd","sasa","Asasas");

  }

}
