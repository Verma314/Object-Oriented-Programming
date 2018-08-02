package functional;

import java.util.List;

@FunctionalInterface
public interface StringToInt {
    int calculateLength(String s);
}
@FunctionalInterface
interface ListLength {
    int calculateLength(List s);
}
