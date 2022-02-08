package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {


//		 class Me {
//			String name ;
//			Long id ;
//
//
//			public String getName() {
//				return name;
//			}
//
//			public void setName(String name) {
//				this.name = name;
//			}
//
//			public Long getId() {
//				return id;
//			}
//
//			public void setId(Long id) {
//				this.id = id;
//			}
//		}
//
//		Map<Long, Me> m = new HashMap<Long, Me>();
//		Me a = new Me();
//		a.setId(1L);
//		a.setName("aaa");
//
//		Me b= new Me();
//		a.setId(2L);
//		a.setName("bbb");
//
//		m.put(1L, a);
//		m.put(2L, b);
//		System.out.println(m.values().toString());

		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
