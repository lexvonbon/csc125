package practice;
import java.util.Collection;
import java.util.function.Function;
/**
 * Functional
 */
public class Functional {

    public static Collection<Object> map(Function<Object, Object> func, Collection<Object> iter) {
        Collection<Object> newIter = iter.getClass().getDeclaredConstructor().newInstance();
        if (iter.isEmpty()) {
            return(newIter);
        }
        for (Object item: iter) {
            newIter.add(func.apply(item));
        }
        return(newIter);
    }
}