package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        TestBean1 obj1 = ctx.getBean("java1", TestBean1.class);
        System.out.println("data1: "+obj1.getData1());
        System.out.println("data2: "+obj1.getData2());
        System.out.println("data3: "+obj1.getData3());

        TestBean1 obj2 = ctx.getBean("java2", TestBean1.class);
        System.out.println("\ndata1: "+obj2.getData1());
        System.out.println("data2: "+obj2.getData2());
        System.out.println("data3: "+obj2.getData3());

        ctx.close();
    }
}