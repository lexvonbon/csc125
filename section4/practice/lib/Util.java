package lib;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.Collection;
import java.lang.Object;
import java.util.Optional;

/**
 * Util
 */
public class Util {
  public static Optional<Collection<?>> filter(Predicate<Object> func, Collection<?> input) {
    Optional<Collection<?>> list = Optional.ofNullable(input);
    list.get().removeIf(func);
    return(list);
  }
  public static Optional<Object> map(Function<? extends Object, Object> func, Object input) {
    if (input.getClass().isArray() || input.getClass().asSubclass(Collection<?>)) {
      Object newObh = Object.class.asSubclass(input);
      for (Object item: input) {
        func(item);
      }
    } else if (input.getClass().isPrimitive()) {
      return(func(item));
    }
    return(new Object());
  }
}