package practice;
import java.util.Collection;
import java.util.function.Function;
/**
 * Functional
 */
public class Functional {

    public static Collection<R> map(Function<T,R> func, Collection<T> iter) {
        Collection<R> newIter = new Collection<R>();
        if (iter.isEmpty()) {
            return(newIter);
        }
        for (T item: iter) {
            newIter.add(func.apply(item));
        }
        return(newIter);
    }
}