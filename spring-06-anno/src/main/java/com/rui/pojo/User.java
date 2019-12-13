package com.rui.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.rui.pojo.User"/>
//@Component 组件
@Component
@Scope("prototype")
public class User {
    //相当于 <property name="name" value="尹锐"></property>

    @Value("尹锐")
    public String name;
}
