import static java.lang.System.*;

enum Spiciness {
  NOT, MILD, MEDIUM, HOT, FLAMING
}

public class SimpleEnumUse {
  public static void main (String... args) {
    Spiciness howHot = Spiciness.MEDIUM;
    out.println(howHot);
  }
}
