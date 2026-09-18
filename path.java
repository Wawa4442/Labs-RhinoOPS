PS C:\code\BlackBox\inventory-pos-service>  & 'C:\Users\horopeza\.vscode\extensions\redhat.java-1.56.0-win32-x64\jre\21.0.12.1-win32-x86_64\bin\java.exe' '@C:\Users\horopeza\AppData\Local\Temp\cp_e5j0kl908b47odd8eoy1xvcwc.argfile' 'com.masterclass.inventory.InventoryPosApplication' 

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.5.6)

2026-09-07T12:31:19.273-06:00  INFO 34608 --- [inventory-pos-service] [           main] c.m.inventory.InventoryPosApplication    : Starting InventoryPosApplication using Java 21.0.12.1 with PID 34608 (C:\code\BlackBox\inventory-pos-service\target\classes started by horopeza in C:\code\BlackBox\inventory-pos-service)
2026-09-07T12:31:19.277-06:00  INFO 34608 --- [inventory-pos-service] [           main] c.m.inventory.InventoryPosApplication    : No active profile set, falling back to 1 default profile: "default"
2026-09-07T12:31:20.432-06:00  WARN 34608 --- [inventory-pos-service] [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.support.BeanDefinitionOverrideException: Invalid bean definition with name 'conventionErrorViewResolver' defined in class path resource [org/springframework/boot/webmvc/autoconfigure/error/ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration.class]: Cannot register bean definition [Root bean: class=null; scope=; abstract=false; lazyInit=null; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; fallback=false; factoryBeanName=org.springframework.boot.webmvc.autoconfigure.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration; factoryMethodName=conventionErrorViewResolver; initMethodNames=null; destroyMethodNames=[(inferred)]; defined in class path resource [org/springframework/boot/webmvc/autoconfigure/error/ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration.class]] for bean 'conventionErrorViewResolver' since there is already [Root bean: class=null; scope=; abstract=false; lazyInit=null; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; fallback=false; factoryBeanName=org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration; factoryMethodName=conventionErrorViewResolver; initMethodNames=null; destroyMethodNames=[(inferred)]; defined in class path resource [org/springframework/boot/autoconfigure/web/servlet/error/ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration.class]] bound.
2026-09-07T12:31:20.448-06:00  INFO 34608 --- [inventory-pos-service] [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2026-09-07T12:31:20.472-06:00 ERROR 34608 --- [inventory-pos-service] [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

The bean 'conventionErrorViewResolver', defined in class path resource [org/springframework/boot/webmvc/autoconfigure/error/ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration.class], could not be registered. A bean with that name has already been defined in class path resource [org/springframework/boot/autoconfigure/web/servlet/error/ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration.class] and overriding is disabled.

Action:

Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true

PS C:\code\BlackBox\inventory-pos-service>  c:; cd 'c:\code\BlackBox\inventory-pos-service'; & 'C:\Users\horopeza\.vscode\extensions\redhat.java-1.56.0-win32-x64\jre\21.0.12.1-win32-x86_64\bin\java.exe' '@C:\Users\horopeza\AppData\Local\Temp\cp_ei010vqify7lo4a2i63t2uk7n.argfile' 'com.masterclass.inventory.InventoryPosApplication' 

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.5.6)

2026-09-07T12:31:37.596-06:00  INFO 30148 --- [inventory-pos-service] [           main] c.m.inventory.InventoryPosApplication    : Starting InventoryPosApplication using Java 21.0.12.1 with PID 30148 (C:\code\BlackBox\inventory-pos-service\target\classes started by horopeza in C:\code\BlackBox\inventory-pos-service)
2026-09-07T12:31:37.598-06:00  INFO 30148 --- [inventory-pos-service] [           main] c.m.inventory.InventoryPosApplication    : No active profile set, falling back to 1 default profile: "default"
2026-09-07T12:31:38.578-06:00  WARN 30148 --- [inventory-pos-service] [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.support.BeanDefinitionOverrideException: Invalid bean definition with name 'conventionErrorViewResolver' defined in class path resource [org/springframework/boot/webmvc/autoconfigure/error/ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration.class]: Cannot register bean definition [Root bean: class=null; scope=; abstract=false; lazyInit=null; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; fallback=false; factoryBeanName=org.springframework.boot.webmvc.autoconfigure.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration; factoryMethodName=conventionErrorViewResolver; initMethodNames=null; destroyMethodNames=[(inferred)]; defined in class path resource [org/springframework/boot/webmvc/autoconfigure/error/ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration.class]] for bean 'conventionErrorViewResolver' since there is already [Root bean: class=null; scope=; abstract=false; lazyInit=null; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; fallback=false; factoryBeanName=org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration; factoryMethodName=conventionErrorViewResolver; initMethodNames=null; destroyMethodNames=[(inferred)]; defined in class path resource [org/springframework/boot/autoconfigure/web/servlet/error/ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration.class]] bound.
2026-09-07T12:31:38.587-06:00  INFO 30148 --- [inventory-pos-service] [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2026-09-07T12:31:38.606-06:00 ERROR 30148 --- [inventory-pos-service] [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

The bean 'conventionErrorViewResolver', defined in class path resource [org/springframework/boot/webmvc/autoconfigure/error/ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration.class], could not be registered. A bean with that name has already been defined in class path resource [org/springframework/boot/autoconfigure/web/servlet/error/ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration.class] and overriding is disabled.

Action:

Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true