Actual flow of this MVC project
Follow the steps :

created ane dynamic web project  (mvc)
create index.jsp file in webapp folder
Edit web.xml file & set welcome-file is "index.jsp"
    src/main/webapps/index.jsp

After that create created a FrontController.java file 
    java resources/src/main/java/com.controller/FC.java

Then created a new folder in webapps---pages
  In pages folder created addDept.jsp file
  Then create add_dept_bean.java file
      java resources/src/main/java/com.bean/add_dept_bean.java
  Then create add_dept_bean_store.jsp
      src/main/webapps/add_dept_bean_store.jsp

Then create 2 java files
    java resources/src/com.service/Department_Service.java
    java resources/src/com.dal/AddDept_DAL.java

Also paste the .jar files into lib folder
    src/main/webapp/WEB-INF/lib--->conn.jar
                               --->mysql_connector.jar
