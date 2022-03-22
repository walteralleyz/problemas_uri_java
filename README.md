## URI JAVA SOLUTIONS
*Some URI Java solutions*

Before execute this application you need, at least, Java 14 installed (JDK and JRE).
<br />
Then type at console (if u don't use any IDE):
~~~
$ javac -d ./build ./src/alleyz/problemas_uri/*.java ./src/alleyz/problemas_uri/challenges/*.java
$ cd ./build
$ jar cvf Main.jar *
~~~
After compile the project, open the jar/META-INF/MANIFEST.MF and modify the content.
<br/>
Add these lines:
> Class-Path: .

> Main-Class: com.alleyz.problemas_uri.Main

Then, execute the jar with the command:
~~~
$ java -jar Main.jar --cn=CHALLENGE-NUMBER
~~~
Where `CHALLENGE-NUMBER` is the number of the URI challenge, which can be found in the list below.

- [x] 1024 - Criptografia
- [x] 1120 - Revisão de Contrato
- [x] 1168 - Led
