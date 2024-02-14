package Pack3;

/*


javac -sourcepath ./java -d out /java/javacore-1/src/main/java/Pack3/Program.java



C:\java\javacore-1\src\main>java -classpath ./out Pack3.Program
Here is your number: 4.
Here is your number: 0.
Here is your number: 4.
Here is your number: 1.


javadoc -encoding utf8 -d docs -sourcepath ./java -cp ./out -subpackages ru

https://www.docker.com/products/docker-desktop/
https://hub.docker.com/
 */

import Pack1.Calculator;
import Pack2.Decorator;

/**
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 */
public class Program {


    public static void main(String[] args) {

        int result = Calculator.add(2, 2);
        System.out.println(Decorator.decorate(result));
        result = Calculator.sub(2, 2);
        System.out.println(Decorator.decorate(result));
        result = Calculator.mul(2, 2);
        System.out.println(Decorator.decorate(result));
        result = Calculator.div(2, 2);
        System.out.println(Decorator.decorate(result));
    }

}
