package asp;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {
	@Before("within(controller..*)")
	public void log() {
		//System.out.println("这是一个前置通知.");
	}
	@Around("within(controller..*)")
	public Object around(ProceedingJoinPoint p) throws Throwable {
		System.out.println("-----------------------------------------------------------");
		Date begin = new Date();
		String classname = p.getTarget().getClass().getName();
		String methodname = p.getSignature().getName();
		String message = String.format("开始时间%s,类名为%s的%s方法开始执行", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(begin),classname,methodname);
		System.out.println(message);
		Object obj = p.proceed();
		Date end = new Date();
		System.out.println("结束时间为:"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(end));
		System.out.println("耗时:"+(end.getTime()-begin.getTime())+"ms");
		System.out.println("-----------------------------------------------------------");
		return obj;
	}
}
