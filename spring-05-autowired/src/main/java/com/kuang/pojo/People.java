package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People {
    /**
     * 说明: @Autowired 可以直接在属性上使用。 也可以在 set方法上使用。
     * 如果 required = false 说明这个对象可以为null，否则不允许为空
      */

    @Autowired(required = false)
    private Cat cat;

    @Autowired
    @Qualifier(value="dog222")   // 如果在beans.xml中有多个，我们这里可以人工指定个@Qualifier
    private Dog dog;

    private String name;

    //  上面加了@Autowired后，我们这里的几个set方法实际上也可以省略掉了
    public Cat getCat() {
        return cat;
    }

    // @Autowired 除了可以加在属性上 ， 也可以加在 set 方法这里
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
