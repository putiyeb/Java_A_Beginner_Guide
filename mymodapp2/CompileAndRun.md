$ javac --module-source-path appsrc -d appmodules appsrc/appstart/appstart/mymodappdemo/MyModAppDemo.java 
$ java --module-path appmodules -m appstart/appstart.mymodappdemo.MyModAppDemo
2 is a factor of 10
1
1

  
  appsrc/appstart/appstart/mymodappdemo/MyModAppDemo.java:4: error: package appsupport.supportfuncs is not visible
import appsupport.supportfuncs.*;
                 ^
  (package appsupport.supportfuncs is declared in module appsupport, but module appstart does not read it)
1 error


when remove the implied dependence, transitive keyword, it will throw the error;


appsrc/appstart/appstart/mymodappdemo/MyModAppDemo.java:4: error: package appsupport.supportfuncs is not visible
import appsupport.supportfuncs.*;
                 ^
  (package appsupport.supportfuncs is declared in module appsupport, which does not export it to module appstart)
                   
using the qualified exports to grant access to the appfuncs module 
