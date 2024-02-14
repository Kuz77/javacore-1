# Устанавливаем базовый образ, содержащий JDK
FROM openjdk:latest
# Устанавливаем рабочую директорию внутри контейнера
WORKDIR /usr/src/app
# Копируем исходный код приложения внутрь контейнера
COPY ./src/main/java .
# Компилируем Java исходный код
#RUN javac -sourcepath . -d out ./java/javacore-1/src/main/java/Pack3/Program.java
RUN javac -sourcepath ./java -d out /java/javacore-1/src/main/java/Pack3/Program.java

#/java/javacore-1/src/main/java/Pack3/Program.java
#C:\java\javacore-1\src\main\java\Pack3



# Теперь рабочая директория - директория с файлами .class
WORKDIR /usr/src/app/out


#CMD java -classpath . javacore-1.src.main.java.Pack3.Program

ENTRYPOINT ["java","javacore-1.src.main.java.Pack3.Program"]