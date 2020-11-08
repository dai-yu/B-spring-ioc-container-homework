虽然@Component和@Bean作用都是将一个bean放进ioc容器里，但两者的使用场景不一样。
@Component是要加在源码上的，而@Bean是写在一个Java Configuration类中的。
如果我要想容器添加的bean不是我自己写的一个类，而是第三方或jdk中的类，那我就不能
使用@Component，而只能使用@Bean了。  
在某些情况下，在创建一个类时，可能需要编写一些额外的代码去完成操作，这时候在有@Bean的方法
中添加这些代码是非常方便的，而使用@Component却不行。