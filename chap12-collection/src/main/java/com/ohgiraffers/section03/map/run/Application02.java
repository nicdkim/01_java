package main.java.com.ohgiraffers.section03.map.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Application02 {
    public static void main(String[] args) {

        /*
        * Properties
        * HashMap을 구현하여 사용 용법이 거의 유사하지만
        * key 와 value 모두 문자열만 사용할 수 있는 자료구조이다.
        * 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다.
        * */

        Properties prop = new Properties();
        prop.setProperty("driver", "mysql.jdbc.driver.mysql");
        prop.setProperty("url", "localhost");
        prop.setProperty("user", "user");
        prop.setProperty("pass", "pass");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("driver.bat"), "jdbcDriver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
