import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bean.EchoBean;


public class EchoBeanTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("echo.xml");
		
		// 빈 접근방법 3가지
		EchoBean bean = (EchoBean)ctx.getBean("echo");// 리턴타입이 object이므로 형변환 해줘야함
		System.out.println(bean.sayEcho("홍길동"));
		
		EchoBean bean2 = ctx.getBean(EchoBean.class);
		System.out.println(bean2.sayEcho("이순신"));
		
		EchoBean bean3 = ctx.getBean("echo", EchoBean.class);
		System.out.println(bean3.sayEcho("강감찬"));
		
	}// end main

}// end class
