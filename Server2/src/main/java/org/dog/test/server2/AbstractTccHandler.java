package top.dogtcc.test.server2;

import org.aspectj.lang.ProceedingJoinPoint;
import top.dogtcc.core.annotation.DogCallAnnotation;
import top.dogtcc.core.annotation.TccHandler;
import top.dogtcc.core.entry.DogCall;
import top.dogtcc.core.entry.DogTcc;
import org.springframework.stereotype.Component;

@Component
public class AbstractTccHandler extends TccHandler {


    public void cancel(Object[] args) {
        String value = (String) args[0];
        System.out.println("cancel tcc:"+value);
    }

    public void confirm(Object[] args) {
        String value = (String) args[0];
        System.out.println("confirm tcc:"+value);
    }

    @DogCallAnnotation(Name = "insertMysql", TccHandlerClass = AbstractTccHandler.class)
    public String insertMysql(String value){
        System.out.println("insertMysql");
        return  value;
    }




}
