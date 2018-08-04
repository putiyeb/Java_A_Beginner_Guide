javac -d appmodules/appfuncs appsrc/appfuncs/appfuncs/simplefuncs/SimpleMathFuncs.java appsrc/appfuncs/module-info.java

javac --module-path appmodules -d appmodules/appstart appsrc/appstart/module-info.java appsrc/appstart/appstart/mymodappdemo/MyModAppDemo.java

java --module-path appmodules -m appstart/appstart.mymodappdemo.MyModAppDemo




Exception in thread "main" java.lang.IllegalAccessError: class appstart.mymodappdemo.MyModAppDemo (in module appstart) cannot access class appfuncs.simplefuncs.SimpleMathFuncs (in module appfuncs) because module appfuncs does not export appfuncs.simplefuncs to module appstart
	at appstart/appstart.mymodappdemo.MyModAppDemo.main(MyModAppDemo.java:7)



qualified export

javac --module-path appmodules -d appmodules/appfuncs appsrc/appfuncs/appfuncs/simplefuncs/SimpleMathFuncs.java appsrc/appfuncs/module-info.java 
$ java --module-path appmodules -m appstart/appstart.mymodappdemo.MyModAppDemo


error: in multi-module mode, the output directory cannot be an exploded module

just remove the module directory and recompile


