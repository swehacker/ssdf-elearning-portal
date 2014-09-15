package se.ssdf.elearning.utils.logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.aspectj.lang.JoinPoint.StaticPart;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

@Aspect
public class AOPLogger {

    @Around(value = "execution(* *(..)) && @annotation(LogMethodCall)", argNames = "LogMethodCall")
    public Object logMethod(ProceedingJoinPoint pjp, LogMethodCall logMethodCall) throws Throwable {
        Level level = Level.toLevel(logMethodCall.level());
        StaticPart sp = pjp.getStaticPart();
        String classname = sp.getSignature().getDeclaringTypeName();
        Object[] args = pjp.getArgs();

        String eMsg = logMethodCall.prefix()
                + pjp.getSignature().toShortString()
                + logMethodCall.suffix()
                + Arrays.toString(args);

        if (logMethodCall.entry()) {
            LogManager.getLogger(classname).log(level, "ENTERING: " + eMsg);
        }
        Object methodResult = pjp.proceed();

        if (logMethodCall.exit()) {
            LogManager.getLogger(classname).log(level, "EXITING : " + eMsg);
        }

        return methodResult;
    }
}