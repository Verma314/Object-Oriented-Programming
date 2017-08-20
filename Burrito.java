import static java.lang.System.*;

public class Burrito  {

  Spiciness degree;
  public Burrito (Spiciness degree) {
    this.degree = degree;
  }

  public void describe() {
    switch (degree){
      case NOT: out.println("not"); break;
      case MILD:
      case MEDIUM: out.println("maybe"); break;
      case HOT:
      default: out.println("noooo");
    }
  }

  public static void main (String... args) {
    Burrito
      plain = new Burrito(Spiciness.NOT),
      greenChile = new Burrito(Spiciness.MILD),
      jalapeno = new Burrito(Spiciness.HOT);
    plain.describe();
    greenChile.describe();
    jalapeno.describe();
  }

}
