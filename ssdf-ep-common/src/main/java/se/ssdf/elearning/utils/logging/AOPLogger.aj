package se.ssdf.elearning.utils.logging;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint.StaticPart;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

@Aspect
public class AOPLogger {

    @Around(value = "execution(@se.ssdf.elearning.utils.logging.LogMethodCall * *(..)) && @annotation(loggingMethodCall)", argNames = "loggingMethodCall")
    public Object logMethod(ProceedingJoinPoint pjp, LogMethodCall loggingMethodCall) throws Throwable {
        Level level = Level.toLevel(loggingMethodCall.level());
        StaticPart sp = pjp.getStaticPart();
        String classname = sp.getSignature().getDeclaringTypeName();
        Object[] args = pjp.getArgs();
        boolean enabledForLevel = Logger.getLogger(classname).isEnabledFor(level);

        if (enabledForLevel && loggingMethodCall.entry()) {
            String enterMsg = "ENTERING: "
                    + loggingMethodCall.prefix()
                    + pjp.getSignature().toShortString()
                    + loggingMethodCall.suffix();
            String parmsMsg = "\tPARAMS: " + Arrays.toString(args);
            Logger.getLogger(classname).log(level, enterMsg);
            Logger.getLogger(classname).log(level, parmsMsg);
        }
        Object methodResult = pjp.proceed();
        if (enabledForLevel && loggingMethodCall.exit()) {
            String exitMsg = "EXITING: "
                    + loggingMethodCall.prefix()
                    + pjp.getSignature().toShortString()
                    + loggingMethodCall.suffix();
            String rtrnMsg = "\tRETURNING: "
                    + (methodResult == null ? "null" : methodResult.toString());
            Logger.getLogger(classname).log(level, exitMsg);
            Logger.getLogger(classname).log(level, rtrnMsg);
        }
        return methodResult;
    }

    /**
    @Before("get(@FieldLog * *) && @annotation(fieldLogging)")
    public void logFieldRead(JoinPoint jp, FieldLog fieldLogging) {
        Level level = Level.toLevel(fieldLogging.level());
        StaticPart sp = jp.getStaticPart();
        String classname = sp.getSignature().getDeclaringTypeName();
        if (Logger.getLogger(classname).isEnabledFor(level) && fieldLogging.read()) {
            String readMsg = "READING: "
                    + fieldLogging.prefix()
                    + jp.getSignature().toShortString()
                    + fieldLogging.suffix();
            Logger.getLogger(classname).log(level, readMsg);
        }
    }

    @Before("set(@FieldLog * *) && @annotation(fieldLogging) && args(newval)")
    public void logFieldWrite(JoinPoint jp, FieldLog fieldLogging, Object newval) {
        Level level = Level.toLevel(fieldLogging.level());
        StaticPart sp = jp.getStaticPart();
        String classname = sp.getSignature().getDeclaringTypeName();
        if (Logger.getLogger(classname).isEnabledFor(level) && fieldLogging.write()) {
            String writeMsg = "ASSIGNING: "
                    + fieldLogging.prefix()
                    + jp.getSignature().toShortString()
                    + " = "
                    + "'" + (newval == null ? "null" : newval.toString()) + "'"
                    + fieldLogging.suffix();
            Logger.getLogger(classname).log(level, writeMsg);
        }
    }
    */
}