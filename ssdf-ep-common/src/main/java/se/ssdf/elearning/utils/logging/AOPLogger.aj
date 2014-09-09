package se.ssdf.elearning.utils.logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.aspectj.lang.JoinPoint.StaticPart;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AOPLogger {

    @Around(value = "execution(@se.ssdf.elearning.utils.logging.LogMethodCall * *(..)) && @annotation(LogMethodCall)", argNames = "pjp, logMethodCall")
    public Object logMethod(ProceedingJoinPoint pjp, LogMethodCall logMethodCall) throws Throwable {
        Level level = Level.toLevel(logMethodCall.level());
        StaticPart sp = pjp.getStaticPart();
        String classname = sp.getSignature().getDeclaringTypeName();
        Object[] args = pjp.getArgs();
        boolean enabledForLevel = LogManager.getLogger(classname).isEnabled(level);

        if (enabledForLevel && logMethodCall.entry()) {
            String enterMsg = "ENTERING: "
                    + logMethodCall.prefix()
                    + pjp.getSignature().toShortString()
                    + logMethodCall.suffix();
            String parmsMsg = "\tPARAMS: " + Arrays.toString(args);
            LogManager.getLogger(classname).log(level, enterMsg);
            LogManager.getLogger(classname).log(level, parmsMsg);
        }
        Object methodResult = pjp.proceed();
        if (enabledForLevel && logMethodCall.exit()) {
            String exitMsg = "EXITING: "
                    + logMethodCall.prefix()
                    + pjp.getSignature().toShortString()
                    + logMethodCall.suffix();
            String rtrnMsg = "\tRETURNING: "
                    + (methodResult == null ? "null" : methodResult.toString());
            LogManager.getLogger(classname).log(level, exitMsg);
            LogManager.getLogger(classname).log(level, rtrnMsg);
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