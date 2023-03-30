package kr.hs.study.config;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigClass {

    @Bean   // 생성자 DI
    public TestBean1 java1() {
        TestBean1 t1 = new TestBean1(1, "spring1", new DataBean1());
        return t1;
    }

    @Bean   // Setter DI
    public TestBean1 java2() {
        TestBean1 t2 = new TestBean1();
        t2.setData1(2);
        t2.setData2("spring2");
        t2.setData3(new DataBean1());
        return t2;
    }

}
