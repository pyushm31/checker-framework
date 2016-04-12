import java.lang.annotation.*;
import org.checkerframework.checker.lock.qual.LockHeld;
import org.checkerframework.framework.qual.PostconditionAnnotation;
import org.checkerframework.framework.qual.PreconditionAnnotation;

// The JCIP annotation can be used on a field (in which case it corresponds
// to the Lock Checker's @GuardedBy annotation) or on a method (in which case
// it is a declaration annotation corresponding to the Lock Checker's @Holding
// annotation).

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.CONSTRUCTOR })
@PreconditionAnnotation(qualifier = LockHeld.class)
@PostconditionAnnotation(qualifier = LockHeld.class)
public @interface GuardedBy {
    /**
     * The Java expressions that need to be {@link LockHeld}.
     *
     * @see <a
     *      href="http://types.cs.washington.edu/checker-framework/current/checker-framework-manual.html#java-expressions-as-arguments">Syntax
     *      of Java expressions</a>
     */
    String[] value();
}
