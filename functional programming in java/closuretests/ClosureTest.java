package closuretests;

public class ClosureTest {
    interface Process {
        void doProcess(int toPrint);
    }

    public static void main (String [] args  ) {
        final Integer j = 32;

        //Lambdas are not implemented as Anonymous functions in JAVA!
        Process add = (i) -> System.out.println ( i + j );
        add.doProcess(34);


        //ANONYMOUS function, (not the same as lambda in java)
        Process addAnon = new Process() {
            @Override
            public void doProcess(int toPrint) {
                System.out.println(toPrint+j);
                System.out.println(this); // this cant be used in lambda functions
            }
        };
        addAnon.doProcess(33);

    }

}


