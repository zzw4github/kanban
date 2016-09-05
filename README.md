[info] Done updating.
[info] Compiling 5 Scala sources to E:\kanban\target\scala-2.10\classes...
[info] 'compiler-interface' not yet compiled for Scala 2.10.0. Compiling...
error: error while loading CharSequence, class file 'C:\Program Files\Java\jdk1.
8.0_102\jre\lib\rt.jar(java/lang/CharSequence.class)' is broken
(class java.lang.RuntimeException/bad constant pool tag 15 at byte 1501)
error: error while loading Comparator, class file 'C:\Program Files\Java\jdk1.8.
0_102\jre\lib\rt.jar(java/util/Comparator.class)' is broken
(class java.lang.RuntimeException/bad constant pool tag 15 at byte 5003)
error: error while loading AnnotatedElement, class file 'C:\Program Files\Java\j
dk1.8.0_102\jre\lib\rt.jar(java/lang/reflect/AnnotatedElement.class)' is broken
(class java.lang.RuntimeException/bad constant pool tag 15 at byte 2713)
error: error while loading Arrays, class file 'C:\Program Files\Java\jdk1.8.0_10
2\jre\lib\rt.jar(java/util/Arrays.class)' is broken
(class java.lang.RuntimeException/bad constant pool tag 15 at byte 12813)
C:\Users\infosea\AppData\Local\Temp\sbt_3f7c6c09\xsbt\ExtractAPI.scala:479: erro
r: java.util.Comparator does not take type parameters
  private[this] val sortClasses = new Comparator[Symbol] {
                                      ^
5 errors found
[error] (compile:compileIncremental) Error compiling sbt component 'compiler-int
erface'
[error] Total time: 1 s, completed 2016-9-5 14:41:57

应用可以可以通过
sbt 
container:start命令来启动

注意在应用启动之前要使用java -cp ~/.ivy2/cache/com.h2database/h2/jars/h2*.jar org.h2.tools.Server命令来启动h2数据库